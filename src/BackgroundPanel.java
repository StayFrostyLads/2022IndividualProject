package panel;

import java.awt.*;
import javax.swing.*;

public class BackgroundPanel extends JPanel {
    JPanel series;
    public static JButton quit, title;
    
	public BackgroundPanel() {
		
		quit = new JButton("Quit");
		title = new JButton("Title Screen");
		
		quit.setBounds(10, 10, 100, 30);
		title.setBounds(120, 10, 120, 30);
		
		add(quit);
		add(title);
	}
}
