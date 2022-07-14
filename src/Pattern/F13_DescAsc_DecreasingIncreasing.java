package Pattern;

public class F13_DescAsc_DecreasingIncreasing {

	public static void main(String[] args) {
//	0	//******
//	1	//*****
//	2	//****
//	3	//***
//	4	//**
//	5	//*
//	6	//**
//	7	//***
//	8	//****
//	9	//*****
//	10	//******
		
//		row=11  col=6
		
		
		int star=6;
		
		for(int i=1;i<=11;i++)
		{
		
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
	
			System.out.println();
		
			if(i<=5)
			{
				star--;
			}
			else
			{
				star++;
			}
		}
		
		System.out.println("=====Another eg ======");
		
		int star1 = 5; //Count Total no of star in first Row
		for(int i=1; i<=9; i++) // Outer for loop used for No. of Rows
		{
		for(int j=1; j<=star1; j++) // Inner for loop for Col
		{
		System.out.print("*");
		}
		System.out.println();
		//star--;
		if(i<5) // OR (i<=4) // For Descending star
		{
		star1--;
		}
		else // For Ascending star
		{
		star1++;
		}
		}

	}

}
