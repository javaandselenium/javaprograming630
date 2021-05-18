package encapsulation;

public class Test2 {

	public static void main(String[] args) {
		Studentdetails s=new Studentdetails();
		System.out.println(s.getName());
		System.out.println("Before changeing the course name " +s.getCouseName());
		s.setCouseName("Java and selenium");
		System.out.println("After changeing the course details "+s.getCouseName());
	    System.out.println(s.getFees());
	}

}
