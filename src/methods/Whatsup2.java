package methods;

public class Whatsup2 extends Whatsup{
	
	public void status() {
		System.out.println("message+photo+video");
		super.status();
	}
	
	public static void main(String[] args) {
		Whatsup2 w=new Whatsup2();
		w.status();
	}

}
