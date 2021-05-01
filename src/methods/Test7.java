package methods;

public class Test7 {

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void add(int a, double b) {
		System.out.println(a + b);
	}

	public void add(double b, int a) {
		System.out.println(b + a);
	}

	public static void main(String[] args) {
		Test7 t=new Test7();
		t.add(20.30, 90);
		t.add(10,20,30);

	}

}
