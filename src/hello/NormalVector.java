package hello;

import java.util.Vector;

public class NormalVector {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		//v.add("Hello");
		
		int sum = 0;
		for (Object o : v) {
			Integer s = (Integer) o;
			sum = sum + s;
		}
		System.out.printf("ÇÕ°è = %d, Æò±Õ =%.2f\n", sum, sum/(double)v.size());
	}
}
