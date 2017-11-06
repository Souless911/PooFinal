import javax.swing.JFrame;

public class VentanaProyecto extends JFrame{

	
	public VentanaProyecto() {
		super("Proyecto");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelProyecto pp= new PanelProyecto();
		this.add(pp);
		this.pack();
		this.setVisible(true);
	}
	public static void main(String[] args) {
		VentanaProyecto vp= new VentanaProyecto();
	}
}
