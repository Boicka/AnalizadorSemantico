/*
Escritor.java
Instituto Tecnológico de León
Ingenieria en sistemas computacionales
Lenguajes y autómatas 1
Lunes y Miercoles 8:45 - 10:25
Viernes 8:45 - 9:35
Alumnos: Héctor Medel Negrete
         Juan de Dios Yebra Navarro
Version 1.0
 */
package Escribir;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escritor {
    private String path;
    private FileWriter writer;

    public Escritor(String p) {
        try {
            path = p;
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            writer = new FileWriter(path, false);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void write(String cadena) {
        try {
            writer.write(cadena + "\n");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void close() {
        try {
            writer.close();
        } catch (IOException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
}
