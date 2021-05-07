package inhertiances;

public class Father extends GrandFather{
	
	public void car() {
		System.out.println("car from father");
	}
	
	public static void main(String[] args) {
		Father f=new Father();
		f.car();
		f.home();
	}

}
