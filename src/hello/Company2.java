package hello;

public class Company2 {

	public static void main(String[] args) {
		
		Employee kim, hong;
		kim = new Employee("�谳��","990303-123456", "0307111");
		kim.setTitle("�븮");
		kim.work();
		
		hong = new Manager2("ȫ����", "980202-123456789", "9903321", "���ߺ�");
		hong.setTitle("����");
		hong.work();
	}
}
