package org.example.javabits;

import com.google.common.io.Files;

public class FileUtil {
    public static String getFileExtension(String filePath) {
        return Files.getFileExtension(filePath);
    }
}
