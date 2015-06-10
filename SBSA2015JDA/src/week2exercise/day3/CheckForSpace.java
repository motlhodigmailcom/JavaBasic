package week2exercise.day3;

import java.util.Scanner;

public class CheckForSpace
{

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		boolean spaceFound = false;
		System.out.println("Please enter a string");
		String strLine = new Scanner(System.in).nextLine();
		
		for (int i = 0; i < strLine.length(); i++)
		{
			if(Character.isSpaceChar(strLine.charAt(i)))
			{
				spaceFound = true;
			}
		}
		String message = (spaceFound) ? "There is a space" : "There is no space";
		
		System.out.println(message);
	}
}
