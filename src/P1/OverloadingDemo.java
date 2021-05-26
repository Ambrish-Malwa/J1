package P1;

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(5,7);
		add(1,2,3);
	}
	static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	static void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
//	static int add(int a, int b) {
//		System.out.println(a+b);
//		return a+b;
//	}
}
