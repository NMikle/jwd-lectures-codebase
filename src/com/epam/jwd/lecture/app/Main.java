package com.epam.jwd.lecture.app;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {

    public static void main(String[] args) {
        final File helloFile = new File("helloFile.f");
        try {
            System.out.print(String.join(System.lineSeparator(), Files.readAllLines(helloFile.toPath())));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
