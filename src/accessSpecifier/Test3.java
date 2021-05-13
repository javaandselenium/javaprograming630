package accessSpecifier;

public class Test3 {
	
	int a=10;
	
	void add() {
		System.out.println("deault method");
	}
	
	Test3(){
		System.out.println("default constructor");
	}

	public static void main(String[] args) {
		Test3 t3=new Test3();
		System.out.println("default varaible "+t3.a);
		t3.add();
	}

}
