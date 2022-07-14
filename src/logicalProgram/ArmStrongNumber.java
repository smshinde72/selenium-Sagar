package logicalProgram;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args)
	{
		// 123-->1^3+2^3+3^3=1+8+27=36---> this value not arm strong number
		// 153-->1^3+5^3+3^3=1+125+27=153-->this value is Arm strong number

//		Scanner sc=new Scanner(System.in);/User Input
//		System.out.println("Enter Value");
//		int orgNum=sc.nextInt();
		
		
		int orgNum=153;
		int armNum=0;
		
		for (int i=orgNum;i>0;i=i/10)//123,12,1
		{
			int abc = i%10;//3,2,1
			armNum=armNum+abc*abc*abc;
		}
		System.out.println("Original number is "+orgNum);
		System.out.println("Reverse number is "+armNum);
		
		if(orgNum==armNum)
		{
			System.out.println("The given Value is Arm Strong Number");
		}
		else
		{
			System.out.println("The given Value is NOT ArmStrong Number");
		}
		
	}

}
