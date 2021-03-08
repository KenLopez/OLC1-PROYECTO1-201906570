/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.util.ArrayList;

/**
 *
 * @author khlop
 */
public class AFN {
    private String inicio;
    private String aceptacion;
    private ArrayList<Transicion> transiciones;
    
    public AFN(String inicio, String aceptacion, ArrayList<Transicion> transiciones){
        this.inicio = inicio;
        this.aceptacion = aceptacion;
        this.transiciones = transiciones;
    }

    public String getInicio() {
        return inicio;
    }

    public String getAceptacion() {
        return aceptacion;
    }

    public ArrayList<Transicion> getTransiciones() {
        return transiciones;
    }
    
    public int getFinal(){
        return Integer.parseInt(String.valueOf(aceptacion.split("S")[1]));
    }
    
}
