package octopus;

import org.apache.ftpserver.FtpServerConfigurationException;
import org.apache.ftpserver.ftplet.FtpException;

import octopus.server.ftpserver.OctopusFTPServer;
import octopus.server.restServer.OctopusRestServer;

public class OctopusMain {

    static OctopusMain main;


    OctopusFTPServer ftpServer;

    public static void main(String[] args) throws java.lang.Exception
    {
        main = new OctopusMain();
        main.startFTPServer();
        main.startRestServer();
        System.out.println("Server started successfully");
    }

    private void startFTPServer()
    {
		ftpServer = new OctopusFTPServer();
		try {
			ftpServer.start();
		} catch (FtpException| FtpServerConfigurationException e) {
			System.err.println("Error starting Octopus");
			System.err.println(e.getMessage());
			System.exit(-1);
		}
	}

    private void startRestServer()
    {
		OctopusRestServer.start();
	}

}
