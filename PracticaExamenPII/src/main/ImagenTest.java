package main;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImagenTest {

	public static void main(String[] args) 
	{
		TimeFrame tf = new TimeFrame();
	}
	
}
class TimeFrame extends JFrame
{
    //Image icon = Toolkit.getDefaultToolkit().getImage("me.jpg");
    ImageIcon icon = new ImageIcon("src/imagenes/circuito.jpg");

    JLabel label = new JLabel(icon);
    public TimeFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("My Frame");
        setSize(500,400);
        //this.setIconImage(icon);
        add(label,BorderLayout.CENTER);
        setVisible(true);
    }
}