package pruebagui;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

import com.sun.glass.ui.Window;


public class PruebaSemaforoDialog extends JDialog {

	public PruebaSemaforoDialog(java.awt.Window window) {
		super(window,"Prueba de semaforo",JDialog.DEFAULT_MODALITY_TYPE.DOCUMENT_MODAL);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setSize(640,480);
		initComponents();
		setVisible(true);
		
		
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		setLayout (new GridLayout(3,3));
		
		add(new JButton("1"));
		add(new JButton("2"));
		add(new JButton("3"));
		add(new JButton("4"));
		add(new SemaforoButton ());
		add(new JButton("5"));
		add(new JButton("6"));
		add(new JButton("7"));
		add(new JButton("8"));
		add(new JButton("9"));
		
	}
}
