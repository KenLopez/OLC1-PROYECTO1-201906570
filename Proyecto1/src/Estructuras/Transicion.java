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
public class Transicion {
    private String origen;
    private String terminal;
    private String destino;

    public Transicion(String origen, String terminal, String destino) {
        this.origen = origen;
        this.terminal = terminal;
        this.destino = destino;
    }
    
    public String getTerminal() {
        return terminal;
    }

    public String getDestino() {
        return destino;
    }
    
    public String getOrigen(){
        return origen;
    }
    
    
}
