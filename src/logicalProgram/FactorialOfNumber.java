package logicalProgram;

public class FactorialOfNumber {

	public static void main(String[] args)
	{
		//  4!=4x3x2x1=24;
		
		int a=4;
		int fact =1;
		
		for(int i=a;i>=1;i--)
		{
			 fact = i*fact;
			 
			// 4*1=4;
			// 3*4=12
			// 2*12=24;
			// 1*24=24
		}
		System.out.println(fact);
	}
	
}
