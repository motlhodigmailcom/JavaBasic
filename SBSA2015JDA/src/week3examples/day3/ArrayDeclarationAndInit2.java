package week3examples.day3;

public class ArrayDeclarationAndInit2
{

	public static void main(String[] args)
	{
		String[] trackName = {"Me n you", "You alone", "Me alone"} ;

		int[] trackTime = {345, 432, 655} ;

		for(int i = 0; i < trackName.length; i++)
		{
			if(trackTime[i] > 400 && trackTime[i] < 500)
			{
				System.out.println(i + ".\tTrack name: " + trackName[i] + "\tTrack time:" + trackTime[i]);
			}
		}
	}
}