/*
TestAnalizador.java
Instituto Tecnológico de León
Ingenieria en sistemas computacionales
Lenguajes y autómatas 1
Lunes y Miercoles 8:45 - 10:25
Viernes 8:45 - 9:35
Alumnos: Héctor Medel Negrete
         Juan de Dios Yebra Navarro
Version 1.0
 */
package Test;

import Analizador.Analizador;

public class TestAnalizadorLexico {

    public static void main(String[] args) {
        Analizador app = new Analizador("src/Lectura/datos.txt");
        app.AnalizadorLexico();
    }
}