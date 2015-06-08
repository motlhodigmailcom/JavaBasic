package week2examples.day1;

import easyin.EasyInClass;
//import java.util.Scanner;

public class UseEasyIn
{
	public static void main(String[] args)
	{
		//Scanner mScanner = new Scanner(System.in);
		EasyInClass mEasyInClass = new EasyInClass();
		int    inputAge;    // the age input variable by the user
		double inputSalary; // the salary input variable by the user
		String inputName;   // the name input variable by the user
		
		
		
		//System.out.println("Please enter your age in year and press enter");
		System.out.println("Please enter your age in year and press enter");
		inputAge = mEasyInClass.readInt();
		System.out.println("Please enter your salary, and press enter");
		inputSalary = mEasyInClass.readDouble();
		System.out.println("Please enter your name and press enter");
		inputName = mEasyInClass.readString();
		
		System.out.println("Thank you. You are " + inputAge + " years old!");
		System.out.println("Your salary is R" + inputSalary);
		System.out.println("Your name is " + inputName);
	}
}
