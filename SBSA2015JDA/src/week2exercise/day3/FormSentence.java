package week2exercise.day3;

import java.util.Scanner;

public class FormSentence
{

	public static void main(String[] args)
	{
		int numbers[] = new int[10];
		
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.println("Enter number " + i);
			numbers[i] = new Scanner(System.in).nextInt();
		}
		
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.print((char) numbers[i]);
		}
	}
}