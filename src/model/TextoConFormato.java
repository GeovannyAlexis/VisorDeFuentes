/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Font;

/**
 *
 * @author Windows8
 */
public class TextoConFormato {
    
    public TextoConFormato( ){
    }
    
    //inicialice la variable de instancia
    public static final int TAMANIO_PEQUENIO = 16;
    public static final int TAMANIO_MEDIANO = 20;
    public static final int TAMANIO_GRANDE = 24;
    private String texto;
    private String fuente;
    private int estilo;
    private int tamanio;
    
    public TextoConFormato(String texto) {
        this.texto = texto;
        this.fuente = "Arial";
        this.estilo = Font.PLAIN;
        this.tamanio = TAMANIO_MEDIANO;
    }

    //Implementacion los métodos de acceso (getters y setters)
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public String getFuente() {
        return fuente;
    }
    public void setFuente(String fuente) {
        this.fuente = fuente;
    }
    public int getEstilo() {
        return estilo;
    }
    public void setEstilo(int estilo) {
        this.estilo = estilo;
    }
    public int getTamanio() {
        return tamanio;
    }
    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    public Font getFont() {
        return new Font(this.fuente, this.estilo, this.tamanio);
    }
}
