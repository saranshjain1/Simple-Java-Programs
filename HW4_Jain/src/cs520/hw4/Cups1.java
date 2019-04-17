package cs520.hw4;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class Cups1 extends JPanel {
	
	// default variable to prevent the warning
	private static final long serialVersionUID = 1L;
	
	// variable declarations
	private Integer startX;
	private Integer startY; 
	private Integer cupWidth;
	private Integer cupHeight;
	
	private Integer baseLength;
	private Integer cupSpacing;
	
	
	public Cups1() {
		
		this.startX = 100;
		
		this.startY = 300;
		
		this.cupWidth = 25;
		
		this.cupHeight = 40;
		
		this.baseLength = 7;
		
		this.cupSpacing = 6;
	}
	
	
	@Override
	public void paint(Graphics g) {
		
		// convert graphics object to graphics2d object
		Graphics2D g2d = (Graphics2D) g;
		
		// start from base length to first row
		for (int i = this.baseLength; i >=0; i--) {
			
			// if even set color of cups to blue else red
			if (i % 2 == 0) {
				g2d.setColor(Color.BLUE);
			}
			else {
				g2d.setColor(Color.RED);
			}
			
			// add cups in that row
			for (int j=0; j < i; j++) {
				
				g2d.fillRect(this.startX + j * (this.cupWidth + this.cupSpacing), this.startY, this.cupWidth, this.cupHeight);
				
			}
			
			// increase the start position 
			this.startX = this.startX + this.cupWidth - this.cupSpacing;
			
			// reduce the height
			this.startY = this.startY - this.cupHeight;
		}
	}
	
	
	public static void main(String [] args) {
		
		// declare a JFrame object
		JFrame frame = new JFrame("Jain's cups V1");
		
		// add class to our frame object
		frame.add(new Cups1());
		
		// set the canvas size to 550 x 550
		frame.setSize(550, 550);
		
		// set the visibility to true
		frame.setVisible(true);
		
		// close the panel
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
