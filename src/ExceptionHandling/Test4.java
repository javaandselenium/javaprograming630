package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test4 {
	
	public void demo() throws FileNotFoundException {
		FileInputStream f=new FileInputStream("./D");
		System.out.println("hello");
	}

	public static void main(String[] args) {
	Test4 t=new Test4();
	try {
	t.demo();
	}
	catch(Exception e) {
		System.out.println("Handle");
	}

	}

}
