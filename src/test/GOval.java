package test;
import java.awt.*;
public class GOval extends GShape{
	int w,h;
	public GOval(int x, int y, int h, int w) {
		super(x, y);
		this.h = h;
		this.w = w;
	}
	public void paint(Graphics g) {
		g.drawOval(x, y, 1, 1);
	}

}
