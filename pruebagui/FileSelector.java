/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Sergio Infante
 */
public class FileSelector extends JDialog implements ActionListener{
    
    public FileSelector(Window parent){
        super(parent,"Seleccionar archivos",JDialog.ModalityType.DOCUMENT_MODAL);
        
        setSize(400,300);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        initComponents();
        setVisible(true);
    }
    
    private void initComponents() {
        setLayout(new BorderLayout());
        //al sur va el boton de ok
        //al centro el panel principal de contenido
        JButton boton=new JButton("Ok");
        add(boton,BorderLayout.SOUTH);
        //panel principal de cotenido
        JPanel contenido=new JPanel(new GridLayout(1,3));
        add(contenido,BorderLayout.CENTER);
        
        //panel para los elementos de la izquierda
        JPanel izq=new JPanel(new BorderLayout());
        contenido.add(izq);
        JLabel etiqueta=new JLabel("Archivos disponibles");
        izq.add(etiqueta,BorderLayout.NORTH);
        
        //Panel del centro (botones)
        JPanel centro=new JPanel(new GridLayout(4,1));
        contenido.add(centro);
        boton=new JButton(">");
        centro.add(boton);
        boton=new JButton(">>");
        centro.add(boton);
        boton=new JButton("<<");
        centro.add(boton);
        boton=new JButton("<");
        centro.add(boton);
        
        //panel para los elementos de la derecha
        JPanel der=new JPanel(new BorderLayout());
        contenido.add(der);
        etiqueta=new JLabel("Archivos disponibles");
        der.add(etiqueta,BorderLayout.NORTH);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }

    
    
}
