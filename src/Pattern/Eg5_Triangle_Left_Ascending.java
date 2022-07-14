package Pattern;

public class Eg5_Triangle_Left_Ascending {

	public static void main(String[] args)
	{
		//*
		//**
		//***
		//****
		//*****
		//******
		
		//row =6 ; column = 6
		
		int star = 1;
		
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			star++;
			System.out.println();
			
		}
	}

}
