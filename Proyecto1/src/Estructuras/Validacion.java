/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author khlop
 */
public class Validacion {
    String expresion;
    String cadena;
    
    public Validacion(String expresion, String cadena){
        this.expresion = expresion;
        this.cadena = cadena;
    }

    public String getExpresion() {
        return expresion;
    }

    public String getCadena() {
        return cadena;
    }
}
