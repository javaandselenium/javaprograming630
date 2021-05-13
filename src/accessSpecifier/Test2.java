package accessSpecifier;

public class Test2 {
	
	private int a=100;
	
	private void add() {
		System.out.println("private method");
	}
	
	private Test2() {
		System.out.println("private constructor");
	}
	
	public static void main(String[] args) {
		Test2 t=new Test2();
		t.add();
		System.out.println("private varaible "+t.a);
		
		Test4 t4=new Test4();
		System.out.println("protected varaible "+t4.a);
		t4.demo();
	}
	
	

}
