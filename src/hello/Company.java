package hello;

public class Company {
	public static void main(String args[]) {
	
		Employee kim = new Employee("�谳��", "990303-1234567", "0307111");
		kim.setTitle("�븮");
		kim.work();
		
		Manager2 hong = new Manager2("ȫ����", "980202-2245678", "9903321", "���ߺ�");
		hong.setTitle("����");
		hong.work();
	}
}
