package Pattern;

public class Eg7_Triangle_Right_Descending {

	public static void main(String[] args)
	{
		//****** 
		// *****
		//  ****
		//   ***
		//    **
		//     *

//	row=6  column =6
		
		int Star = 6;
		int space=0;
		
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=Star;j++)
			{
				System.out.print("*");
			}	

		Star--;
		space++;
		System.out.println();
		}
	}
}
