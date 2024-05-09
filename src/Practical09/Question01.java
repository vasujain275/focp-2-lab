package Practical09;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Question01 {
    public static void main(String[] args) {
        String fileName = "Vansh23CSU330.txt";
        String content = "My Roll No. is 23CSU330 and I am Vansh.";

        // Write to file
        writeFile(fileName, content);

        // Read from file
        String fileContent = readFile(fileName);
        System.out.println("File content: " + fileContent);

        // Update file
        String updatedContent = fileContent.replace("23CSU330", "23CSU347");
        updateFile(fileName, updatedContent);

        // Read updated content
        String updatedFileContent = readFile(fileName);
        System.out.println("Updated file content: " + updatedFileContent);

        // Delete file
        deleteFile(fileName);
        System.out.println("File deleted successfully.");
    }

    public static void writeFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }

    public static String readFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
        return content.toString();
    }

    public static void updateFile(String fileName, String newContent) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(newContent);
            writer.close();
            System.out.println("File updated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while updating the file.");
            e.printStackTrace();
        }
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}

