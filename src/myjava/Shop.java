package myjava;

public class Shop {
	String name;
	
	public Shop(String name) {
		this.name = name;
	}
	
	public void sell(Valuable v, String goods) {
		System.out.print(name +"에서 ");
		System.out.print(v.value() + "원어치 ");
		System.out.println(goods + "를 팔았습니다.");
	}
	
	public static void main(String args[]) {
		Shop myshop = new Shop("자바 슈퍼");
		Money money = new Money(5000);
		Watch watch = new Watch("로렉스");
		Trash trash = new Trash();
		//Thing thing = new Thing("물건");
		
		myshop.sell(money, "과자");
		myshop.sell(watch, "음료수");
		//myshop.sell(trash, "아이스크림");
	}	
}