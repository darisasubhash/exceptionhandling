package com.checkedexceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class IOExceptionExample {
    public static void main(String[] args) {

        try {
            File file = File.createTempFile("test", ".txt");
            FileReader reader = new FileReader(file);
            reader.close();
            reader.read();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}
