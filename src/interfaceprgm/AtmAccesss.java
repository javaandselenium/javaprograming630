package interfaceprgm;

public class AtmAccesss implements Atm{

	@Override
	public void cardslot() {
		System.out.println("cardslot");
		
	}

	@Override
	public void eneterPin() {
		System.out.println("eneter the valid pin");
		
	}

	@Override
	public void collectAmt() {

System.out.println("collect the amt");
		
	}
	
	public static void main(String[] args) {
		AtmAccesss a=new AtmAccesss();
		a.cardslot();
		a.eneterPin();
		a.collectAmt();
	}

	

}
