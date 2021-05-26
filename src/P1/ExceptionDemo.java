package P1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExceptionDemo {
	static Properties prop;				//user to load the file form FileInputStream

	public static void main(String[] args) {
		
		//arithmeticExcpDemo();
		//nullPointerExcepDemo();
		//arrayIndexOutOfBoundsExcepDemo();
		//sysExitDemo();
	}
	static void arithmeticExcpDemo() {
		try {
			int a=10;
			int b=0;
			System.out.println(a/b);	
		}
		catch(Exception e){
			System.out.println("plz change value of b");
		}
		finally {
			System.out.println("I am in finally block");
		}
	}
	
	static void nullPointerExcepDemo() {
		
		String s=null ;
		System.out.println(s.length());
	}
	
	static void arrayIndexOutOfBoundsExcepDemo() {
		int [] ar= new int[5]; 
		ar [6]=10;
		System.out.println(ar[6]);
	}
	
	static void sysExitDemo() {
		try {
			int a=10;
			int b=2;
			System.out.println(a/b);	
			System.exit(0);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("plz change value of b");
		}
		finally {
			System.out.println("I am in finally block after systemExit");
		}
	}
	
	public static void checkedxcption() throws IOException
	{
		FileInputStream fip=new FileInputStream("C:\\Users\\ambri\\eclipse-workspace\\mmt\\src\\main\\java\\com\\mmt\\qa\\config\\config.properties");
		prop.load(fip);
		//FileInput stream fetch the file and keep this in pipeline so that it can be loaded in future.
		System.out.println("I am a checked exception");
	}
	
}
