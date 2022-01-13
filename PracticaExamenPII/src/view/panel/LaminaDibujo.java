package view.panel;

import java.awt.Color;
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
		g2.setColor(Color.blue);
		g2.fill(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.setPaint(new Color(20,200,150));
		g2.fill(elipse);
	}
}
