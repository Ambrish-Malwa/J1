package P1;

import java.io.IOException;

public class ExceptionDemo2 extends ExceptionDemo{

	static ExceptionDemo d1;
	static ExceptionDemo2 d2;
	public static void main(String[] args) {
		d1= new ExceptionDemo2();
		//d1.checkedxcption();       //cant throws excep as not compatible with main() but  can use Try-Catch
		d2= new ExceptionDemo2();
		d2.m1();
	}
	
	public void m1() {
		try {
			d1.checkedxcption();
		} catch (IOException e) {
			System.out.println("I am a checked exception");
			//e.printStackTrace();
		}
	}
	
	

}
