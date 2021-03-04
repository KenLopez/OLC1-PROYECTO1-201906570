/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author khlop
 */
public class Arbol {
    private NodoArbol raiz;
    private String nombre;
    private ArrayList<Follow> follows;
    
    public Arbol(String nombre, NodoArbol raiz){
        this.nombre = nombre;
        this.raiz = raiz;
        follows = new ArrayList<Follow>();
    }

    public NodoArbol getRaiz() {
        return raiz;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void graficar(){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try{
            fichero = new FileWriter("./Reportes\\ARBOLES_201906570\\EXP-"+
                    this.nombre+".dot");
            pw = new PrintWriter(fichero);
            pw.println("digraph G{");
            pw.println("rankdir=UD");
            pw.println("node[shape=Mrecord]");
            pw.println("concentrate=true");
            pw.println(raiz.getDotTag());
            pw.println("}");
        }catch (Exception e){
            System.out.println("No se pudo generar el archivo...");
            e.printStackTrace();
        }finally{
            try{
                if(null != fichero){
                    fichero.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
        try{
            String dotPath = "dot";
            String fileInputPath = "./Reportes\\ARBOLES_201906570\\EXP-"+
                    this.nombre+".dot";
            String fileOutputPath = "./Reportes\\ARBOLES_201906570\\EXP-"+
                    this.nombre+".png";
            String tParam = "-Tpng";
            String tOParam = "-o";
            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;
            
            Runtime.getRuntime().exec(cmd);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void generarAFD(){
        this.getHojas(raiz);
        this.getFollow(raiz);
        System.out.print("");
    }
    
    public void getHojas(NodoArbol nodo){
        if(nodo.isHoja()){
            this.follows.add(new Follow(nodo.getDato()));
        }else{
            this.getHojas(nodo.getLs());
            if(nodo.getRs()!=null){
                this.getHojas(nodo.getRs());
            }
        }
    }
    
    public void getFollow(NodoArbol nodo){
        if(!nodo.isHoja()){
            getFollow(nodo.getLs());
            if(nodo.getRs()!=null){
                this.getFollow(nodo.getRs());
            }
            if(nodo.getDato().equals(".")){
                for(int i=0; i<nodo.getLs().getLast().size();i++){
                    for(int j=0;j<nodo.getRs().getFirst().size();j++){
                        follows.get(nodo.getLs().getLast().get(i)-1).getFollow().add(nodo.getRs().getFirst().get(j));
                    }
                }
            }else if(nodo.getDato().equals("+") || nodo.getDato().equals("*")){
                for(int i=0; i<nodo.getLs().getLast().size();i++){
                    for(int j=0;j<nodo.getLs().getFirst().size();j++){
                        follows.get(nodo.getLs().getLast().get(i)-1).getFollow().add(nodo.getLs().getFirst().get(j));
                    }
                }
            }
        }
    }
}
