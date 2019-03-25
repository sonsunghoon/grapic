package shape;

import java.awt.Graphics;



public class Line extends Shape {
	public void draw(Graphics graphics,int x,int y,int x1, int y1) {
		graphics.drawLine(x, y, x1+x, y1+y);	
		
	}
}
