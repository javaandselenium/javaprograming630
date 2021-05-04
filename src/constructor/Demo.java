package constructor;

public class Demo {

	Demo(int a) {
		System.out.println(a);
	}

	Demo(int a, double b) {
		System.out.println(a + b);
	}

	Demo(double a, int b) {
		System.out.println(a + b);
	}

	Demo(int a, double b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		Demo d=new Demo(10,20.30);
		Demo d1=new Demo(20);

	}

}
