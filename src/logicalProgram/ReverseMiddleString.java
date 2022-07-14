package logicalProgram;

public class ReverseMiddleString {

	public static void main(String[] args) 
	{
		// I LOVE MY INDIA
		
		String a ="I LOVE MY INDIA";
		
		//even place index
		
		String[] ar = a.split(" ");
		
		// ar[]={"I", "LOVE","MY","INDIA"}
		//        1      2    3      4
		
		for(int i=0;i<=ar.length-1;i++)
		{
			if(i%2==0)//even [print except even numbers][prints as per index num]
			{
				String s = ar[i];
				ar[i]=Reverse(s);
				
			}
			
			System.out.println(ar[i]);
		}
	}
	public static String Reverse(String Inp)
	{
		String Rev="";
		
		for(int i=Inp.length()-1;i>=0;i--)
		{
			Rev=Rev+Inp.charAt(i);
		}
		
		return Rev;
		
	}

}
