package inhertiances;

public class AdvanceCal extends BasicCal{
	public void sinteta() {
		System.out.println("sinteta");
	}
	
	public void costeta() {
		System.out.println("costeta");
	}
	
	public static void main(String[] args) {
		AdvanceCal a=new AdvanceCal();
		a.add();
		a.sub();
		a.sinteta();
		a.costeta();
	}

}
