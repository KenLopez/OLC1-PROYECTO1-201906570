/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author khlop
 */
public class Arbol {
    private NodoArbol raiz;
    private String nombre;
    
    public Arbol(String nombre, NodoArbol raiz){
        this.nombre = nombre;
        this.raiz = raiz;
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
}
