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
public class AFD {
    private String nombre;
    private ArrayList<Estado> estados;
    private String inicial;
    private ArrayList<String> aceptaciones;
    private ArrayList<String> terminales;
    private ArrayList<Conjunto> conjuntos;
    private String actual;
    
    public AFD(String nombre, ArrayList<Estado> estados, ArrayList<String> terminales, int aceptacion, ArrayList<Conjunto> conjuntos){
        this.nombre = nombre;
        this.estados = estados;
        this.terminales = terminales;
        this.conjuntos = conjuntos;
        this.aceptaciones = new ArrayList<String>();
        this.inicial = this.estados.get(0).getNombre();
        for(Estado estado:estados){
            if(estado.getContent().contains(aceptacion)){
                aceptaciones.add(estado.getNombre());
            }
        }
    }
    
    public boolean validar(String cadena){
        actual = inicial;
        boolean ok = false;
        for(int i=0; i<cadena.length();i++){
            if(cadena.charAt(i) == '\\'){
                if(cadena.charAt(i+1)=='\'' || cadena.charAt(i+1) == '\"' || cadena.charAt(i+1) == 'n'){
                    i++;
                }
            }
            ok = recorrerEstados(cadena.charAt(i));
            if(!ok){
                return false;
            }
        }
        if(ok){
            if(aceptaciones.contains(actual)){
                return true;
            }
        }
        return false;
    }
    
    public boolean recorrerEstados(char pos){
        for(Estado estado:estados){
            if(estado.getNombre().equals(actual)){
                if(recorrerTransiciones(estado, pos)){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }
    
    public boolean recorrerTransiciones(Estado estado, char pos){
        for(Transicion transicion: estado.getTransiciones()){
            if(transicion.getTerminal().equals("\\'") || transicion.getTerminal().equals("\\\"")
                        || transicion.equals("\\n")){
                if(pos == transicion.getTerminal().charAt(1)){
                    actual = transicion.getDestino();
                    return true;
                }    
            }else{
                if(transicion.getTerminal().equals(Character.toString(pos))){
                    actual = transicion.getDestino();
                    return true;
                }else{
                    for(Conjunto conjunto: conjuntos){
                        if(conjunto.getNombre().equals(transicion.getTerminal())){
                            if(conjunto.getElementos().contains(pos)){
                                actual = transicion.getDestino();
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }
    
}
