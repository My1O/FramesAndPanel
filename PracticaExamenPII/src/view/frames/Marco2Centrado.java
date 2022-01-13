package view.frames;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

import view.panel.Lamina1;
import view.panel.LaminaDibujo;


public class Marco2Centrado extends JFrame{
	
	public Marco2Centrado()
	{
		//setBounds(350,450,300,250);
		//setVisible(true);
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		Dimension sizePantalla = miPantalla.getScreenSize();
		int anchoPantalla = sizePantalla.width;
		int alturaPantalla = sizePantalla.height;
		//setSize(anchoPantalla / 2 , alturaPantalla / 2);
		//setLocation(anchoPantalla / 4, alturaPantalla / 4);
		//size and location added on Bounds
		setBounds(anchoPantalla / 4, alturaPantalla / 4, anchoPantalla / 2, alturaPantalla / 2);
		setTitle("Marco 2 Centrado con Icono");
		
		Image miIcono = miPantalla.getImage("home.png");
		setIconImage(miIcono);
		//add(miLamina);
		add(lDibujo);
		lDibujo.setBackground(Color.orange);
		
	}
	Lamina1 miLamina = new Lamina1();
	LaminaDibujo lDibujo = new LaminaDibujo();
	
}
