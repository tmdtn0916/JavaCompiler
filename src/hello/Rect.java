package hello;

public class Rect {
	int w, h;
	
	public Rect(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public Rect() {
		this(10,7);
	}
	
	public int getArea() {
		return w * h;		
	}
	public int getCircum() {
		return 2 * (w + h);
	}
}