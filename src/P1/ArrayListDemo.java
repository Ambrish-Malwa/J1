package P1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al= new ArrayList();
		al.add(87);
		al.add("Ambrish");
		al.add(2018);
		al.add("Yuri");
		
		Iterator itr= al.iterator();			//???
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(".....2nd way to retreive the values in AL................");
		for (Object ob: al) {							//Object ??
			System.out.println(ob);
		}
		System.out.println("..........................");
		
		ArrayList<String> al2= new ArrayList<String>();				//genric provides restriction 
		al2.add("Hello");
		al2.add("GM");
		for (String s: al2) {							//Object ??
			System.out.println(s);
		}
	}

}
