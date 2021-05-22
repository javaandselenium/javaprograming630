package ExceptionHandling;

import java.io.FileInputStream;

public class Test6 {
	public void demo() {
		try {
		FileInputStream f=new FileInputStream("./l");}
		catch(Exception e) {
			System.out.println("handle");
		}
	}

	public static void main(String[] args) {
		Test6 t=new Test6();
		t.demo();

	}

}
