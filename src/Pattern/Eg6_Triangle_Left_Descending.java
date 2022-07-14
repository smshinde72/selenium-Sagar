package Pattern;

public class Eg6_Triangle_Left_Descending {

	public static void main(String[] args)
	{
		//******
		//*****
		//****
		//***
		//**
		//*
		
		
		//row=6 col=6
		
		int star=6;
		
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
				
			}
			star--;
			System.out.println();
		}
		
		
	}

}
