package panel;

import javax.swing.*;
import java.awt.*;

public class InformationPanel extends JPanel {
	public static JButton home, quit;
	private JLabel title, sawtooth, semicircle, triangle, square;
	public static JSlider sawslider, semislider, trislider, sqslider;
	
	public InformationPanel() {
		setLayout(null);
		title = new JLabel("Information"); 
		title.setBounds(325,20,200,100);
		add(title);
		
		sawtooth = new JLabel("saw");
		sawtooth.setBounds(100,200,200,200);
		add(sawtooth);
		
		semicircle = new JLabel("semi");
		semicircle.setBounds(400,200,200,200);
		add(semicircle);
		
		triangle = new JLabel("tri");
		triangle.setBounds(100,500,200,200);
		add(triangle);
		
		square = new JLabel("sq");
		square.setBounds(400,500,200,200);
		add(square);
		
		home = new JButton("Home");
		add(home);
		
		quit = new JButton("Exit Application");
		quit.setBounds(620,20,150,50);
		add(quit);
		
		sawslider = new JSlider(0, 100, 1);
		sawslider.setBounds(200,210,0,0);
		add(sawslider);
		
		semislider = new JSlider(0, 100, 1);
		semislider.setBounds(500,210,0,0);
		add(semislider);
		
		trislider = new JSlider(0, 100, 1);
		trislider.setBounds(200,710,0,0);
		add(trislider);
		
		sqslider = new JSlider(0, 100, 1);
		sqslider.setBounds(500,710,0,0);
	}

}
