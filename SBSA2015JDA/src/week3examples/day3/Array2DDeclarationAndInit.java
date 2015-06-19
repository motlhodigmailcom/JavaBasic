package week3examples.day3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array2DDeclarationAndInit
{

	public static void main(String[] args)
	{
		//legal declarations
		//------------------
		int[][] scores1; 
		int[] []scores2;
		int[] scores5[];
		int []scores4[];
		int [][]scores3;
		int scores6[][];
		
		
		scores1 = new int[3][5]; //row length = 3 (top to bottom); column length = 5 (left to right)
		Arrays.fill(scores1, 20);
		
		/** ======================================================== **/
		/** Nested for loops: The inner loop will execute completely **/
		/** ======================================================== **/
		
		for(int i = 0; i < scores1.length; i++) //ROWS
		{
			for(int j = 0; j < scores1[0].length; j++) //COLUMNS
			{
				System.out.print(scores1[i][j] + "\t");
			}
			System.out.println();
		}	
	}
}