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
public class ArchivoOLC {
    private String nombre;
    private String content;
    private String ruta;
    
    public ArchivoOLC(String nombre, String content, String ruta){
        this.nombre = nombre;
        this.content = content;
        this.ruta = ruta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContent() {
        return content;
    }

    public String getRuta() {
        return ruta;
    } 
}
