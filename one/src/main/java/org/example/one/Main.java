package org.example.one;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        // Get Input file from CLI Arguments
        var filePath = args[0];

        // Parse Input Data Points to a List of Integers
        var output = new ArrayList<Integer>();

        ObjectMapper mapper = new ObjectMapper();
        var data = mapper.readValue(
                Files.readAllBytes(
                        Path.of(filePath)),
                ArrayList.class);

        for (var item : data) {
            output.add((Integer) item);
        }

        // Sort the Data points in ascending order
        System.out.println(output);
        Collections.sort(output);
        System.out.println(output);

        var map = new HashMap<Integer, Integer>();
        output.forEach((item) ->  {
            map.put(item, Collections.frequency(output, item));
        });


        StringBuilder outputStr = new StringBuilder("Number\t| Frequency\n");
        for (var item: map.keySet()) {
            outputStr.append(String.format("%6d\t| %9d\n", item, map.get(item)));
        }
        System.out.println(outputStr);;
    }
}