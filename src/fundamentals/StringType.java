package fundamentals;

public class StringType {
	public static void main(String[] args) {
		
		System.out.println("Hello everybody!".charAt(4));
		
		String s = "Good afternoon";
		System.out.println(s.concat("!"));
		System.out.println(s + "!");
		System.out.println(s.startsWith("Good"));
		System.out.println(s.startsWith("good"));
		System.out.println(s.toLowerCase().startsWith("good"));
		System.out.println(s.endsWith("afternoon!"));
		System.out.println(s.concat("!").endsWith("afternoon!"));
		System.out.println(s.toUpperCase().endsWith("AFTERNOON"));
		System.out.println(s.length());
		System.out.println(s.equals("good afternoon"));
		System.out.println(s.equalsIgnoreCase("good afternoon"));
		
		var name = "Bruna";
		var lastName = "Hilbert";
		var age = 27;
		double salary = 12345.67;
		
		
		String anotherSentence = ("\n\nName: " + name + "\nLast name: " + lastName + "\nAge: " + age + "\nSalary: " + salary + "\n\n");
		System.out.println(anotherSentence);
		
		System.out.println("Name: " + name + "\nLast name: " + lastName + "\nAge: " + age + "\nSalary: " + salary + "\n\n");
		
		System.out.printf("Miss %s %s is %d years old and earn %.2f€.", name, lastName, age, salary);
		
		String sentence = String.format("\n\nMiss %s %s is %d years old and earn %.2f€.", name, lastName, age, salary);
		System.out.println(sentence);
		
		System.out.println("Any sentence".contains("sent"));
		System.out.println("Any sentence".indexOf("sent"));
		System.out.println("Any sentence".substring(4));
		System.out.println("Any sentence".substring(4, 9));
		
		
		
		
	}

}
