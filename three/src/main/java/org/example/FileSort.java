package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileSort {
    List<String> lines;

    FileSort() {
        lines = new ArrayList<>();
    }

    public void parseFileContent(String filePath) throws IOException {
        var reader = new BufferedReader(new FileReader(filePath));
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            lines.add(line);
            line = reader.readLine();
        }
        reader.close();
    }

    public void writeSortedLines(String filePath) throws IOException {
        var writer = new BufferedWriter(new FileWriter(filePath));
        Collections.sort(lines);
        System.out.println(lines);
        for (var line : lines) {
            writer.write(line);
            writer.newLine();
        }
        writer.close();
    }
}
