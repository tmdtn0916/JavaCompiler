package hello;

public class Company2 {

	public static void main(String[] args) {
		
		Employee kim, hong;
		kim = new Employee("±è°³¶Ë","990303-123456", "0307111");
		kim.setTitle("´ë¸®");
		kim.work();
		
		hong = new Manager2("È«¸»ÀÚ", "980202-123456789", "9903321", "°³¹ßºÎ");
		hong.setTitle("°úÀå");
		hong.work();
	}
}
