package test;

public class Circle {
	int r;
	public Circle(int r) {
		this.r = r;
	}
	
	public double getArea() {
		return r* r *3.14;
	}
	
	public double getCircum() {
		return 2 * r * 3.14;
	}
}
