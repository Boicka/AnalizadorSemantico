/*
Token.java
Instituto Tecnológico de León
Ingenieria en sistemas computacionales
Lenguajes y autómatas 1
Lunes y Miercoles 8:45 - 10:25
Viernes 8:45 - 9:35
Alumnos: Héctor Medel Negrete
         Juan de Dios Yebra Navarro
Version 1.0
 */
package Analizador;

public class Token {

    protected String lexema;
    protected double atributo;
    protected String clasificacion;
    protected String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Token(String lexema, double atributo, String clasificacion, String tipo) {
        //Lexema //Token = clasificacion //tipo  //atributo = valor
        this.lexema = lexema;
        this.atributo = atributo;
        this.clasificacion = clasificacion;
        this.tipo = tipo;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public double getAtributo() {
        return atributo;
    }

    public void setStributo(int atributo) {
        this.atributo = atributo;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "Lexema -> " + lexema + "| Clasificacion -> " + clasificacion + "| Atributo -> " + atributo + "| Tipo -> " + tipo;

    }
}
