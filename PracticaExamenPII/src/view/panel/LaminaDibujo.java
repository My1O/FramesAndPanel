package view.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class LaminaDibujo extends JPanel{
	public LaminaDibujo()
	{
		
		
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		//g.drawRect(50, 50, 200, 200);
		
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		g2.setColor(Color.red);
		g2.fill(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.setPaint(new Color(20,200,150));
		g2.fill(elipse);
		//creando fuente
		Font miFuente = new Font("Arial", Font.BOLD,26);
		g2.setFont(miFuente);
		g2.drawString("Camilo", 160, 80);
		g2.setFont(new Font("Arial",Font.ITALIC,14));
		g2.setColor(new Color(128,90,50));
		g2.drawString("Ejemplo Java", 160, 180);
		
	}
}
