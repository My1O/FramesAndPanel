package view.panel;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import view.frames.Marco2Centrado;

public class LaminaImagen extends JPanel 
{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public LaminaImagen()
		{
			
		}
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			//File miImagen = new File("src/imagenes/codigo.jpg");
			try {
				//imagen = ImageIO.read(miImagen);
				imagen = ImageIO.read (new File("src/imagenes/hand.jpg")) ;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.getMessage();
				System.out.println("No se encontro la imagen");
			}
			
			g.drawImage(imagen, 0, 0, null);
			//g.copyArea(50, 50, 20, 90, 130, 130);
			
			int anchuraImagen = imagen.getWidth(this);
			int alturaImagen = imagen.getHeight(this);
					
			
			for(int i=0; i<3;i++)
			{
				for(int j=0; j<2;j++)
				{
					if(i+j>0) {
					g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen*i,alturaImagen*j);
					}
					
				}
			}
		}
		
		private Image imagen;

	
}
