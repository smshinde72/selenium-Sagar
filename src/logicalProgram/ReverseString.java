package logicalProgram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Plz enter string to be reversed");
		
//		String a="VELOCITY";
		String a = sc.next();
		String rev="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
			
		}
			System.out.println("reverse string is "+rev);
	}

}
