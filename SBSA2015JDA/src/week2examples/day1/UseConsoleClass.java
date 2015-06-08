package week2examples.day1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class UseConsoleClass
{
	static int    inputAge;    // the age input variable by the user
	static double inputSalary; // the salary input variable by the user
	static String inputName;   // the name input variable by the user

	public static void main(String[] args)
	{
		DecimalFormat mDecimalFormat = new DecimalFormat("R ###,###.00");
		
		System.out.print("Please enter your age in year and press ENTER : ");
		inputAge = Integer.parseInt(System.console().readLine());
		System.out.print("Please enter your salary, and press ENTER : ");
		inputSalary = Double.parseDouble(System.console().readLine());
		System.out.print("Please enter your name and press ENTER : ");
		inputName = System.console().readLine();
		
		System.out.println("Thank you. You are " + inputAge + " years old!");
		System.out.println("Your salary is "     + mDecimalFormat.format(inputSalary));
		System.out.println("Your name is "       + inputName);
		
		System.out.println("---- Using System.console() class ----");
		

	}

}
