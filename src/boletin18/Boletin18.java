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
public class Boletin18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       Buzon b1 = new Buzon();
       
       int op = Integer.parseInt(JOptionPane.showInputDialog("******** MENÚ *********\n"
                + "1)Número de correos en el buzón\n"
                + "2)Añadir correo al buzón\n"
                + "3)Comprobar si hay correos por leer\n"
                + "4)Mostrar primer correo no leído\n"
                + "5)Mostrar correo específico\n"
                + "6)Eliminar correo\n"
               + "7)Leer correo\n"
                + "0)Salir\n"));
       
         do {
            switch(op){
                case 1: System.out.println(b1.numeroDeCorreos()); //num correos
                        break;
                case 2: b1.engade(new Correo(JOptionPane.showInputDialog("Contenido del correo"))); //añadir correo con metodo engade 
                        break;
                case 3: if (b1.porLer()==true) {
                     System.out.println("Hay correos por leer");
                } else {
                     System.out.println("No hay correos por leer");
                }; //comproabar si hay correos por leer metodo porler
                        break;
                case 4:  System.out.println(b1.amosarPrimerNoLeido());;//mostrar correo no leido
                        break;
                case 5: System.out.println(b1.amosar(Integer.parseInt(JOptionPane.showInputDialog("Introduce posición del correo que quieres mostrar")))); //especificar correo que quiero mostrar
                        break;
                case 6: b1.elimina(Integer.parseInt(JOptionPane.showInputDialog("Introduce posición del correo que quieres eliminar"))); //eliminar correo
                        break;
                case 7: b1.leerCorreo(Integer.parseInt(JOptionPane.showInputDialog("Introduce posición del correo que quieres leer"))); //leer correo
                        break;
                case 0: break;
                
                default: System.out.println("Opción no válida");
            }
            
        op = Integer.parseInt(JOptionPane.showInputDialog("******** MENÚ *********\n"
                + "1)Número de correos en el buzón\n"
                + "2)Añadir correo al buzón\n"
                + "3)Comprobar si hay correos por leer\n"
                + "4)Mostrar primer correo no leído\n"
                + "5)Mostrar correo específico\n"
                + "6)Eliminar correo\n"
                 + "7)Leer correo\n"
                + "0)Salir\n"));

        } while(op!=0);
    }
    
    
}
