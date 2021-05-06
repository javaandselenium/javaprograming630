package conditionalStatements;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the time");
		int time = s.nextInt();
		
		if(time<=12) {
			System.out.println("Good morning");
		}
		else if(time>12 && time<=18) {
			System.out.println("good noon");
		}
		else
		{
			System.out.println("good evening");
		}
		

	}

}
