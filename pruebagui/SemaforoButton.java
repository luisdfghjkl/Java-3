package pruebagui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

import java.awt.color.*;
import java.awt.Rectangle;


//estan calse es para un nuevo tipo de componente que utilizara la infraestructura de swing.
//es eun boton de 3 estados cuando el usuarrio da click cambiara de estado .
//comenazara con verde , sigueinte sera naraj y el tercer rojo 
// de rojo pasara a verde nuevaente

public class SemaforoButton extends JComponent implements MouseListener {
	int state=0; //puede ser 0,1,2
	//cuando un contender ese muestra en la pantalla , pinta a todos los componetnes dentro del contenedor . para pintar un compnete se inbaca en metodo p
	//paintComponent()
public SemaforoButton() {
	addMouseListener(this);
}
	@Override
	protected void paintComponent(Graphics g) {
		//el contenido del componente se dibuja en el contexto grafico Graphics. 
		//Las coordenadas utilizas para dibujar son relativas al componente
		java.awt.Rectangle borde= getBounds ();
		int radio =borde.width/2-1;
		if(borde.height<radio) {
			radio=borde.height/2-1;
			//dibujamos un ovalo
			
		}
		int cx= borde.width/2;
		int cy= borde.height/2;
		g.drawOval(cx-radio, cy-radio, radio*2, radio*2);
		switch (state) {
		case 0:
			g.setColor(Color.green);
			break;
		case 1:
			g.setColor(Color.orange);
			break;
		case 2:
			g.setColor(Color.red);
			break;
		}
			g.fillOval(cx-radio, cy-radio, radio*2, radio*2);
			g.setColor(Color.black);
			g.drawOval(cx-radio, cy-radio, radio*2, radio*2);
		
		}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		state=(state+1)%3;
		this.repaint ();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
