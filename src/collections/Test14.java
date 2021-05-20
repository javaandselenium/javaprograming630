package collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Test14 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(20);
		t.add(2);
		t.add(100);
		t.add(50);
		t.add(20);
		t.add(30);
		
		System.out.println("Deault behaviour "+t);
		NavigableSet set = t.descendingSet();
		System.out.println(set);

	}

}
