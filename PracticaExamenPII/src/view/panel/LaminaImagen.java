package view.panel;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class LaminaImagen extends JPanel{
		public LaminaImagen()
		{
			
		}
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			//File miImagen = new File("src/imagenes/codigo.jpg");
			try {
				//imagen = ImageIO.read(miImagen);
				imagen = ImageIO.read (new File("src/imagenes/circuito.jpg")) ;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.getMessage();
				System.out.println("No se encontro la imagen");
			}
			
			g.drawImage(imagen, 10, 10, null);
		}
		
		private Image imagen;
}
