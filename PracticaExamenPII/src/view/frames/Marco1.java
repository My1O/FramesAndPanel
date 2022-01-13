package view.frames;

import java.awt.Frame;
import javax.swing.*;
import java.awt.*;

import javax.swing.JFrame;

public class Marco1 extends JFrame{
	
	
	public Marco1()
	{
	//	setSize(600,300);
		// setLocation(450,200);
		setBounds(500,300,550,250);
		setResizable(false);
		//setExtendedState(Frame.MAXIMIZED_BOTH); -- also work with value 6 -- constant value at https://docs.oracle.com/javase/7/docs/api/constant-values.html#java.awt.Frame.MAXIMIZED_BOTH
		setTitle("Mi Marco numero 1 - Inicial");
	}
	
	
}
