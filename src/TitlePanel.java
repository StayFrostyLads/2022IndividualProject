/*
 * The TitlePanel class functions as the primary page
 * that users view when they run the application.
 * 
 * 
 * @author Jack Nebeker
 * @version 1.0.0
 * @since 2022-03-23
 */

package panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TitlePanel extends JPanel {
	public static JButton pi, zelda, amongus, naruto, information, quit;
	// Declaring the buttons that the user will press to access other pages
	private JLabel title;
	JPanel series;
	
	public TitlePanel() {
		setLayout(null);
		title = new JLabel("Drawing Fourier Series For You!"); 
		pi = new JButton("Pi"); 
		zelda = new JButton("Zelda Triforce Symbol"); 
		amongus = new JButton("Among Us Character");
		naruto = new JButton("Hidden Leaf Symbol"); 
		information = new JButton("Basic Information on Fourier Series");
		quit = new JButton("Exit Application");
		
		title.setBounds(325,20,200,100);
		pi.setBounds(30,300,100,50);
		zelda.setBounds(160,300,200,50);
		amongus.setBounds(390,300,200,50);
		naruto.setBounds(620,300,150,50);
		information.setBounds(250,600,300,50);
		quit.setBounds(620,20,150,50);
		
		add(title);
		add(pi);
		add(zelda);
		add(amongus);
		add(naruto);
		add(information);	
		add(quit);
		
	}
}
