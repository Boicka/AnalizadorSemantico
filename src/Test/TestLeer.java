/*
TestLeer.java
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

import Lectura.Lector;

public class TestLeer {

    public static void main(String[] args) {
        Lector app = new Lector("src/Lectura/datos.txt");

        for (int i = 0; i < 9; i++) {
//            System.out.println(app.leer());
            System.out.println(app.obtenerLinea()+ " " + app.leer());
        }  
    }
}