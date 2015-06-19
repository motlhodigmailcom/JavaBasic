package week3exercises.day3;

public class Suspect
{
	public static void main(String[] args)
	{
		String[] suspects = new String[5];
		suspects[0] = "pilot";
		suspects[1] = "helicopter";
		suspects[2] = "pad";
		suspects[3] = "flying";
		suspects[4] = "license";
		
		for(String sus : suspects)
		{
			System.out.println(sus);
		}
		
		for(int i = 0; i < suspects.length; i++)
		{
			if(suspects[i] == "flying")
			{
				System.out.println(suspects[i] + " is at index " + i);
				break;
			}
		}
	}
}