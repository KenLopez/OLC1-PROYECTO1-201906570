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
public class Estado {
    private String nombre;
    private ArrayList<Integer> content;
    private ArrayList<Transicion> transiciones;
    
    public Estado(String nombre, ArrayList<Integer> content){
        this.nombre = nombre;
        this.content = content;
        transiciones = new ArrayList<Transicion>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getContent() {
        return content;
    }

    public ArrayList<Transicion> getTransiciones() {
        return transiciones;
    }
    
    public String getDestino(String terminal){
        for(Transicion transicion:transiciones){
            if(transicion.getTerminal().equals(terminal)){
                return transicion.getDestino();
            }
        }
        return "";
    }
}
