package logicalProgram;

public class ReverseNumber {

	public static void main(String[] args) 
	{
	
		int a=123;
		
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter Value");
//	    int a=sc.nextInt();
		
		String RevStr = Integer.toString(a); //Convert Int to string
		String SS="";
		
		for(int i=RevStr.length()-1;i>=0;i--)
		{
			SS=SS+RevStr.charAt(i);
		}
		 int RevInt = Integer.parseInt(SS);//Convert String to int
		 
		System.out.println("The reverse int Value is "+RevInt);
	}

}
