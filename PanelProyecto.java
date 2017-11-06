import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelProyecto extends JPanel implements MouseMotionListener{
	private int xBorrego,
				yBorrego;
	private Image borrego;
	Random ran = new Random();
	int calificacion;
	
	public PanelProyecto() {
		super();
		this.xBorrego = 450;
		this.yBorrego = 550;
		this.setPreferredSize(new Dimension(800,600));
		this.borrego = new ImageIcon("Borreguito.jpeg").getImage();
		this.addMouseMotionListener(this);
		
		this.calificacion = ran.nextInt(100);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(borrego,this.xBorrego - 50,this.yBorrego - 50,100,100, this);
		g.drawString(this.calificacion + "", 400, 12);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
	this.yBorrego = e.getY();
	this.xBorrego = e.getX();
	this.repaint();
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}


