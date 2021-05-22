package string;

public class Test0 {

	public static void main(String[] args) {
	String s=" I LOVE JAVA ";
	System.out.println(s.length());
	System.out.println(s.charAt(4));
	System.out.println(s.startsWith(" "));
	System.out.println(s.endsWith(" "));
	System.out.println(s.substring(8,12));
	System.out.println(s.toLowerCase());
	System.out.println(s.toUpperCase());
	System.out.println(s.trim());
	System.out.println(s.concat("Selenium"));
	System.out.println(s.equals(" I LOVE Java "));
	System.out.println(s.equalsIgnoreCase(" i love java "));
	System.out.println(s.contains("JAVA"));

	}

}
