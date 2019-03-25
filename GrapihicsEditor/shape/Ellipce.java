package shape;

import java.awt.Graphics;

public class Ellipce extends Shape {
	public void draw(Graphics graphics,int x,int y,int width, int height) {
		graphics.drawOval(x, y, width, height);	
}
	}
