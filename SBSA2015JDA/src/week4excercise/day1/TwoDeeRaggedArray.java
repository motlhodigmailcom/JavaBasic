package week4excercise.day1;

import easyin.EasyInClass;

public class TwoDeeRaggedArray
{
	public static void main(String[] args)
	{
		EasyInClass ei = new EasyInClass();
		int tempColumn = 0;
		
		System.out.print("How many student marks do you want to enter?");
		int numStudents = ei.readInt();
		
		System.out.println();
		
		int[][] studentMarks = new int[numStudents][];
		String[] names       = new String[numStudents];
		int[] average        = new int[numStudents];
		int sum = 0;
		
		for(int i = 0; i < studentMarks.length; i++)
		{
			System.out.print("How many tests did student " + i + " write? ");
			tempColumn = ei.readInt();
			studentMarks[i] = new int[tempColumn];
		}
		
		System.out.println();
		
		for(int i = 0; i < studentMarks.length; i++)
		{
			System.out.print("Please enter the name for student " + 0 + ": ");
			names[i] = ei.readString();
		}
		
		System.out.println();
		
		for(int i = 0; i < studentMarks.length; i++)
		{
			sum = 0;
			for(int j = 0; j < studentMarks[i].length; j++)
			{
				System.out.print("Student " + names[i] + ": Please enter the test mark for test" + j  + ": ") ;
				studentMarks[i][j] = ei.readInt();
				sum += studentMarks[i][j];
			}
			average[i] = sum / studentMarks[i].length;
		}
		
		System.out.println();
		
		for(int i = 0; i < studentMarks.length; i++)
		{
			System.out.println("The average for " + names[i] + " is: " + average[i]);
		}
	}
}