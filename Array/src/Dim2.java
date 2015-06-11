
public class Dim2 {

	public static void main(String[] args) {

	   int[][]  temp   = {{27,66,13,45},
			              {55,13,18,66},
			              {07,19,45,13},
			              {27,77,18,33}, 
			              {06,98,13,77},
			              {12,45,18,33}};
	   
	   String   day [] = {"MON","TUE","WED","THU","FRI","SAT"};
	   String   hour[] = {"1AM","2AM","3AM","4AM",};
	   
	   System.out.print("\t" );
	   for (int i=0; i< hour.length; i++){
		  
		   System.out.print(hour[i] + "\t" );
	   }
	   
	   System.out.println("");
	   
	   for (int i=0; i< temp.length; i++){
		   System.out.print(day[i] + "\t" );
		   for (int j=0; j<4; j++){
			   System.out.print(temp[i][j]);
			   System.out.print("\t");		   		
		   }
		   System.out.println(" ");
	   }	
	}
}