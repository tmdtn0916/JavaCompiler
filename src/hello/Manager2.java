package hello;

public class Manager2 extends Employee{
	String dept;

	public Manager2(String name, String ssn, String idnum, String dept) {
		super(name, ssn, idnum);
		this.dept = dept;
	}
	public void work() {
		System.out.printf("%s는 %s에서 열심히 일합니다.", name, dept);
	}
}
