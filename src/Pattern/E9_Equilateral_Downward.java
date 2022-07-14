package Pattern;

public class E9_Equilateral_Downward {

	public static void main(String[] args) 
	{  
		//*********
      //   *******
		//  *****
		//   ***
		//    *
		
		//row=5;column=9
		
		int star=9;
		int space=0;
		
		for(int i=1;i<=5;i++)// Outer For Loop; Rows= 4
		{
			for(int j=1;j<=space;j++)// Inner for Loop for space
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)// Inner for Loop for star
			{
				System.out.print("*");
			}
			System.out.println();
			space++;// Increment of Space by 1
			star=star-2;// Decrement of Star by 2
		}
		
		System.out.println("================================");
		
//=====Another Way=======
		int star1=1;
		int space1=6;
		
		for(int i=1;i<6;i++)
		{
			for(int j=1;j<=space1;j++)
			{
				System.out.print("");
			}
			for(int j=1;j<=star1;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		star1++;
		space1--;
		}

	}

}
