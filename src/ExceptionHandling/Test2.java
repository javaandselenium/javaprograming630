package ExceptionHandling;

public class Test2 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
try {
		System.out.println(a[5]);
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("handled");
}
	
catch(ArithmeticException ae) {
	int i=1/0;
}
	System.out.println("hello ");
	

	}

}
