package myjava;

public class Money extends Thing implements Valuable {
	int value;
	public Money(int value) {
		super("��");
		this.value = value;
	}
	public int value() {
		return value;
	}
}
