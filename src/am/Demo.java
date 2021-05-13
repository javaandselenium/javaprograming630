package am;

import accessSpecifier.Test0;
import accessSpecifier.Test2;
import accessSpecifier.Test3;
import accessSpecifier.Test4;

public class Demo extends Test4 {

	public static void main(String[] args) {
		Test0  t=new Test0();
		System.out.println("public varaible "+t.a);
		t.add();

		Demo t4=new Demo();
		System.out.println("protected varaible "+t4.a);
		t4.demo();
	}

}
