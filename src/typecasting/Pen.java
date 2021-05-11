package typecasting;

public class Pen extends Paper{
	public void redPen() {
		System.out.println("redpen");
	}
	
	public void bluepen() {
		System.out.println("bluepen");
	}

	public static void main(String[] args) {
	//upcasting
		Paper p=new Pen();
		p.whitePaper();
		p.blackPaper();
		
	//downcasting
Pen p1=(Pen)p;
p1.redPen();
p1.bluepen();
	}

}
