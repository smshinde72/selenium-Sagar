package logicalProgram;

import java.util.Scanner;

public class Odd_EvenNumbers {

	public static void main(String[] args) 
	{
	
//		System.out.println(15/2); //--->Dividation operation done
//		System.out.println(15%2); //--->Modular operation done 
		
		
//		System.out.println(153%10);//-->dividation is 153/10=15-->Modular is 153%10=3
//		System.out.println(15%10);//-->dividation is 15/10=1 -->Modular is 15%10=5
//		System.out.println(1%10);//-->dividation is 1/10=15 -->Modular is 1%10=1

		Scanner sc =new Scanner(System.in);
		System.out.println("Plz enter value");
		
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("Given value is Even");
		}
		else
		{
			System.out.println("Given value is Odd");
		}
		{
			
		}
	}

}
