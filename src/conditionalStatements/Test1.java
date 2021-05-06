package conditionalStatements;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
	//int age=18;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age");
		int age = s.nextInt();
	
	if(age>=18) {
		System.out.println("Applyling DL");
	}
	else
	{
		System.out.println("not appying DL");
	}

	}

}
