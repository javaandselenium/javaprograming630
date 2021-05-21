package ExceptionHandling;

public class Test3 {

	public static void main(String[] args) {
		try {
			int a=1/0;
		}
			
		catch(Exception e) {
			System.out.println("handled");
		}
		finally {	
			System.out.println("hello close db");
		}
	}

}
