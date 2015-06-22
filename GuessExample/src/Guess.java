import java.util.Scanner;


public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num  = 0;
		int guess = 0;
		int count = 1;
		String output = "";
		//Scanner sc = new Scanner(System.in);
		
		
		while(output != "CCC"){
			
			num = (int) ((Math.random()*9) + 1);
			
			
			//System.out.println("Enter guess " + count + ":");
			guess = (int) ((Math.random()*9) + 1);
			
			
			if(num == guess){
				output+="C";
				//System.out.println("guess " + num);
			}
			else if(guess > num){
				output+="H";
				//System.out.println("guess " + num);
			}
			else{
				output+="L";
				//System.out.println("guess " + num);
			}	
			
			if(count > 2){				
				System.out.println(output);
				output = "";
				count = 1;
			}else{
				count++;
			}			
		}
		
		System.out.println(count + " " + output);
	}
}
