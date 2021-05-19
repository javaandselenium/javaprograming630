package collections;

import java.util.Vector;

public class Test1 {

	public static void main(String[] args) {
		Vector v=new Vector();
		
		v.add(10);
		v.add(20.09);
		v.add("");
		v.add(10);
		v.add("Hello");
		v.add('A');
		v.add("");
		v.add(10);
		v.add("Hello");
		v.add('A');
System.out.println("The value it is storeing "+v.size());
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
		System.out.println("current capacity "+v.capacity());
	}

}
