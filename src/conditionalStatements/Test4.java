package conditionalStatements;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the marks");
       int marks = s.nextInt();
       
       if(marks>80 && marks<=100) {
    	   System.out.println("Grade A+");
       }
       else if(marks>60 && marks<=80) {
    	   System.out.println("Grade B+");
       }
       else if(marks>40 && marks<=60) {
    	   System.out.println("Grade c+");
       }
       else if(marks<40 && marks>=20) {
    	   System.out.println("fail");
       }
       else
       {
    	   System.out.println("Go home");
       }
	}

}
