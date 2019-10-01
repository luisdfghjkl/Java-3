package pruebagui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

import com.sun.glass.ui.Window;


/**
 *
 */
public class CombinadorCaras {
    
	
	
	
    public CombinadorCaras(){
    
    	  

    	ImageIcon CaraTop [] = new ImageIcon [8];
	    ImageIcon CaraMiddle [] = new ImageIcon [8];
	    ImageIcon CaraBottom [] = new ImageIcon [8];
    	JFrame f= new JFrame();
    	
        DefaultListModel<String> modelo = new DefaultListModel<String>();
        
        
        modelo.addElement("Cristiano");
        modelo.addElement("Tom");
        modelo.addElement("Werever");
        modelo.addElement("Bean");
        modelo.addElement("Brad");
        modelo.addElement("Ramon");
        modelo.addElement("Angelica");
        ///////////////////////////////
        
        ///Arreglo de imagenes
        
        for(int i=1; i<8; i++) {
        	
        	CaraTop [i]= new ImageIcon (getClass().getResource("/caras/face"+i+"t.png"));
        	
        }
        JLabel l1 = new JLabel();
        l1.setText("Top");
        l1.setBounds(0, 0, 100, 50);
        f.getContentPane().add(l1);
        JLabel LabelOjos = new JLabel();
        LabelOjos.setIcon(CaraTop[1]);
		LabelOjos.setBounds(251, 78, 340, 205);
		f.getContentPane().add(LabelOjos);
    ///////////////////////////////////////////////////////////////////////////    
		
		 for(int i=1; i<8; i++) {
	        	
	        	CaraMiddle [i]= new ImageIcon (getClass().getResource("/caras/face"+i+"m.png"));
	        	
	        }
		 JLabel l2 = new JLabel();
		 l2.setText("Middle");
		 l2.setBounds(0, 210, 100, 50);
		 f.getContentPane().add(l2);
		JLabel LabelNariz = new JLabel();
		LabelNariz.setIcon(CaraMiddle[1]);
		LabelNariz.setBounds(251, 281, 340, 36);
		f.getContentPane().add(LabelNariz);
		
				
		
		//////////////////////////////////////////////////
		
		 for(int i=1; i<8; i++) {
	        	
	        	CaraBottom [i]= new ImageIcon (getClass().getResource("/caras/face"+i+"b.png"));
	        	
	        }
		 JLabel l3 = new JLabel();
		 l3.setText("Bottom");
		 l3.setBounds(0, 400, 100, 50);
		 f.getContentPane().add(l3);
		JLabel LabelBoca = new JLabel();
		LabelBoca.setIcon(CaraBottom[1]);
		LabelBoca.setBounds(251, 317, 340, 172);
		f.getContentPane().add(LabelBoca);
		
		
		
        
        ////////////////////////////////////////
        JList lista = new JList(modelo);
        lista.setBounds(10, 50, 200, 140);
        f.getContentPane().add(lista);
        
        
        JList listaMiddle = new JList(modelo);
       listaMiddle.setBounds(10, 256, 200, 140);
       f.getContentPane().add(listaMiddle);

       JList listaBottom = new JList(modelo);
       listaBottom.setBounds(10, 456, 200, 140);
       f.getContentPane().add(listaBottom);
       
    /////////////////////////////////////////////////////////////////////////////////   
       JComboBox Combinador = new JComboBox ();
       Combinador.setBounds(400,40,256,30);
       Combinador.addItem("Combinacion");
       Combinador.addItem("Cristiano Cruise Jolie");
     //  Combinador.addActionListener(this);
       Combinador.addItem("Don Ramon Jolie");
       Combinador.addItem("Brad Bean");
       Combinador.addItem("Brad Cruise Tu Morro");
       f.getContentPane().add(Combinador);
       Combinador.addActionListener(new ActionListener() {
    	
		@Override
		public void actionPerformed(ActionEvent arg0) {
			String itemSelecionado = (String)Combinador.getSelectedItem();
			
			if (itemSelecionado== "Combinacion") {
				
				if (lista.getSelectedIndex()==0)
				{
					LabelOjos.setIcon(CaraTop [1]);
					
				}
				if (lista.getSelectedIndex()==1)
				{
					LabelOjos.setIcon(CaraTop [2]);
					
				}
				if (lista.getSelectedIndex()==2)
				{
					LabelOjos.setIcon(CaraTop [3]);
					
				}
				if (lista.getSelectedIndex()==3)
				{
					LabelOjos.setIcon(CaraTop [4]);
					
				}
				if (lista.getSelectedIndex()==5)
				{
					LabelOjos.setIcon(CaraTop [6]);
					
				}
				if (lista.getSelectedIndex()==6)
				{
					LabelOjos.setIcon(CaraTop [7]);
					
				}
				
				if (lista.getSelectedIndex()==7)
				{
					LabelOjos.setIcon(CaraTop [8]);
					
				}

	////////////////////////////////////////////////////////////////////////////////////
				if (listaMiddle.getSelectedIndex()==0)
				{
					LabelNariz.setIcon(CaraMiddle [1]);
					
				}
				if (listaMiddle.getSelectedIndex()==1)
				{
					LabelNariz.setIcon(CaraMiddle [2]);
					
				}
				if (listaMiddle.getSelectedIndex()==2)
				{
					LabelNariz.setIcon(CaraMiddle [3]);
					
				}
				if (listaMiddle.getSelectedIndex()==3)
				{
					LabelNariz.setIcon(CaraMiddle [4]);
					
				}
				if (listaMiddle.getSelectedIndex()==5)
				{
					LabelNariz.setIcon(CaraMiddle [6]);
					
				}
				if (listaMiddle.getSelectedIndex()==6)
				{
					LabelNariz.setIcon(CaraMiddle [7]);
					
				}
				if (listaMiddle.getSelectedIndex()==7)
				{
					LabelNariz.setIcon(CaraMiddle [8]);
					
				}
				
///////////////////////////////////////////////////////////////////////////////////
				if (listaBottom.getSelectedIndex()==0)
				{
					LabelBoca.setIcon(CaraBottom [1]);
					
				}
				if (listaBottom.getSelectedIndex()==1)
				{
					LabelBoca.setIcon(CaraBottom [2]);
					
				}
				if (listaBottom.getSelectedIndex()==2)
				{
					LabelBoca.setIcon(CaraBottom [3]);
					
				}
				if (listaBottom.getSelectedIndex()==3)
				{
					LabelBoca.setIcon(CaraBottom [4]);
					
				}
				if (listaBottom.getSelectedIndex()==4)
				{
					LabelBoca.setIcon(CaraBottom [5]);
					
				}
				if (listaBottom.getSelectedIndex()==5)
				{
					LabelBoca.setIcon(CaraBottom [6]);
					
				}
				if (listaBottom.getSelectedIndex()==6)
				{
					LabelBoca.setIcon(CaraBottom [7]);
					
				}
				if (listaBottom.getSelectedIndex()==7)
				{
					LabelBoca.setIcon(CaraBottom [8]);
					
				}
				
				
				
				
				                           
				
			}
			
			if (itemSelecionado== "Cristiano Cruise Jolie") {
				
				LabelOjos.setIcon(CaraTop [1]);
				LabelNariz.setIcon(CaraMiddle[2]);
				LabelBoca.setIcon(CaraBottom[7]);                            
				
			}
			if (itemSelecionado== "Don Ramon Jolie") {
				
				LabelOjos.setIcon(CaraTop [6]);
				LabelNariz.setIcon(CaraMiddle[6]);
				LabelBoca.setIcon(CaraBottom[7]);                            
				
			}
			
			if (itemSelecionado== "Brad Bean") {
				
				LabelOjos.setIcon(CaraTop [5]);
				LabelNariz.setIcon(CaraMiddle[5]);
				LabelBoca.setIcon(CaraBottom[4]);                            
				
			}
			if (itemSelecionado== "Brad Cruise Tu Morro") {
				
				LabelOjos.setIcon(CaraTop [5]);
				LabelNariz.setIcon(CaraMiddle[2]);
				LabelBoca.setIcon(CaraBottom[3]);                            
				
			}
			
		}
    	});
       
       
       
       
        //////////////////////////////////////
        
        f.setSize(800, 640);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        ////////////////////////////////////////////////
       
		
		
	
		
		/////////////////////////////////////////
    }

    public static void main(String[] args) {
        new CombinadorCaras();
    }
    
}
