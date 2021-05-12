package hello;

public class Company {
	public static void main(String args[]) {
	
		Employee kim = new Employee("±è°³¶Ë", "990303-1234567", "0307111");
		kim.setTitle("´ë¸®");
		kim.work();
		
		Manager2 hong = new Manager2("È«¸»ÀÚ", "980202-2245678", "9903321", "°³¹ßºÎ");
		hong.setTitle("°úÀå");
		hong.work();
	}
}
