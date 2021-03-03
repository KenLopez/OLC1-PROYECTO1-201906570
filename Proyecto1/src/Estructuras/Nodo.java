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
public class Nodo {
    public Nodo ls;
    public Nodo rs;
    public String dato;
    public int id;
    
    public Nodo(Nodo ls, Nodo rs, String dato, int id ){
        this.ls = ls;
        this.rs = rs;
        this.dato = dato;
        this.id = id;
        ArrayList<Nodo> nodos = new ArrayList<Nodo>();
    }
    
    public String getDotTag(){
        String tag="nodo"+id+"[label=\""+dato+"\"];\n";
        if(ls != null){
            tag+=ls.getDotTag()+"nodo"+id+"->nodo"+ls.id+";\n";
        }
        if(rs != null){
            tag+=rs.getDotTag()+"nodo"+id+"->nodo"+rs.id+";\n";
        }
        return tag;
    }
    
    
}
