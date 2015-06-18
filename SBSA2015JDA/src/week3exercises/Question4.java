package week3exercises;

import java.util.Scanner;

public class Question4
{

	public static void main(String[] args)
	{
		String total_string = "";
		Scanner mScanner = new Scanner(System.in);
		int total = 0, number = 0;
		
		System.out.println("Enter a number");
		number = mScanner.nextInt();
		
		while(total <= 40 )
		{
			total += number;
			total_string += (number + " + ");
			//System.out.print(number + "+");
			System.out.println("Enter a number");
			number = mScanner.nextInt();
		}
		System.out.print(total_string);
		mScanner.close();
	}
}
