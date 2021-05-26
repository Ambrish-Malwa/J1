package P1;

public class Test2 extends Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Test2 t2= new Test2();
	Test1 t1= new Test2();  //compiler will check if the method is in parent or not, compiler is done;
							//now JVM will check if the same method is in child also, if yes, priority will be of child
	//Test1 t1= new Test1();
	t1.m1();
	
	t2.m2("hello");
	t2.m2(5);
	t2.m3("hello ", 0);
	t1.m11();
	m12();
	//t1.m13();
	t1.m14();
	t2.m15();
	t1.m16();
	t2.m17();
	t1.m18();
	
	}
	public void m1(){
		 System.out.println("I am in Test2");
	 }
	
	void m2(String s) {
		System.out.println(s);
	}
	
	void m2(int i) {
		System.out.println(i);
	}
	 
	void m3(String s1, int i1) {
		System.out.println( s1 + i1);
	}
	//void m14() {		
	//}
	
	void m16() {
		System.out.println("I am a child but also in Test1 and Test2");
	}
	void m17() {
		System.out.println("I am in Test2 only and called by object of t1");
	}
	void m18() {
		System.out.println("m18 is overridden in Test2");
	}
	
}
