
public class Run {

	public static void main(String[] args) {
		Person a = new Person();
		Person p = new Person();
		Person x = new Person("Tshepo", "Motlhodi", 45);
		
		p.setName   ("Monde");
		p.setSurname("Bozza");
		p.setAge    (55);
		
		System.out.println("OBJECT A");
		System.out.println("----------------------------------------");
		System.out.println("My name is     : " + a.getName());
		System.out.println("My surnname is : " + a.getSurname());
		System.out.println("I am  " + a.getAge() + " years old.");
		
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("OBJECT P");
		System.out.println("----------------------------------------");
		System.out.println("My name is     : " + p.getName());
		System.out.println("My surnname is : " + p.getSurname());
		System.out.println("I am  " + p.getAge() + " years old.");
		
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("OBJECT X");
		System.out.println("----------------------------------------");
		System.out.println("My name is     : " + x.getName());
		System.out.println("My surnname is : " + x.getSurname());
		System.out.println("I am  " + x.getAge() + " years old.");

	}

}
