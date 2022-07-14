package logicalProgram;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of A ");
		int a = sc.nextInt();
		
		System.out.println("Enter value of B ");
		int b = sc.nextInt();
		
		int sum=a+b;
		
		System.out.println("Sum of A and B is="+sum);
		

	}

}
