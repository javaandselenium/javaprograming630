package collections;

import java.util.LinkedList;

public class Test13 {

	public static void main(String[] args) {
		LinkedList p=new LinkedList<>();
		p.add(10);
		p.add(100);
		p.add(1);
		p.add(30);
		p.add(3);
		
		System.out.println(p.getFirst());
		System.out.println(p.getLast());
	}

}
