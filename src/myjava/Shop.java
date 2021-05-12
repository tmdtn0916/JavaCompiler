package myjava;

public class Shop {
	String name;
	
	public Shop(String name) {
		this.name = name;
	}
	
	public void sell(Valuable v, String goods) {
		System.out.print(name +"���� ");
		System.out.print(v.value() + "����ġ ");
		System.out.println(goods + "�� �Ⱦҽ��ϴ�.");
	}
	
	public static void main(String args[]) {
		Shop myshop = new Shop("�ڹ� ����");
		Money money = new Money(5000);
		Watch watch = new Watch("�η���");
		Trash trash = new Trash();
		//Thing thing = new Thing("����");
		
		myshop.sell(money, "����");
		myshop.sell(watch, "�����");
		//myshop.sell(trash, "���̽�ũ��");
	}	
}