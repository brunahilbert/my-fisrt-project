package fundamentals;

import java.util.Scanner;

public class ConversionChallenge {
	public static void main(String[] args) {
		
		System.out.println("Enter your last three salaries\n");
		
		Scanner entry = new Scanner(System.in);
		
		System.out.print("Last salary: ");
		String lastSalary = entry.nextLine().replace(",", ".");
		System.out.print("Penultimate salary: ");
		String penultimateSalary = entry.nextLine().replace(",", ".");
		System.out.print("Antepenultimate salary: ");
		String antepenultimateSalary = entry.nextLine().replace(",", ".");
		
		double last = Double.parseDouble(lastSalary);
		double penultimate = Double.parseDouble(penultimateSalary);
		double antepenulmate = Double.parseDouble(antepenultimateSalary);
		
		double media = (last + penultimate + antepenulmate) / 3;
		
		String formatedMedia = String.format("%.2f", media);
		
		System.out.println("Your average salary is " + formatedMedia + "€");
		
		entry.close();
	}

}
