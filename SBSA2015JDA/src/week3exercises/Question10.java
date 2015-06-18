package week3exercises;

import java.util.Scanner;

public class Question10
{

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		int number = 0, count = 0, countj = 0;
		char continue_yn = 'y';
		
		System.out.println("Enter an integer value from 1 through 10");
		number = new Scanner(System.in).nextInt();
		
		while (number >= 1 && number <= 10 && continue_yn == 'y')
		{
			for(int i = 0; i <= number; i++)
			{
				for(int j = 0; j < i; j++)
				{
					System.out.print("*" + " ");
				}
				System.out.println();
			}
			
			count = number - 1;
			System.out.println();
			
			do
			{
				countj = count;
				do
				{
					System.out.print("*" + " ");
					countj--;
				} while(countj >= 0);
				
				System.out.println();
				count--;
			} while(count >= 0);
			
			System.out.println("Do you want to continue?");
			continue_yn = Character.toLowerCase(new Scanner(System.in).next().charAt(0));
		}
		
	}
}