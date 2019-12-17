package proiect_intref;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View {
	
	public static JFrame mainFrame = new JFrame("Schimb valutar");
	public static JPanel controlPanel=new JPanel();
	public static String[] values = { "RON", "EUR", "USD"};
	public static JComboBox box1= new  JComboBox(values);
	public static JComboBox box2= new  JComboBox(values);
	public static JButton buton= new JButton("=>");
	public static JTextField text1= new JTextField();
	public static JTextField text2= new JTextField();
	public static JLabel label= new JLabel("suma de convertit:");
	
	
	public static void main(String[] args) {
		mainFrame.add(controlPanel);
		 text1.setPreferredSize( new Dimension( 50, 24 ) ); 
		 text2.setPreferredSize( new Dimension( 50, 24 ) ); 
		 buton.addActionListener(new MyActionListener());
		
		mainFrame.setSize(500, 110);
		controlPanel.add(label);
		controlPanel.add(text1);
		controlPanel.add(box1);
		controlPanel.add(buton);
		controlPanel.add(text2);
		controlPanel.add(box2);
	    mainFrame.setVisible(true);
	 
	}
	
	

}
