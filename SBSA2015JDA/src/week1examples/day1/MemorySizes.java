package week1examples.day1;

/*****************************/
/*|*|  bytes  |*|  8 bits |*|*/
/*****************************/
/*|*|  short  |*| 16 bits |*|*/
/*****************************/
/*|*|  int    |*| 32 bits |*|*/
/*****************************/
/*|*|  long   |*| 64 bits |*|*/
/*****************************/
/*|*| float   |*| 32 bits |*|*/
/*****************************/
/*|*|  double |*| 64 bits |*|*/
/*****************************/

/*
 * Page 33 of 270 Module 2 book ICTWorx Integer primitive data types
 * **************************** 1) byte 2) short 3) int 4) long
 * 
 * ************************* Real primitive data type *************************
 * 1) float 2) double
 * 
 * *********************** Boolean primitive type *********************** 1)
 * boolean
 * 
 * ****************************** Character primitive data type
 * ****************************** 1) char
 */

class MemorySizes
{
	public static void main(String args[])
	{
		int a = 10;
		double b = a; // implicit cast
						// explicit cast would be double b = (double) a;

		double c = 10.5;

		int e = (int) c;

		float ff = 20.5f;

		short s = (short) ff;

	}
}