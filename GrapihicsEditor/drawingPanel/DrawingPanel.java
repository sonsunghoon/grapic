package drawingPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

import global.Constants.EToolBar;
import shape.Shape;

public class DrawingPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private MouseHandler mouseHandler;
	
	private Shape currentTool;
	public void setCurrentTool(Shape shape) {
		this.currentTool = shape;
		
	}
	
	public DrawingPanel() {
		
		this.setBackground(Color.WHITE);
		
		this.mouseHandler = new MouseHandler();
		this.addMouseListener(this.mouseHandler);
		this.addMouseMotionListener(this.mouseHandler);
		
		//currentTool = EToolBar.rectangle.getshape();
	}
	
	private void drawShape(int x, int y, int w, int h) {
		Graphics graphics = this.getGraphics();//그림도구를 가져오는 함수. 
		graphics.setXORMode(getBackground());
		currentTool.draw(graphics,x, y, w, h);
	}
	
	private class MouseHandler implements MouseListener, MouseMotionListener{//얘는 뭘 해라 라고 교통정리만 한다.
		private int x0, y0, x1, y1;
		
		
		public void mouseClicked(MouseEvent e) {
			
		}

		public void mousePressed(MouseEvent e) {
			x0 = e.getX();
			y0 = e.getY();
			x1 = e.getX();
			y1 = e.getY();
			drawShape(x0, y0, x1-x0, y1-y0);
			

		}
		
		public void mouseReleased(MouseEvent e) {
		
		}

		public void mouseDragged(MouseEvent e) {
			drawShape(x0, y0, x1-x0, y1 -y0);
			x1 = e.getX();
			y1 = e.getY();
			drawShape(x0, y0, x1-x0, y1 -y0);
		}

		public void mouseMoved(MouseEvent e) {
			
		}
		
		public void mouseEntered(MouseEvent e) {
		}
		public void mouseExited(MouseEvent e) {
		}

	}

}
