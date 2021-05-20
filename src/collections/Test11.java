package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test11 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add(20);
		a.add(60);
		a.add(5);
		a.add(30);
		a.add(100);
		
		System.out.println("before sorting "+a);
		Collections.sort(a,Collections.reverseOrder());
		System.out.println("after sorting "+a);

	}

}
