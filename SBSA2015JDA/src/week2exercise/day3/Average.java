package week2exercise.day3;

import java.util.Scanner;

public class Average
{

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		double mark1, mark2, mark3, mark4, mark5;
		
		final int TOTAL = 75;
		
		System.out.println("Please enter mark1");
		mark1 = Double.parseDouble(new Scanner(System.in).next());
		System.out.println("Please enter mark2");
		mark2 = Double.parseDouble(new Scanner(System.in).next());
		System.out.println("Please enter mark3");
		mark3 = Double.parseDouble(new Scanner(System.in).next());
		System.out.println("Please enter mark4");
		mark4 = Double.parseDouble(new Scanner(System.in).next());
		System.out.println("Please enter mark5");
		mark5 = Double.parseDouble(new Scanner(System.in).next());
		
		System.out.println("Mark 1: " + mark1 + "\tPercentage 1: " + mark1/TOTAL * 100);
		System.out.println("Mark 2: " + mark2 + "\tPercentage 2: " + mark2/TOTAL * 100);
		System.out.println("Mark 3: " + mark3 + "\tPercentage 3: " + mark3/TOTAL * 100);
		System.out.println("Mark 4: " + mark4 + "\tPercentage 4: " + mark4/TOTAL * 100);
		System.out.println("Mark 5: " + mark5 + "\tPercentage 5: " + mark5/TOTAL * 100);
		System.out.println("Average : " + (mark1 + mark2 + mark3 + mark4 + mark5) / 5);
	}

}
