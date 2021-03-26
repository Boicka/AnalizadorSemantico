/*
Lector.java
Instituto Tecnológico de León
Ingenieria en sistemas computacionales
Lenguajes y autómatas 1
Lunes y Miercoles 8:45 - 10:25
Viernes 8:45 - 9:35
Alumnos: Héctor Medel Negrete
         Juan de Dios Yebra Navarro
Version 1.0
 */
package Lectura;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lector {

    private final String archivo;
    private String linea;
    private int index;

    public Lector(String path) {
        archivo = path;
        index = 1;
    }
    
    public String leer(){
        try{
        Scanner sc = new Scanner(new FileInputStream(archivo));
        
            for (int i = 0; i < index; i++) {
                if(sc.hasNext()){
                    linea = sc.nextLine();
                }else{
                    linea = null;
                    return linea;
                }
            }
        }catch(FileNotFoundException fnfe){
            System.out.println("El archivo no pudo ser encontrado");
        }
        index ++;
        return linea;
    }
    
    public int obtenerLinea(){
        int numLinea;
        numLinea = index-1;
        return numLinea;
    }
}