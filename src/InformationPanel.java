package panel;

import javax.swing.*;

public class InformationPanel extends JPanel {
	
	public static JButton home, quit;
	private JLabel title, sawtooth, semicircle, triangle, square;
	public static JSlider slider;
	
	public InformationPanel() {
		title = new JLabel("Information"); 
		title.setBounds(50,50,200,50);
		add(title);
		
		sawtooth = new JLabel("Sawtooth Wave Thing here");
		sawtooth.setBounds(20,200,100,100);
		add(sawtooth);
		
		semicircle = new JLabel("semi");
		semicircle.setBounds(20,300,100,100);
		add(semicircle);
		
		triangle = new JLabel("tri");
		triangle.setBounds(220,200,100,100);
		add(triangle);
		
		square = new JLabel("sq");
		square.setBounds(220,300,100,100);
		add(square);
		
		home = new JButton("Home");
		add(home);
		
		quit = new JButton("Exit Application");
		add(quit);
		
		slider = new JSlider(0, 100, 1);
		add(slider);
	}

}
