package week2exercise.day3;

import java.util.Scanner;

public class ShowLength
{

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		int digitCount = 0;
		
		System.out.println("Please enter a string");
		String strValue = new Scanner(System.in).nextLine();
		
		for(int i = 0; i < strValue.length(); i++)
		{
			if(Character.isDigit(strValue.charAt(i)))
			{
				digitCount++;
			}
		}
		
		System.out.println("There are " + (strValue.length() - digitCount) + " letters");
	}
}