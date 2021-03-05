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
public class NodoArbol {
    private NodoArbol ls;
    private NodoArbol rs;
    private String dato;
    private int numHoja;
    private ArrayList<Integer> first;
    private ArrayList<Integer> last;
    private int id;
    private boolean anulable;
    
    public NodoArbol(NodoArbol ls, NodoArbol rs, String dato, int id, int numHoja) {
        this.ls = ls;
        this.rs = rs;
        this.dato = dato;
        this.id = id;
        this.first = new ArrayList<Integer>();
        this.last = new ArrayList<Integer>();
        if (ls==null && rs==null){
            anulable = false;
            this.first.add(numHoja);
            this.last.add(numHoja);
            this.numHoja = numHoja;
        }else{
            switch (dato){
                case "|":
                    if(this.ls.isAnulable() || this.rs.isAnulable()){
                        this.anulable = true;
                    }else{
                        this.anulable = false;
                    }
                    this.first.addAll(this.ls.first);
                    this.first.addAll(this.rs.first);
                    this.last.addAll(this.ls.last);
                    this.last.addAll(this.rs.last);
                    break;
                case ".":
                    if(this.ls.isAnulable() && this.rs.isAnulable()){
                        this.anulable = true;
                    }else{
                        this.anulable = false;
                    }
                    if(this.ls.isAnulable()){
                        this.first.addAll(this.ls.first);
                        this.first.addAll(this.rs.first);
                    }else{
                        this.first.addAll(this.ls.first);
                    }
                    if(this.rs.isAnulable()){
                        this.last.addAll(this.ls.last);
                        this.last.addAll(this.rs.last);
                    }else{
                        this.last.addAll(this.rs.last);
                    }
                    break;
                case "?":
                    this.anulable = true;
                    this.first.addAll(this.ls.first);
                    this.last.addAll(this.ls.last);
                    break;
                case "*":
                    this.anulable = true;
                    this.first.addAll(this.ls.first);
                    this.last.addAll(this.ls.last);
                    break;
                case "+":
                    if(this.ls.anulable){
                        this.anulable = true;
                    }else{
                        this.anulable = false;
                    }
                    this.first.addAll(this.ls.first);
                    this.last.addAll(this.ls.last);
                    break;
            }
                
            
        }
    }
    
    public String getDotTag(){
        String especial="";
        if(this.dato.equals("|") || this.dato.equals("\\n") || this.dato.equals(""
                + "\\\'")|| this.dato.equals("\\\"") || this.dato.equals("\\\\")){
            especial+="\\";
        }
        String tag;
        tag="nodo"+id+"[label=\"";
        tag+="{"+this.first.toString()+"}|{";
        if(this.isAnulable()){
            tag+="A|";
        }else{
            tag+="N|";
        }
        tag+=especial+dato+"|";
        if(this.ls == null && this.rs == null){
            tag+=this.numHoja;
        }
        tag+="}|{"+this.last.toString()+"}\"];\n";
        if(ls != null){
            tag+=ls.getDotTag()+"nodo"+id+"->nodo"+ls.id+";\n";
        }
        if(rs != null){
            tag+=rs.getDotTag()+"nodo"+id+"->nodo"+rs.id+";\n";
        }
        return tag;
    }

    public String getDato() {
        return dato;
    }

    public int getNumHoja() {
        return numHoja;
    }    

    public NodoArbol getLs() {
        return ls;
    }

    public NodoArbol getRs() {
        return rs;
    }

    public ArrayList<Integer> getFirst() {
        return first;
    }

    public ArrayList<Integer> getLast() {
        return last;
    }

    public int getId() {
        return id;
    }
    
    

    public boolean isAnulable() {
        return anulable;
    }
    
    public boolean isHoja(){
        boolean ishoja = (this.ls == null && this.rs == null);
        return ishoja;
    }
    
    public ArrayList<Follow> getFollow(){
 
        return null;
    }
    
    
}
