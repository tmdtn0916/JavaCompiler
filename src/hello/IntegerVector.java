package hello;

import java.util.Vector;

public class IntegerVector {

	public static void main(String[] args) {		
			Vector<Integer> v = new Vector<Integer>();
			v.addElement(10);
			v.addElement(20);
			//v.add("hello");
			int sum = 0;
			for (Integer s : v) {
				sum = sum + s;			
		}	System.out.printf("�հ� = %d, ��� = %.2f\n", sum, sum/(double)v.size());
	}
}
