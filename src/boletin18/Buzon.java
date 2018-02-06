/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author tperezrodriguez
 */
public class Buzon {
ArrayList <Correo>listaC = new ArrayList();
    public int Buzon() {
        return listaC.size();
    }

    public int numeroDeCorreos() {
        return listaC.size();
    }
   
    public void engade(Correo c) { //c es el correo que yo recibo
        //, que engade c ao buzon
        listaC.add(c);
    }

    public boolean porLer() {
        // que determina se quedan correos por ler
                   
        for (int i=0;i<listaC.size();i++){
            if (listaC.get(i).isIndicativo()==false){
               return true; //true significa que hat correo por leer
            }
        }
        return false;  //es que no hay correos por leer
    }

    public String amosarPrimerNoLeido() {
        //que amostra o primeiro correo non lido 
        for (int i = 0; i < listaC.size(); i++) {
            if (listaC.get(i).isIndicativo()==false){
                listaC.get(i).setIndicativo(true);
                return listaC.get(i).getContenidoCorreo();
            }
        }
        return "Están todos los mensajes leídos";
    }

    public String amosar(int k) {
      
        return listaC.get(k).getContenidoCorreo();
    }

    public void elimina(int k) {
//que elimina o correo k-ésimo.
    listaC.remove(k);
    }
    
    public void leerCorreo (int i){
        listaC.get(i).setIndicativo(true);
    }
}
