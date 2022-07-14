package logicalProgram;

public class ReverseNumWithoutString {

	public static void main(String[] args) 
	{
//		System.out.println(15/2); //--->Dividation operation done
//		System.out.println(15%2); //--->Modular operation done 
		
		
//		System.out.println(153%10);//-->dividation is 153/10=15-->Modular is 153%10=3
//		System.out.println(15%10);//-->dividation is 15/10=1 -->Modular is 15%10=5
//		System.out.println(1%10);//-->dividation is 1/10=15 -->Modular is 1%10=1

		int num=123;
		
		int revNum=0;
		
		for(int i=num;i>0;i=i/10)//123,12,1
		{
			int abc=i%10; //3,2,1

		    revNum=revNum*10+abc;
		  //0+3->3
		  //30+2->32
		  //320+1->321
		}
		System.out.println("Originalnumber is "+num);
		System.out.println("Reverse number is "+revNum);
		
		
	}

}
