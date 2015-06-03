package week1excercise.day1;

public class FlyByNight
{

	public static void main(String[] args)
	{
		int intVal = 126;
		byte byteVal = 0;
		
		byteVal = (byte) intVal;
		
		System.out.printf("the byteVal is %d \n", byteVal);
		byteVal++;
		System.out.printf("the byteVal after increment is %d \n", byteVal);
		byteVal++;
		System.out.printf("the byteVal another increment is %d \n", byteVal);
		
		long longVal = 0L;
		int intVal2 = 126;
		
		longVal = intVal2;
		System.out.printf("the longVal is %d \n", longVal);
		longVal++;
		System.out.printf("the longVal is %d \n", longVal);
		longVal++;
		System.out.printf("the longVal is %d \n", longVal);

	}
}
