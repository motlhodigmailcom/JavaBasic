package week3exercises.day3;

public class RunForCover
{

	public static void main(String[] args)
	{
		int[][] myArr = new int[2][5];
		int highestValue, lowestValue;
		
		for(int j = 0; j < myArr[0].length; j++)
		{
			myArr[0][j] = (int) (Math.random() * 98) + 1;
		}
		
		highestValue = myArr[0][0];
		lowestValue  = myArr[0][0];
		
		for(int j = 0; j < myArr[0].length; j++)
		{
			if(myArr[0][j] > highestValue)
				highestValue = myArr[0][j];
			
			if(myArr[0][j] < lowestValue)
				lowestValue = myArr[0][j];
		}
		
		myArr[1][0] = highestValue;
		myArr[1][myArr[0].length - 1] = lowestValue;
		
		for(int i = 0; i < myArr.length; i++)
		{
			for(int j = 0; j < myArr[0].length; j++)
			{
				System.out.print(myArr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int j = 0; j < myArr[0].length; j++)
		{
			System.out.print(myArr[1][j] + " ");
		}
	}
}