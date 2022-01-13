package view.frames;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

import view.panel.LaminaImagen;

public class MarcoDibujo extends JFrame{
	public MarcoDibujo()
	{
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		Dimension sizePantalla = miPantalla.getScreenSize();
		int anchoPantalla = sizePantalla.width;
		int alturaPantalla = sizePantalla.height;
		setBounds(anchoPantalla / 4, alturaPantalla / 4, anchoPantalla / 2, alturaPantalla / 2);
		setTitle("Marco 2 Centrado con Imagen");
		Image miIcono = miPantalla.getImage("src/imagenes/home.png");
		setIconImage(miIcono);
		
		add(lm);
		
	}
	//instancia del panel LaminaImagen
	LaminaImagen lm = new LaminaImagen();
}
