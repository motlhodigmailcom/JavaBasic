package week3examples.day2;

import java.text.NumberFormat;
import java.util.Scanner;

import week1examples.day2.StringCommands;

public class ArrayExample
{

	public static void main(String[] args)
	{
		//NumberFormat
		Scanner mScanner = new Scanner(System.in);
		System.out.println("How many tracks are there on your CD?");
		int trackTotal = mScanner.nextInt();
		
		String[] trackName = new String[trackTotal];
		int[] trackTime = new int[trackTotal]; //or also: int[] trackTime = new int[trackName.length]
		
		for(int i = 0; i < trackTotal; i++ )
		{
			System.out.println("Enter the name for trackName[" + i + "]");
			trackName[i] = mScanner.next();
			System.out.println("Enter the length for trackTime[" + i + "]");
			trackTime[i] = mScanner.nextInt();
		}
		
		StringCommands.drawLine();
		System.out.println("CD Information");
		StringCommands.drawLine();
		for(int i = 0; i < trackTotal; i++ )
		{
			System.out.println("Track at " + i + " is " + trackName[i]);
			System.out.println("Time  at " + i + " is " + trackTime[i]);
			System.out.println();
		}
		mScanner.close();
	}
}