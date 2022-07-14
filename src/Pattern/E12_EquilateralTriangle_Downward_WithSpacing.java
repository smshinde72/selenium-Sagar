package Pattern;

public class E12_EquilateralTriangle_Downward_WithSpacing {

	public static void main(String[] args) {
		// * * * * * *
        //  * * * * *
		//   * * * * 
		//    * * *
		//     * *
		//      *
		
		//roe=6 col=11
		
		int space=0;
		int star=6;
		
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=space;j++)
			{
			  System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("0 ");
			}
			System.out.println();
			star--;
			space++;
		}
	}

}
