package encapsulation;

public class Test1 {

	public static void main(String[] args) {
		Test0 t=new Test0();
		System.out.println(t.getName());
		System.out.println(t.getEmpId());
		System.out.println(t.getEmpSal());
		t.setEmpSal(2000.00);
		System.out.println("after changeing the salary "+t.getEmpSal());
		
		

	}

}
