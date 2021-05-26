package P1;

public class Test3InterfaceImplementation implements InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test3InterfaceImplementation t3= new Test3InterfaceImplementation();
		t3.m1();
		t3.m2();
		
	}

	public void m1(){
		System.out.println("I am m1 overridden method of an interface");
	}
	public void m2(){
		System.out.println("I am  m2 overridden method of interface");
	}

	@Override
	public void m3() {
		System.out.println("I am m3 ");
		
	}

}
