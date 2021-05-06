package conditionalStatements;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the marks");
       int marks = s.nextInt();
       
       switch(marks) {
       case 1:System.out.println("Grade A+");
       break;
       case 2:System.out.println("Grade B+");
       break;
       case 3:System.out.println("Grade C+");
       break;
       case 4:System.out.println("Grade D+");
       break;
       case 5:System.out.println("Grade E+");
       break;
       default:System.out.println("go home");
       
       }
	}

}
