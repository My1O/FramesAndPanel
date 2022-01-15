package main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FileWriteconJframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoEscritor me = new MarcoEscritor();
		
	}

}
class MarcoEscritor implements ActionListener
{
	public MarcoEscritor()
	{
		GridLayout g1 = new GridLayout();
		g1.setColumns(2);
		g1.setRows(3);
		
		window.setLayout(g1);
		
		window.add(NombreDeUsuario);
		window.add(userName);
		window.add(Contrasena);
		window.add(pass);
		window.add(blank);
		window.add(Login);
		
		Login.addActionListener(this);
		window.setSize(600,600);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	JFrame window = new JFrame("Marco principal");
	JTextField userName = new JTextField();
	JTextField pass = new JTextField();
	JLabel NombreDeUsuario = new JLabel("Nombre del usuario");
	JLabel Contrasena = new JLabel("Contrasena");
	JButton Login = new JButton("Ingresar");
	JLabel blank = new JLabel("");
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand()== Login.getActionCommand())
		{
			try 
			{
				file = new FileWriter ("/ingreso.txt");
				file.write(NombreDeUsuario.getText() + " : " + userName.getText() );
				file.write(Contrasena.getText() + " : " + pass.getText() );
				file.close();
				JOptionPane.showMessageDialog(null, "File Written Successfully");
			} 
			catch (Exception ex) 
			{
				JOptionPane.showMessageDialog(null, ex+"");
			}
		}
		
	}
	private FileWriter file;
}