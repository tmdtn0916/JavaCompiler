package hello;

public class Circle {
	int r;
	public double getArea() {
		return 3.14 * r * r;
	}
	public double getCircum() {
		return 2 * r * 3.14;
	}
	public Circle() {
		this(7);
	}
	public Circle(int r) {
		this.r = r;
	}
}