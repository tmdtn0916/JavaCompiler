package hello;
import java.awt.*;
public abstract class Shape {
	protected int x;
	protected int y;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void moveBy(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}
	public abstract void paint(Graphics g);
}
