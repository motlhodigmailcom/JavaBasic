package week3examples.day3;

public class Array2DDeclarationAndInit2
{

	public static void main(String[] args)
	{
		int[][] age = {{4, 7, 8, 5, 2},
		               {7, 4, 7, 5, 6},
		               {6, 2, -7, 3, 55} 
		              };
		
		int total = 0, average = 0, lowestAge = age[0][0], highestAge = age[0][0];
		
		for(int i = 0; i < age.length; i++ )
		{
			for(int j = 0; j < age[0].length; j++ )
			{
				total += age[i][j];
				
				if(i > 0 && j > 0)
				{
					if(age[i][j] < lowestAge)
						lowestAge = age[i][j];
					
					if(age[i][j] > highestAge)
						highestAge = age[i][j];
				}				
			}
		}
		
		average = total / (age.length * age[0].length);
		
		System.out.println("The lowest  age is " + lowestAge);
		System.out.println("The average age is " + average);
		System.out.println("The highest age is " + highestAge);
	}
}
