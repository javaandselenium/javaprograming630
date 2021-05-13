package accessSpecifier;

public class Test1 {

	public static void main(String[] args) {
		Test0  t=new Test0();
		System.out.println("public varaible "+t.a);
		t.add();
		
		
		Test3 t3=new Test3();
		System.out.println("default varaible "+t3.a);
		t3.add();
		

}
}