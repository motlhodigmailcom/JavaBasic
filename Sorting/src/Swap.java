
public class Swap {

	public static void main(String[] args) {

		//declare your variables
		int a,b,c,d,e,temp;
		int flag = 0;

		//initialize your variables
		a= (int) ((Math.random()*46)+1);
		b= (int) ((Math.random()*46)+1);
		c= (int) ((Math.random()*46)+1);
		d= (int) ((Math.random()*46)+1);
		e= (int) ((Math.random()*46)+1);
		temp = 0;

		while(a == b || a == c || a == d || a == e || b == c || b == d || b == e || c == d ||  c == e || d == e ){

			a= (int) ((Math.random()*49)+1);
			b= (int) ((Math.random()*49)+1);
			c= (int) ((Math.random()*49)+1);
			d= (int) ((Math.random()*49)+1);
			e= (int) ((Math.random()*49)+1);
		}
		//Display message
		System.out.println("Lotto numbers before sorting :" + a + " " + b + " " + c + " " + d + " " + e );

		while(a>b||b>c||c>d||d>e){

			if(a>b){
				temp = a;
				a = b;
				b = temp;
			}
			
			if(b>c){
				temp = b;
				c = b;
				b = temp;
			}
			
			if(c>d){
				temp = c;
				c = d;
				d = temp;
			}
			
			if(d>e){
				temp = d;
				e = d;
				d = temp;
			}

		}


		System.out.println("Lotto numbers after sorting :" + a + " " + b + " " + c + " " + d + " " + e );

		/*while ((b>c) ||(a>b)){
			if(a>b){
				temp = a;
				a = b;
				b = temp;
			}

			if(b>c){
				temp = b;
				b = c;
				c = temp;
			}
		}

		System.out.println("After sorting :" + a + "" + b + "" + c );*/

		/*	if(a>b){
			temp = a;
			a = b;
			b = temp;
		}

		System.out.println("After sorting :" + a + "" + b + "" + c );



		 */




	}

}
