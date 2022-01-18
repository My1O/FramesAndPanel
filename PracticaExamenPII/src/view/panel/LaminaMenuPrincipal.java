package view.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LaminaMenuPrincipal extends JPanel{
	
	/**
	 * Author : Camilo Castro
	 */
	private static final long serialVersionUID = 1L;
	//boton principal en JPanel principal
	JButton colorAzul = new JButton("Color Azul");
	JButton colorVerde = new JButton("Color Verde");
	JButton colorGris = new JButton("Color Gris");
	
	public LaminaMenuPrincipal()
	{
		add(colorAzul);
		add(colorVerde);
		add(colorGris);
		
		ColorFondo azul = new ColorFondo(Color.blue);
		ColorFondo rojo = new ColorFondo(Color.red);
		ColorFondo gris = new ColorFondo(Color.gray);
		
		colorAzul.addActionListener(azul);
		colorVerde.addActionListener(rojo);
		colorGris.addActionListener(gris);
		
		imagen = new ImageIcon("src/imagenes/thank.jpg");
		label = new JLabel(imagen);
		add(label, BorderLayout.CENTER);
		
		/*
		ImageIcon ImageIcon = new ImageIcon("src/imagenes/thank.jpg");
	    Image Image = ImageIcon.getImage();
	    this.setIconImage(Image);
	    */
	}
	/*
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
		g.drawImage(imagen, 0, 0, null);
	}
	*/
	class ColorFondo implements ActionListener
	{
		public ColorFondo(Color c)
		{
			colorDeFondo = c;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			
			setBackground (colorDeFondo);
		}
		private Color colorDeFondo;
	}
	private ImageIcon imagen;
	private JLabel label;
}