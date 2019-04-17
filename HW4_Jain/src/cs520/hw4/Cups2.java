package cs520.hw4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cups2 extends JPanel {
	
	// default variable as we are extending from JPanel
	private static final long serialVersionUID = 1L;
	
	// variable declarations
	private Integer startX;
	private Integer startY; 
	private Integer cupWidth;
	private Integer cupHeight;
	
	private Integer baseLength;
	private Integer cupSpacing;
	
	
	public Cups2() {
		
		this.startX = 100;
		
		this.startY = 300;
		
		this.cupWidth = 25;
		
		this.cupHeight = 40;
		
		this.baseLength = 7;
		
		this.cupSpacing = 6;
	}
	
	
	@Override
	public void paint(Graphics g) {
		
		// convert graphics object to a graphics2d class object
		Graphics2D g2d = (Graphics2D) g;
		
		// start from the base length to first row 
		for (int i = this.baseLength; i>=0; i--) {
			
			// set the color to red or blue 
			if (i % 2 == 0){
				g2d.setColor(Color.BLUE);
			} else {
				g2d.setColor(Color.RED);
			}
			
			// copy the variable startX in a temp variable
			int startX = this.startX;
			
			// start filling the number of cups in each row
			for (int j=1; j<=i; j++) {
				
				// since we have to draw a shape which is close 
				// to a rectange, we need 4 points in widths and heights
				// which will represent the positions. These positions are
				// top/left, top/right, bottom/left, bottom/right
				int [] widths = {
						startX + this.cupWidth - 5, 
						startX + this.cupWidth + this.cupWidth,
						startX + this.cupWidth + this.cupWidth - 5,
						startX + this.cupWidth
				};
				
				// 
				int [] heights = {
						this.startY + this.cupHeight,
						this.startY + this.cupHeight,
						this.startY,
						this.startY
				};
				
				
				// fill in the polygon 
				g2d.fillPolygon(widths, heights, 4);
				
				// set the startX to a new position
				startX = startX + this.cupWidth + this.cupSpacing;
				
			}
			
			// reduce the height so that we can start for next row from bottom
			this.startY = this.startY - this.cupHeight;
			
			// increase the start position of x
			this.startX = this.startX + this.cupWidth - this.cupSpacing;
			
		}
		
	}
	
	
	public static void main(String [] args) {
		
		// declare the name of our jframe
		JFrame frame = new JFrame("Jain's cups V2");
		
		// add class to jframe object
		frame.add(new Cups2());
		
		// set the size of canvas
		frame.setSize(550, 550);
		
		// set visibility of jframe
		frame.setVisible(true);
		
		// exit of close
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}