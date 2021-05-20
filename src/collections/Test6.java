package collections;

import java.util.ArrayList;

public class Test6 {

	public static void main(String[] args) {

		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20.90);
		a.add("Hello");
		a.add("");
		a.add('A');
		a.add(10);
		
		for(Object ele:a) {
			System.out.println(ele);
		}

	}

}
