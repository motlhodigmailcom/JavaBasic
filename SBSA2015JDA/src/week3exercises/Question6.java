package week3exercises;

import java.util.Scanner;

public class Question6
{

	public static void main(String[] args)
	{
		Scanner mScanner = new Scanner(System.in);
		String name;
		int age;
		double height, weight;
		boolean flag = true;
		
		
		System.out.println("Enter your name");
		name = mScanner.nextLine();
		
		while (!name.equalsIgnoreCase("zzz") )
		{
			System.out.println("Enter age");
			age = mScanner.nextInt();
			
			System.out.println("Enter height");
			height = mScanner.nextDouble();
			
			System.out.println("Enter weight");
			weight = mScanner.nextDouble();
			
			
			if(!((age > 21) && (age < 35)))
			{
				flag = false;
			}
			if(!(height > 170))
			{
				flag = false;
			}
			if (!(weight > 60))
			{
				flag = false;
			}
			
			if(flag)
			{
				System.out.println("You qualify " + name);
				System.out.println("=======================");
				System.out.println("Age    : " + age);
				System.out.println("Height : " + height);
				System.out.println("Weight : " + weight);
				System.out.println("=======================");
			}
			
			System.out.println("Enter your name");
			name = mScanner.nextLine();
		}
		
		

	}

}
