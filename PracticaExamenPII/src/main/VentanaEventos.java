package main;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class VentanaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoVentana mc = new MarcoVentana();
		mc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MarcoVentana mc2 = new MarcoVentana();
		mc2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mc.setTitle("ventana 1 ");
		mc.setBounds(100,300,250,350);
		mc2.setTitle("Ventana 2");
		mc2.setBounds(600,300,250,350);
		
	}

}
class MarcoVentana extends JFrame
{
	public MarcoVentana()
	{
		//setTitle("Eventos Window");
		//setBounds(300,300,650,250);
		setVisible(true);
		
		M_Ventana mv = new M_Ventana();
		addWindowListener(mv);
		
	}
}
class M_Ventana implements WindowListener
{
	public M_Ventana()
	{
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana Activa");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana Cerrada");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana cerrada 2");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana Minimizada");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana abierta");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana activada");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana desactivada");
	}
}
