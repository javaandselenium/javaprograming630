package ExceptionHandling;

import java.io.FileInputStream;

public class Test1 {

	public static void main(String[] args) {
		try {
		FileInputStream f=new FileInputStream("./D");
		}
		catch(Exception e) {
		System.out.println(e);
		}
		
		System.out.println("hello");
	}

}
