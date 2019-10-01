/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javafx.scene.input.KeyCode;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Sergio Infante
 */
public class MiVentana2 extends JFrame implements KeyListener{
    JLabel etiqueta;
    public MiVentana2(){
        super("Mono que se mueve");
        setSize(640,480);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        initComponents();
        setVisible(true);
    }

    private void initComponents() {
        //layout para la ventana principal.
        setLayout(new BorderLayout());
        //creamos un JPanel para manejar una barra de botones
        //en la parte superior de la ventana
        JPanel barra=new JPanel();
        //a la barra le ponemos un FLowLayout
        barra.setLayout(new FlowLayout());
        //agregamos la barra de botones a la parte superior de
        //la ventana
        add(barra,BorderLayout.NORTH);
        
        
        //agregamos los botones
        JButton boton=new JButton("<");
        //el listener para el boton recien creado
        //lo agregamos por medio de una clase
        //anonima interna.
        //Para crear la clase anonima interna, es necesario crear
        //una instancia de la clase.
        //La clase necesita derivarse de otra, o implementar una interfaz
        //Implementaremos action listener
        ActionListener listener=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                moveLeft();
            }
        };
        boton.addActionListener(listener);
        //cada boton lo agregamos al contenedor barra.
        barra.add(boton);
        
        //siguiente boton
        boton= new JButton("^");
        //le agregamos listener
        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                moveUp();
            }
            
        });
        barra.add(boton);
        //siguiente boton
        boton= new JButton("V");
        //le agregamos listener
        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                moveDown();
            }
        });
        barra.add(boton);
        
        //siguiente boton
        boton= new JButton(">");
        //le agregamos listener
        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                moveRight();
            }
        });
        barra.add(boton);
        
        //Creamos un panel para la etiqueta que se movera.
        //El layout manager que utilizara el panel puede
        //ser enviado como parametro en el constructor
        JPanel panel_lbl=new JPanel(null);//no layout
        //"<HTML><img src=\"URL\" /></HTML>"
        etiqueta=new JLabel("<HTML><img src=\"https://www.techgoondu.com/wp-content/uploads/2010/09/duke.png\" width=\"100\" height=\"100\" /></html>");
        etiqueta.setBounds(200,200,100,100);
        panel_lbl.add(etiqueta);
        //agregamos el panel a la ventana principal
        add(panel_lbl,BorderLayout.CENTER);
        
        //
        this.addKeyListener(this);
    }
    void moveLeft(){
        Point p=etiqueta.getLocation();
        p.x-=10;
        etiqueta.setLocation(p);
    }
    void moveRight(){
        Point p=etiqueta.getLocation();
        p.x+=10;
        etiqueta.setLocation(p);
    }
    void moveUp(){
        Point p=etiqueta.getLocation();
        p.y-=10;
        etiqueta.setLocation(p);
        
    }
    void moveDown(){
        Point p=etiqueta.getLocation();
        p.y+=10;
        etiqueta.setLocation(p);
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        switch(ke.getKeyChar()){
            case 'w':
                moveUp();break;
            case 'a':
                moveLeft();break;
            case 's':
                moveDown();break;
            case 'd':
                moveRight();break;
            
        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }
    
}
