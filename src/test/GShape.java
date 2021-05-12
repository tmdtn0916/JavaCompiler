package test;
import java.awt.*;
public abstract class GShape {
	
	int x ,y;
	public GShape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public abstract void paint(Graphics g);
}
