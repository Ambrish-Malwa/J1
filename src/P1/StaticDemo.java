package P1;

public class StaticDemo {
	String name;
	int age;
	static String colegeName= "BHSBIET_Lehra";
	
	public static void main(String[] args) {
		StaticDemo s1= new StaticDemo ("Ambrish", 33);
		StaticDemo s2= new StaticDemo ("David", 32);
		s1.display();
		s2.display();

	}
	
	StaticDemo(String s, int n){
		name=s;
		age=n;
		//System.out.println(name+ age+ colegeName);
	}

	void display(){
		System.out.println(name+ age+ colegeName);
	}
	
	static {
		System.out.println("I am in static block");				// no need to call
	}
	
	static {
		System.out.println("I am in second static block");
	}
}
