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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sergio Infante
 */
public class Calculadora extends JDialog implements ActionListener,KeyListener{
    JTextField display;
    float operando1; //el primer numero de la operacion
    char operacion=0;  //la operacion que quieren realizar
    boolean nuevo_operando=true;
    
    public Calculadora(Window parent){
            super(parent,"Supercalculadora plus",JDialog.ModalityType.DOCUMENT_MODAL); 
            //un JDialog necesita una ventana padre, titulo y
            //un tipo de modalidad
            setSize(200,300);
            setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            initComponents();
            setVisible(true);
    }

    private void initComponents() {
        setLayout(new BorderLayout());
       display=new JTextField("0");
       display.setEditable(false);
       display.setHorizontalAlignment(JTextField.RIGHT);
       //agregamos el display en la parte de arriba
       add(display,BorderLayout.NORTH);
       JPanel panel_botones=new JPanel(new GridLayout(4,4));
       String bl[]={"7","8","9","*",
                    "4","5","6","/",
                    "1","2","3","-",
                    ".","0","=","+"};
        for (String etiqueta : bl) {
            JButton boton=new JButton(etiqueta);
            boton.addActionListener(this);
            boton.setFocusable(false);//no obtendra el foco (atencion del teclado)
            //agregamos el boton al panel de botones
            panel_botones.add(boton);  
        }
        add(panel_botones,BorderLayout.CENTER);
       
        //agregamos a esta ventana el key listener
        this.addKeyListener(this);
        display.addKeyListener(this);
        this.requestFocus();//el cuadro de dialogo tendra el foco del teclado
       
       
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String ac=ae.getActionCommand();
        
        procesarTecla(ac.charAt(0));
        
    }
    @Override
    public void keyTyped(KeyEvent ke) {
        procesarTecla(ke.getKeyChar());
    }
    void procesarTecla(char tecla){
        //para prccesar el caracter de la tecla presionada
        //o el texto del boton
        String dt=display.getText();
        //primero verificamos si el caracter es un numero
        if(tecla>='0'&&tecla<='9'){
            if(tecla!='0'){
               if(nuevo_operando){
                dt=""+tecla;
                nuevo_operando=false;
               }else{
                dt+=tecla;//concatemanos el texto
               }
               display.setText(dt);
            }
            else{
                if(!nuevo_operando){
                    dt+=tecla;//concatemanos el texto
                    display.setText(dt);
                }
            }    
        }
        //si el caracter es el punto decimal, verificamos que
        //no se haya puesto el punto previamene
        if(tecla=='.'){
           if(dt.indexOf(".")<0){
               if(nuevo_operando){
                   dt="0.";
                   nuevo_operando=false;
               }
               else{
                   dt+=tecla;
               }
               display.setText(dt);
           }
        }
        //verificamos si es el caracter de una operacion.
        if(tecla=='+'||tecla=='-'||tecla=='*'||tecla=='/'){
            //almacenamos el primer operando
            operando1=Float.parseFloat(dt);
            //borramos el contenido del display
            //display.setText("");
            nuevo_operando=true;
            //almacenamos que operacion se quiere hacer
            operacion=tecla;
        }
        //verificamos si quieren obtener el resultado
        if(tecla=='='||tecla==KeyEvent.VK_ENTER){
           float operando2=Float.parseFloat(dt);
           switch(operacion){
               case '+': operando1=operando1+operando2;break;
               case '-': operando1=operando1-operando2;break;
               case '*': operando1=operando1*operando2;break;
               case '/': operando1=operando1/operando2;break;
               default: operando1=operando2;
           }
           display.setText(""+operando1);//mostramos el resultado;
           nuevo_operando=true;
        }
        
    }

    

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
    
}
