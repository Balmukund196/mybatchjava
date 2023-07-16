package Assignment.java;

public class CheckLeapYearPostiveandNegative 
{
	public static void main(String[] args) 
	{
int year = 2000;
		
		if (((year % 4 == 0) && (year % 100!= 0)) || (year % 400 == 0)) 
		{
			System.out.println("LEAP YEAR");
		} 
		else 
		{
			System.out.println("COMMON YEAR or NON LEAP YEAR");
		}
		int number = 5;
		if (number > 0) 
		{
			System.out.println("POSITIVE number");
		}
		else
		{
			System.out.println("negative number");
		}
	
}

	}

