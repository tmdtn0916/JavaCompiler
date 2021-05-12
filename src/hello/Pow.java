package hello;

public class Pow {
	public static int pow(int a, int b) {
		if(b==0)
			return 1;
		else
			return a*pow(a,b-1);
	}
	public static void main(String[] args) {
		System.out.println(pow(2,2));
	}

}
