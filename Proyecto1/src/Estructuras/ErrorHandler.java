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
public class ErrorHandler {
    private String tipoError;
    private String valorError;
    private int fila;
    private int columna;
    
    public ErrorHandler(String tipoError, String valorError, int fila, int columna){
        this.tipoError = tipoError;
        this.valorError = valorError;
        this.fila = fila;
        this.columna = columna;
    }

    public String getTipoError() {
        return tipoError;
    }

    public String getValorError() {
        return valorError;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }
    
    
}
