package hello;

public class Manager extends Employee{
	String dept;
	
	public Manager(String name, String ssn, String idnum, String dept) {
		super(name, ssn, idnum);
		this.dept = dept;
	}
}
