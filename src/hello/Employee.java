package hello;

public class Employee {
	String name, idnum, ssn, title;
	
	public Employee(String name, String ssn, String idnum) {
		this.name = name;
		this.ssn = ssn;
		this.idnum = idnum;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void work() {
		System.out.printf("%s는 열심히 일합니다. \n", name);
	}
	
}
