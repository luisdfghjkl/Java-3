/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Sergio Infante
 */
//el chismoso sera una clase Listener que recibira notificacion
//de eventos y imprimira un mensaje en pantalla.
//Para botones se utiliza ActionListener
public class Chismoso implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent ae) {
        //para diferenciar que elemento invoco actionPerforme() y hacer
        //y una accion diferente por elemento, podemos recurrir
        //al "action command" que tienen los componentes que producen
        //eventos de accion. Por default, el action command es la
        //etiqueta del componente.
        String comando=ae.getActionCommand();
        //pondemos comparar comando contra alguna cadena para hacer
        //la acciion correspondiente.
        switch(comando){
            case "Arriba!": System.out.println("vamos para arriba");
                           break;
            case "Abajo!": System.out.println("Vamos al inframundo...");
                          break;
            case "Izquierda!": System.out.println("Vamos con el peje....");
                         break;
            case "Derecha!":
                           System.out.println("Derecha la flecha... sin soda ni hielo...");
                           break;
        }
        //   System.out.println("Presionaron un boton!... o algo...");
           
    }
    
}
