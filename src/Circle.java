package panel;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;

public class Circle extends JFrame {
	
	static double time, x, y;
	int radius;

	/*
	 * Constructor
	 */
	public Circle() {
		setTitle("Drawing Fourier Series");
        setSize(1000, 1000);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        time = 0;
        radius = 0;

	}
	

	public Circle(int x, int y) {
		
	}
	
	@Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        while (time < 360) {
        	radius = 100;
            g2d.translate(0, 0);
            Ellipse2D circle1 = new Ellipse2D.Float(0, 0, radius*2, radius*2);
            circle1.setFrame(20, 120, radius, radius);
            g2d.draw (circle1);
            
            x = radius * Math.cos(time);
            y = radius * Math.sin(time);
            g2d.translate(20,120);
            Ellipse2D.Double circle2 = new Ellipse2D.Double(x, y, 3, 3);
            g2d.fill (circle2);
            for (int i = 0; i < 360; i+=360) {
            g2d.rotate (Math.toRadians(i), x + radius * 2, y + radius * 2);
            time += 0.01;
            g2d.draw (circle2);
            }
        }
    }
	
	@Override
	public void setLocation(int x, int y) {
		super.setLocation(x-(radius/2), y-(radius/2));
	}
	@Override
	public void setLocation(Point p) {
		super.setLocation((int)p.getX()-radius/2,(int)p.getY()-radius/2);
	}
    public static void main(String[] args) {

       Circle firstCircle = new Circle();
       firstCircle.setVisible(true);
       

       

    }
}
