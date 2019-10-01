/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Sergio Infante
 */
public class MiVentana extends JFrame{
    public MiVentana(){
        super("Ventana mia de mi...");
        setSize(640,480); //tamanio default
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        initComponents();
        setVisible(true);

    }

    private void initComponents() {
       //configuramos LayouManager
       setLayout(new BorderLayout());
       //las etiquetas pueden tener HTML
       add(new JLabel("<HTML><img src=\"https://upload.wikimedia.org/wikipedia/en/thumb/d/d1/Jamie_Foxx_as_Electro.jpg/170px-Jamie_Foxx_as_Electro.jpg\" /></html> "),BorderLayout.CENTER);
       //<html><img src=\"url_de_imagen\" /></html>
       JButton boton=new JButton("Arriba!");
       Chismoso chismoso=new Chismoso();//es un action listener
       boton.addActionListener(chismoso);
       add(boton,BorderLayout.NORTH);
       boton=new JButton("Derecha!");
       boton.addActionListener(chismoso);
       add(boton,BorderLayout.EAST);
       boton=new JButton("Izquierda!");
       boton.addActionListener(chismoso);
       add(boton,BorderLayout.WEST);
       boton=new JButton("Abajo!");
       boton.addActionListener(chismoso);
       add(boton,BorderLayout.SOUTH);
       
       
       
    }
    
}
