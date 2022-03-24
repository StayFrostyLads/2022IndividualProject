package panel;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;

public class Circle extends JFrame {
	
	static double time;
	int size, x, y;

	/*
	 * Constructor
	 */
	public Circle() {
		setTitle("Drawing a Circle");
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        time = 0;
        size = 0;

	}
	

	public Circle(int x, int y) {
		
	}
	
	@Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        Ellipse2D circle1 = new Ellipse2D.Float(x, y, size, size);
        circle1.setFrame(x, y, size, size);
        g2d.draw (circle1);
        g2d.drawLine(0,0,0,0);
    }
	
	@Override
	public void setLocation(int x, int y) {
		super.setLocation(x-(size/2), y-(size/2));
	}
	@Override
	public void setLocation(Point p) {
		super.setLocation((int)p.getX()-size/2,(int)p.getY()-size/2);
	}
    public static void main(String[] args) {

       Circle firstCircle = new Circle();
       firstCircle.setVisible(true);
       
//       while () {
//    	   time += 0.01;
//       }
       

    }
}
