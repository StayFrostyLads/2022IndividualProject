package panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Inheritance Y2 concept
public class TitlePanel extends JPanel {
	public static JButton pi, zelda, amongus, naruto, information, quit;
	// Declaring the buttons that the user will press to access other pages
	private JLabel title;
	JPanel series;
	
	public TitlePanel() {
		setLayout(null);
		title = new JLabel("Drawing Fourier Series For You!"); 
		
		title.setBounds(325,20,200,100);
	
		add(title);
		
		pi = new JButton("Pi"); 
		zelda = new JButton("Zelda Triforce Symbol"); 
		amongus = new JButton("Among Us Character");
		naruto = new JButton("Hidden Leaf Symbol"); 
		information = new JButton("Basic Information on Fourier Series");
		quit = new JButton("Exit Application");
		
		pi.setBounds(30,300,100,50);
		zelda.setBounds(160,300,200,50);
		amongus.setBounds(390,300,200,50);
		naruto.setBounds(620,300,150,50);
		information.setBounds(250,600,300,50);
		quit.setBounds(620,20,150,50);
		
		add(pi);
		add(zelda);
		add(amongus);
		add(naruto);
		add(information);	
		add(quit);
		
	}
}
