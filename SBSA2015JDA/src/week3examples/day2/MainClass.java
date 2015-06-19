package week3examples.day2;

public class MainClass
{
	public static void main(String args[]) {
	    int sum = 0;
	    int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	   /* int[] age;
	    age = new int[5];*/

	    // Use for to display and sum the values.
	    for (int x : nums) {
	      System.out.println("Value is: " + x);
	      sum += x;
	      if (x == 5){
	        break; // stop the loop when 5 is obtained
	      }
	    }
	    System.out.println("Summation of first 5 elements: " + sum);
	  }
}