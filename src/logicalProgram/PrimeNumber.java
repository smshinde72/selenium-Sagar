package logicalProgram;

public class PrimeNumber {

	public static void main(String[] args) 
	{
	
		int num=10;
		int count=0;
		
		for(int i=2;i<=num-1;i++)
		{
			if(num%2==0)
			{
				count++;
				break;
			}
		}	
			if(count==1)
			{
				System.out.println("The given number is Not Prime Number");
			}
			else
			{
				System.out.println("The given number is Prime Number");
			}
			
			System.out.println("================================");
		
		}	
		
	}

