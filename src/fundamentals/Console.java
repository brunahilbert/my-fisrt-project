package fundamentals;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.print ("Good");
		System.out.print (" night!\n\n");
		
		System.out.println("Good");
		System.out.println("night!");
		
		System.out.printf("Lotto: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6); // %n = \n
		
		System.out.printf("Salary: %.1f%n", 1234.5678);
		System.out.printf("Name: %s%n", "Bruna\n\n");
		
		
		Scanner entry = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String firstName = entry.nextLine();
		System.out.print("Enter your last name: ");
		String lastName = entry.nextLine();
		System.out.print("Enter your age: ");
		int age = entry.nextInt();
		
		System.out.println("\n\nName: " + firstName + " " + lastName + "\nAge: " + age);
		
		System.out.printf("%n%n%s %s is %d years old.", firstName, lastName, age);
		
		entry.close();
		
	}
}
