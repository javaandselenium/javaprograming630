package interfaceprgm;

public class PaymentAccess implements Payment {

	@Override
	public void cardNumb() {
		System.out.println("eneter the cardnumb");
	}

	@Override
	public void cvvNumb() {
	System.out.println("eneter the cvv numb");
		
	}

	@Override
	public void expireDate() {
		System.out.println("expire date");
		
	}
public static void main(String[] args) {
	PaymentAccess p=new PaymentAccess();
	p.cardNumb();
	p.expireDate();
	p.cvvNumb();
	
}}
