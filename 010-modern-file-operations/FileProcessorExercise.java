import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Modern File Operations Exercise
 *
 * Key Features Demonstrated:
 * - Files.readString/writeString
 * - Files.mismatch
 * - Path API
 * - Modern exception handling
 */
public class FileProcessorExercise {

    static class ConfigFileProcessor {
        private final Path configDir;

        public ConfigFileProcessor(String directory) {
            this.configDir = Path.of(directory);
            // Create directory if it doesn't exist
            try {
                Files.createDirectories(configDir);
            } catch (IOException e) {
                System.err.println("Failed to create directory: " + e.getMessage());
            }
        }

        // TODO 1: Read config file content using Files.readString
        public String readConfig(String filename) throws IOException {
            return null; // Implement this
        }

        // TODO 2: Write config file using Files.writeString
        public void writeConfig(String filename, String content) throws IOException {
            // Implement this
        }

        // TODO 3: Compare two config files using Files.mismatch
        public boolean areConfigsIdentical(String file1, String file2) throws IOException {
            return false; // Implement this
        }

        // TODO 4: Backup config file with timestamp
        public void backupConfig(String filename) throws IOException {
            // Implement this
        }
    }

    public static void main(String[] args) {
        ConfigFileProcessor processor = new ConfigFileProcessor("configs");

        try {
            // TODO 5: Test file operations
            // Write two config files app.config and app2.configa

            // content of first file:
            //        server.port=8080
            //        db.url=localhost
            //        db.name=myapp
            // content of second file:
            //        server.port=8081
            //        db.url=localhost
            //        db.name=myapp2

            //  Use text blocks we learned earlier to write the content

            // read and print the contents of at least one file to STDOUT

            // TODO 6: Demonstrate file comparison

            // TODO 7: Show backup functionality

        } catch (IOException e) {
            System.err.println("File operation failed: " + e.getMessage());
        }
    }
}
