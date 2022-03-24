package panel;

import javax.swing.*;

public class AmongUsPanel extends JPanel {
	
	public static JButton home, quit;
	private JLabel title;
	
	public AmongUsPanel() {
		title = new JLabel("Among Us Character"); 
		title.setBounds(50,50,200,50);
		add(title);
		
		home = new JButton("Home");
		add(home);
		
		quit = new JButton("Exit Application");
		add(quit);
		
	}

}
