package logicalProgram;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		//Palindrome means MOM is reverse is MOM this is called palindrome 
		//MADAM reverse is MADAM then this id cslled palindrome
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Plz enter string value");
		
		String x = sc.next();
		String y="";
		
		for (int i=x.length()-1;i>=0;i--)
		{
			y=y+x.charAt(i);
		}
		System.out.println("The reversr string value is "+y);
		System.out.println();
		
		if(x.equals(y))
		{
			System.out.println("The given string value is Palindrome");
		}
		else
		{
			System.out.println("The given string value is NOT Palindrome");
		}
	}

}
