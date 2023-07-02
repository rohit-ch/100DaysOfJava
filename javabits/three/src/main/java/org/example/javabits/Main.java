package org.example.javabits;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            throw new RuntimeException("invalid number of arguments");
        }

        var inputFile = args[0];
        var outputFile = args[1];
        var fileSorter = new FileSort();
        try {
            fileSorter.parseFileContent(inputFile);
            fileSorter.writeSortedLines(outputFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}