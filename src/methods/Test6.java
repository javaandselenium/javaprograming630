package methods;

public class Test6 {
	int a=10;
	static int b=100;
	
	public static void add() {
		System.out.println("adding");
	}
	
	public void sub() {
		System.out.println("subtracting");
	}

	public static void main(String[] args) {
	System.out.println(Test6.b);
	Test6.add();
	
	Test6 t=new Test6();
	t.sub();
	System.out.println(t.a);
	

	}

}
