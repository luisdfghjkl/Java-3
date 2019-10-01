/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagui;
//las cases de AWT estan en el paquete java.awt*/
/* las clases de swing estan en el paquete javax.swing*/
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
/**
 *
 * @author Sergio Infante
 */
public class PruebaGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*para crear la interfaz grafica, creamos contenedores
          y le agregamos componentes
        */
        /*Un contenedor muy recurrido en swing es JFrame
        (las clases que comienzan con J son de swing, muchas
        tienen su analogo en AWT)
        */
        JFrame ventana=new JFrame("Primera aplicacion swing");
        //una creado el contenedor se le pueden modificar sus atributos
        //por medio de los setters correspondientes.
        
        ventana.setSize(640, 480);//modificamos el tamanio
        //configuro que sucede cuando presionan el boton de cerrar
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
        
        JFrame ventana2=new JFrame("NUeva ventana");
        ventana2.setSize(320,200);
        ventana2.setLocation(650, 0);
        //EXIT_ON_CLOSE termina la aplicacion, cerrando todas las
        //ventanas abiertas.
        //DISPOSE_ON_CLOSE cierra la ventana y libera recursos. Solo
        //la ventana que se cerro.
        ventana2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //antes de agregar componentes, es conveniente configurar
        //el layout manager a utilizar. El layout manager
        //configura tamanio y posicion  de los componentes agregados.
        //El layout manager default configura los componentes al mismo
        //tamanio que el contenedor que es agregado.
        
        //Prueba de FlowLayout
       // ventana.setLayout(new FlowLayout());
          
       //prueba de GridLayout
        // ventana.setLayout(new GridLayout(3,2));
         
         //prueba de BorderLayout
         ventana.setLayout(new BorderLayout());
        //ventana.setLayout(null);
        
        //a un contenedor le podemos agregar componentes
        //creamos un boton 
        JButton boton=new JButton("Push me!");
        //y lo agregamos a la ventana
        ventana.add(boton,BorderLayout.NORTH);
        
        //creamos otro boton y lo agregamos
        JButton boton2=new JButton("Don't push me!");
        ventana.add(boton2,BorderLayout.SOUTH);
        
        ventana.add(new JButton("Khe!?"),BorderLayout.WEST);
        ventana.add(new JRadioButton("Radio"),BorderLayout.EAST);
        //ventana.add(new JCheckBox("Checame"));
        ventana.add(new JTextField(20),BorderLayout.CENTER);
        
        ventana.setVisible(true);
        ventana2.setVisible(true);
        
    }
    
}
