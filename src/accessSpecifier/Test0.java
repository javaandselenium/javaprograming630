package accessSpecifier;

public class Test0 {
	
	public int a=10;
	
	public void add() {
		System.out.println("public method");
	}
	
	public Test0() {
		System.out.println("public constructor");
	}

	public static void main(String[] args) {
		Test0  t=new Test0();
		System.out.println("public varaible "+t.a);
		t.add();

	}

}
