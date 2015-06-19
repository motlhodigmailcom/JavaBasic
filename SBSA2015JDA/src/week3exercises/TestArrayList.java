package week3exercises;

public class TestArrayList
{

	public static void main(String[] args)
	{
		int num = args.length;
		int[] arr = new int[num];
		
		arr[num - 1] = 10; 
		
		System.out.println(arr[num - 1]);
	}
}