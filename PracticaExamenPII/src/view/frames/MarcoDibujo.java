package view.frames;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

//import view.panel.LaminaImagen;
import view.panel.LaminaMenuPrincipal;

public class MarcoDibujo extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MarcoDibujo()
	{
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		Dimension sizePantalla = miPantalla.getScreenSize();
		int anchoPantalla = sizePantalla.width;
		int alturaPantalla = sizePantalla.height;
		setBounds(anchoPantalla / 4, alturaPantalla / 4, anchoPantalla / 2, alturaPantalla / 2);
		setTitle("Marco 2 Centrado con Imagen");
		Image miIcono = miPantalla.getImage("src/imagenes/hand.jpg");
		setIconImage(miIcono);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(lm);
		
	}
	//instancia del panel LaminaImagen
	LaminaMenuPrincipal lm = new LaminaMenuPrincipal();
}
