package week2exercise.day3;

import java.util.Scanner;

public class ConvertLetters
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		char charValue = ' ';
		System.out.println("Please enter letter");
		charValue = new Scanner(System.in).next().charAt(0);
		System.out.println("The letter you entered is: " + charValue);
		System.out.println("small " + charValue + " is " + Character.toLowerCase(charValue));
	}
}