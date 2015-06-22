package week3exercises.day3;

public class TwoDeeArray
{
	public static void main(String[] args)
	{
		int[][] myIntArray = new int[8][4];
		int count = 1;
		
		for(int i = 0; i < myIntArray.length; i++)
		{
			for(int j = 0; j < myIntArray[0].length; j++)
			{
				myIntArray[i][j] = count++;
				System.out.print(myIntArray[i][j] + "\t");
			}
			System.out.println();
		}
	}
}