/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Sergio Infante
 */
//la ventana implementa ActionListener para manejar los eventos de accion
//(Seleccion de opciones de menu)
public class MiVentana3 extends JFrame implements ActionListener{
    public MiVentana3(){
        super("Otra ventana mas");
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800,600);
        initComponents();
        setVisible(true);
    }

    private void initComponents() {
        //creamos una etiqueta.
       ImageIcon imagen=new ImageIcon(getClass().getResource("image/JavaProgramming.png"));
       JLabel etiqueta=new JLabel(imagen);
       add(etiqueta,BorderLayout.CENTER);   
       createMenu();
    }

    private void createMenu() {
        JMenuBar barra_menu=new JMenuBar();//la barra de menu para la ventana
        //a la barra de menu le agregaremos menues.
        JMenu menu=new JMenu("Archivo");
        barra_menu.add(menu);
        //al JMenu le agregamos opciones (JMenuItem)
        JMenuItem opcion=new JMenuItem("Nuevo");
        menu.add(opcion);
        //recliclo la variable opcion
        opcion=new JMenuItem("Abrir");
        menu.add(opcion);
        opcion=new JMenuItem("Grabar");
        menu.add(opcion);
        menu.addSeparator();
        opcion=new JMenuItem("Salir");
        opcion.addActionListener(this);//es necesario ligar el item con un 
        //action listener para desarrollar acciones cuando sea seleccionado
        //por el usuario
        menu.add(opcion);
        //agreamamos un menu nuevo
        menu=new JMenu("Herramienta");
        barra_menu.add(menu);
        opcion=new JMenuItem("Calculadora");
        opcion.addActionListener(this);
        menu.add(opcion);
        opcion=new JMenuItem("Seleccionador");
        opcion.addActionListener(this);
        menu.add(opcion);
        opcion=new JMenuItem("Semaforo");
        opcion.addActionListener(this);
        menu.add(opcion);
        opcion=new JMenuItem("Combinador de Caras");
        opcion.addActionListener(this);
        menu.add(opcion);
        
        
        //Ponemos la barra de menu a esta ventana
        setJMenuBar(barra_menu); //a los JFrame se les pueden poner menu bars.
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando=ae.getActionCommand();
        switch(comando){
            case "Salir":
                   dispose(); break;
            case "Calculadora":
                Calculadora calc=new Calculadora(this);
                break;
            case "Seleccionador":
                FileSelector dlg=new FileSelector(this);
                break;
            case "Semaforo":
            	PruebaSemaforoDialog dlgs= new PruebaSemaforoDialog(this);
            	break;
            case "Combinador de Caras":
            	CombinadorCaras caras = new CombinadorCaras ();
            	break;
            
            
        }
    }
    
}
