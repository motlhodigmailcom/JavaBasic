
public class RandomSystem {
	
	public static void main(String args[]){
		
		int num1 = (int) (Math.random()*100);
		int num2 = (int) (Math.random()*100);
		
		int counter = 1;
		while(num1 != num2){
			
			counter++;
			num1 = (int) (Math.random()*100);
			num2 = (int) (Math.random()*100);
			
			System.out.println(counter +". Num1 = " + num1 + " Num2 = " + num2);
		}
		System.out.println("The system generated random numbers " + counter+" times");
	}
}