package myjava;

public class Watch extends Thing implements Valuable{
	String brand;
	public Watch(String b) {
		super("½Ã°è");
		brand = b;
	}
	public int value() {
		return 10000;
	}
}
