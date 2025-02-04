package octopus.server.projectmanager;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.Map;
import octopus.OctopusEnvironment;
import octopus.api.projects.OctopusProject;
import octopus.api.projects.ProjectManager;
import octopus.server.database.titan.TitanLocalDatabaseManager;

public class OctopusProjectManager {

	private static Path projectsDir;
	private static Map<String, OctopusProject> nameToProject = new HashMap<String, OctopusProject>();
	private static boolean initialized = false;

	static {
		try {
			initialize(OctopusEnvironment.PROJECTS_DIR);
		} catch (IOException e) {
			throw new RuntimeException("Error initializing OctopusProjectManager");
		}
	}

	public static void initialize(Path projectDir) throws IOException {
		if (initialized)
			return;

		setProjectDir(projectDir);
		initialized = true;
	}

	public static void setProjectDir(Path newProjectsDir) throws IOException {
		if (!newProjectsDir.isAbsolute()) {
			newProjectsDir = newProjectsDir.toAbsolutePath();
		}
		projectsDir = newProjectsDir.normalize();
		openProjectsDir();
		loadProjects();
	}

	private static void openProjectsDir() throws IOException {
		if (Files.notExists(projectsDir)) {
			Files.createDirectories(projectsDir);
		}
	}

	private static void loadProjects() throws IOException {
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(projectsDir)) {
			for (Path path : stream) {
				if (Files.isDirectory(path)) {
					loadProject(path);
				}
			}
		}
	}

	private static void loadProject(Path projectDir) throws IOException {
		String projectName = projectDir.getFileName().toString();
		OctopusProject newProject = createOctopusProjectForName(projectName);
		//System.out.println("Adding project to map: " + projectName);
		nameToProject.put(projectName, newProject);
	}

	public static boolean doesProjectExist(String name) {
		return nameToProject.containsKey(name);
	}

	public static OctopusProject getProjectByName(String name) {
		//System.out.println("requesting project: " + name);
		return nameToProject.get(name);
	}

	public static Path getPathToProject(String name) {
		if (projectsDir == null)
			throw new IllegalStateException("Error: projectDir not set");

		return Paths.get(projectsDir.toString(), name);
	}

	public static void create(String name) throws IOException {
		if (projectsDir == null)
			throw new IllegalStateException("Error: projectDir not set");

		if (doesProjectExist(name)) {
			System.out.println("Project already exists, trying to remove it");
			delete(name);
		}
		
		//Creates a new project and initializes its db
		OctopusProject project = createOctopusProjectForName(name);		
		TitanLocalDatabaseManager databaseManager = new TitanLocalDatabaseManager();
		databaseManager.initializeDatabaseForProject(project);

		//System.out.println("Adding project to map: " + name);		
		nameToProject.put(name, project);
		
	}

	public static void delete(String name) throws IOException {
		if (projectsDir == null)
			throw new IllegalStateException("Error: projectDir not set");

		deleteProjectWithName(name);
	}

	public static Iterable<String> listProjects() {
		return nameToProject.keySet();
	}

	private static OctopusProject createOctopusProjectForName(String name) throws IOException {
		Path pathToProject = getPathToProject(name);
		Files.createDirectories(pathToProject);

		OctopusProject newProject = new OctopusProject(name, pathToProject.toString());

		return newProject;
	}

	/**
	 * Removes the project with @name from disk, including the db. Also removes the project's name from the @nameToProject hasmap.
	 * Does not work if there are still shells alive that are connected to the project's db.
	 */
	private static void deleteProjectWithName(String name) throws IOException {
		removeDatabaseIfExists(name);
		deleteProjectFiles(name);
		nameToProject.remove(name);		
	}

	private static void deleteProjectFiles(String name) throws IOException {
		Path pathToProject = getPathToProject(name);
		Files.walkFileTree(pathToProject, new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				Files.delete(file);
				return FileVisitResult.CONTINUE;
			}

			@Override
			public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
				Files.delete(dir);
				return FileVisitResult.CONTINUE;
			}
		});
	}

	private static void removeDatabaseIfExists(String name) throws IOException {
		OctopusProject project = new ProjectManager().getProjectByName(name);
		TitanLocalDatabaseManager dbManager = new TitanLocalDatabaseManager();
		dbManager.deleteDatabaseForProject(project);
	}

}
