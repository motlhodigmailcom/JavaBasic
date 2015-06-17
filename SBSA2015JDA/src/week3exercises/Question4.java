package week3exercises;

import java.util.Scanner;

public class Question4
{

	public static void main(String[] args)
	{
		Scanner mScanner = new Scanner(System.in);
		int total = 0, number = 0;
		
		System.out.println("Enter a number");
		number = mScanner.nextInt();
		
		while(total <= 40 )
		{
			total += number;
			System.out.print(number + "+");
			System.out.println("Enter a number");
			number = mScanner.nextInt();
		}
		mScanner.close();
	}
}
