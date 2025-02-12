package com.campusdual.classroom;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class Exercise31 {
    public static void main(String[] args) {
        Path filePath = Paths.get("src/main/resources/lorem.txt"); // Ruta del archivo

        try {
            Files.lines(filePath).forEach(System.out::println); // Lee y muestra cada línea
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
