import java.io.*;
import java.nio.file.*;

public class CopyFileWithReplacement {
    public static void main(String[] args) {
        //setting up paths for source and destination files
        //"source.txt" should exist in the same directory as the program
        //replace "source.txt" and "destination.txt" with desired filenames if needed
        Path sourcePath = Paths.get("source.txt");
        Path destinationPath = Paths.get("destination.txt");

        //using try-with-resources for automatic resource management
        try (BufferedReader reader = Files.newBufferedReader(sourcePath);
             BufferedWriter writer = Files.newBufferedWriter(destinationPath)) {

            //reading lines from the source file, replacing spaces with dashes, and writing to the destination file
            String line;
            while ((line = reader.readLine()) != null) {
                //replacing spaces with dashes in the current line
                String modifiedLine = line.replace(" ", "-");

                //writing the modified line to the destination file
                writer.write(modifiedLine);
                writer.newLine();
            }

            //informing the user that the process was successful
            System.out.println("File has been successfully copied with spaces replaced by dashes.");

        } catch (IOException e) {
            //displaying an error message if an issue occurs during file processing
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
