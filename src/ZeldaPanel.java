package panel;

import javax.swing.*;

public class ZeldaPanel extends JPanel {
	
	public static JButton home, quit;
	private JLabel title;
	
	public ZeldaPanel() {
		title = new JLabel("Zelda Triforce Symbol"); 
		title.setBounds(50,50,200,50);
		add(title);
		
		home = new JButton("Home");
		add(home);
		
		quit = new JButton("Exit Application");
		add(quit);
		
	}

}
