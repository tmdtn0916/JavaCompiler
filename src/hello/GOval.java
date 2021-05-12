package hello;

import java.awt.Graphics;
public class GOval extends Shape{
	
	public GOval(int x, int y) {
		super(x, y);
	}
	public void paint(Graphics g) {
		g.drawOval(x,  y,  120,  120);
	}
}
