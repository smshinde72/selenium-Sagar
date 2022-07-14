package Pattern;

public class Eg8_Triangle_Right_Acending {

	public static void main(String[] args)
	{
		//    *
		//   **
		//  ***
		// ****
      //  *****
	//   ******
		//
		//
	
	// column=6  row 6
		
		int star=1;
		int space=5;
		
		for(int i=1;i<6;i++)
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
		star++;
		space--;
		}
	
	}

}
