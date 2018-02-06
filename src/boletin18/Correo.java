/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

import javax.swing.JOptionPane;

/**
 *
 * @author tperezrodriguez
 */
public class Correo {
    private String contenidoCorreo;
    private boolean indicativo; //saber si fueron leídos o no los correos

    public Correo() {
  
    }

    public Correo(String contenidoCorreo) {
        this.contenidoCorreo = contenidoCorreo;
        this.indicativo=false;
    }

    public String getContenidoCorreo() {
        return contenidoCorreo;
    }

    public void setContenidoCorreo(String contenidoCorreo) {
        this.contenidoCorreo = contenidoCorreo;
    }

    public boolean isIndicativo() {
        return indicativo;
    }

    public void setIndicativo(boolean indicativo) {
        this.indicativo = indicativo;
    }


    @Override
    public String toString() {
        return "Contenido correo: " + contenidoCorreo + "|| Indicativo: " + indicativo;
    }
    

    }
    


