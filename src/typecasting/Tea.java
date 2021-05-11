package typecasting;

public class Tea extends Coffee{
	
	public void hottea() {
		System.out.println("hottea");
	}
	
	public void coldtea() {
		System.out.println("coldtea");
	}
	
	public static void main(String[] args) {
		Coffee c=new Tea();
		c.hotcoffee();
		c.coldCoffee();
		
	}

}
