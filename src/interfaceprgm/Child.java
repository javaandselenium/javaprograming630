package interfaceprgm;

public class Child extends Parent1 implements Parent2,Parent3{

	@Override
	public void cycle() {
		System.out.println("cycle");
		
	}

	@Override
	public void bike() {
		System.out.println("bike");
		
	}
	public static void main(String[] args) {
	
	Child c=new Child();
	c.car();
	c.cycle();
	c.bike();

}}
