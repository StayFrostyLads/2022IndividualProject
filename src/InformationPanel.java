package panel;

import javax.swing.*;
import java.awt.*;

/*
 * Class for creating GUI specifics for the Information Panel that contains information about Fourier Series with a visual aid.
 * 
 * @author Jack Nebeker
 * @version 1.0.0
 * @since 2022-03-23
 * 
 */
public class InformationPanel extends JPanel {
	public static JButton home, quit;
	private JLabel title;
	
	public InformationPanel() {
		setLayout(null);
		title = new JLabel("Information"); 
		title.setBounds(325,20,200,100);
		add(title);
		
		home = new JButton("Back to Home");
		home.setBounds(250,600,300,50);
		add(home);
		
		quit = new JButton("Exit Application");
		quit.setBounds(620,20,150,50);
		add(quit);
		
	}

}
