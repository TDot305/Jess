package octopus.server.gremlinShell;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import octopus.server.gremlinShell.io.OctopusClientReader;
import octopus.server.gremlinShell.io.OctopusClientWriter;
import octopus.server.shellmanager.OctopusShellManager;

public class ShellRunnable implements Runnable {

	private ServerSocket serverSocket;
	private OctopusGremlinShell shell;
	private Socket clientSocket;
	private OctopusClientWriter clientWriter;
	private OctopusClientReader clientReader;

	private boolean listening = true;

	public ShellRunnable(OctopusGremlinShell shell) throws IOException {
		this.shell = shell;
		createLocalListeningSocket();
	}

	@Override
	public void run() {

		try {
			processClients();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void createLocalListeningSocket() throws IOException {
		InetAddress bindAddr = InetAddress.getLoopbackAddress();
		serverSocket = new ServerSocket(shell.getPort(), 10, bindAddr);
	}

	//This locks the db
	private void processClients() throws IOException {
		System.out.println("Opening new shell...");
		while (listening) {
			try {
				acceptNewClient();
				closeListeningSocket();

				markShellAsOccupied();
				handleClient();
				markShellAsFree();

				createLocalListeningSocket();
			} catch (IOException e) {
				System.out.println("IOException when handling client: "+ e.getMessage());
			}

		}
		//This should happen automatically or must be triggered manually by running the "quit" command, e.g. as Gremlin query
		OctopusShellManager.destroyShell(shell.getPort());
		serverSocket.close();
		System.out.println("Socket closed and shell destroyed...");
	}

	private void markShellAsOccupied() {
		shell.markAsOccupied();
	}

	private void markShellAsFree() {
		shell.markAsFree();
	}

	private void closeListeningSocket() throws IOException {
		serverSocket.close();
	}

	private void acceptNewClient() throws IOException {
		clientSocket = serverSocket.accept();
		initClientWriter();
		initClientReader();
	}

	private void initClientReader() throws IOException {
		InputStream in = clientSocket.getInputStream();
		clientReader = new OctopusClientReader(new InputStreamReader(in));
	}

	private void initClientWriter() throws IOException {
		OutputStream out = clientSocket.getOutputStream();
		clientWriter = new OctopusClientWriter(new OutputStreamWriter(out));
		clientWriter.setGraph(shell.getGraph());
	}

	private void handleClient() throws IOException {

		String message;
		while ((message = clientReader.readMessage()) != null) {
			if (message.equals("quit")) {
				prepareForShutdown();
				break;
			} else if (message.equals("toggle_json")) {
				clientWriter.toggleJSONOutput();
				clientWriter.writeResult("toggled");
				continue;
			}

			evaluteOnShell(message);
		}
		clientSocket.close();
	}

	private void evaluteOnShell(String message) throws IOException {
		Object evalResult;
		try {
			evalResult = shell.execute(message);
			clientWriter.writeResult(evalResult);
		} catch (Exception ex) {
			String errorMessage = ex.getMessage();
			if (errorMessage != null)
				clientWriter.writeResult(errorMessage);
			else
				clientWriter.writeResult(ex.toString());
		}
	}

	private void prepareForShutdown() throws IOException {
		listening = false;
		clientWriter.writeResult("bye");
		shell.shutdownDBInstance();
	}
}
