package hello;

public class CircleUser {

	public static void main(String[] args) {

		Circle myCircle = new Circle();
		Circle myCircle2 = new Circle(7);

		System.out.println(myCircle.getArea());
		System.out.println(myCircle.getCircum());
		
		System.out.println(myCircle2.getArea());
		System.out.println(myCircle2.getCircum());

	}

}
