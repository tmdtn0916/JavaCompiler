package hello;

public class Manager2 extends Employee{
	String dept;

	public Manager2(String name, String ssn, String idnum, String dept) {
		super(name, ssn, idnum);
		this.dept = dept;
	}
	public void work() {
		System.out.printf("%s�� %s���� ������ ���մϴ�.", name, dept);
	}
}
