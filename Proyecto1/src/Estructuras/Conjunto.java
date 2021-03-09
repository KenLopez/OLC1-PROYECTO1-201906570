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
public class Conjunto {
    private String nombre;
    private ArrayList<Character> elementos;
    
    public Conjunto(String nombre, String desc){
        this.nombre = nombre;
        this.elementos = new ArrayList<Character>();
        if(desc.length()>3){
            for(int i=0; i<desc.length();i+=2){
                elementos.add(desc.charAt(i));
            }
        }else{
            char e1 = desc.charAt(0);
            char e2 = desc.charAt(2);
            for(int i=e1;i<=e2;i++){
                if(e1!=48 && e1!=65 && e1!=97){
                    if(i>=48 && i<=57){
                    continue;
                    }else if(i>=65 && i<=90){
                        continue;
                    }else if(i>=97 && i<=122){
                        continue;
                    }
                }
                elementos.add((char)i);
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Character> getElementos() {
        return elementos;
    }
    
    
}
