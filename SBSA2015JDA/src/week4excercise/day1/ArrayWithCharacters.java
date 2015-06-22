package week4excercise.day1;

public class ArrayWithCharacters
{
	static char[] charArray;

	public static void main(String[] args)
	{
		String fillArray = "The crazy old lady.";
		
		charArray = new char[fillArray.length()];
		
		
		for(int i = 0; i < charArray.length; i++)
		{
			charArray[i] = fillArray.charAt(i);
		}
		
		for(char tempChar : charArray)
		{
			System.out.print(tempChar);
		}
		//charArray = fillArray.toCharArray();
		
		//shuffle
		//sort
		//reverse
	}

}
