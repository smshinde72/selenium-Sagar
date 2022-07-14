package Pattern;

public class E11_EquilateralTriangle_Upward_WithSpacing {

	public static void main(String[] args) 
	{
		//    *   
		//   * *
		//  * * *
		// * * * *
		//* * * * *
		
		//row =5  col=9
		
		int space=4;
		int star=1;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star++;
			space--;
		}

	}

}
