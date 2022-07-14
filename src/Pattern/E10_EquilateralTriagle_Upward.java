package Pattern;

public class E10_EquilateralTriagle_Upward {

	public static void main(String[] args) {
		//   
		//    *
		//   ***
		//  *****
		// *******
		//*********
		
		
//		row=5 col=9
		
		int star=1;
		int space=4;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star=star+2;
			space--;
		}

	}

}
