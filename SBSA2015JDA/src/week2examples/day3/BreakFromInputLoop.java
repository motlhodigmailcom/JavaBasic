package week2examples.day3;

import java.util.Scanner;

public class BreakFromInputLoop
{

	public static void main(String[] args)
	{
		String name="", codeEntered="asdf";
		int age = 0;
		
		Scanner mScanner = new Scanner(System.in);
		
		while(!codeEntered.equals("12345"))
		{
			System.out.print("Please enter a name");
			name = mScanner.next();
			System.out.print("Please enter a age");
			age = mScanner.nextInt();
			
			System.out.print("To quit press 12345");
			codeEntered = mScanner.next();
		}
		System.out.print("Name : " + name + "\t age : " + age);

	}

}
