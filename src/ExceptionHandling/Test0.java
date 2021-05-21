package ExceptionHandling;

public class Test0 {

	public static void main(String[] args) {
		try {
	int a=1/0;
		}
		catch(ArithmeticException a) {
			System.out.println("handled");
		}
	
	System.out.println("hello");

	}

}
