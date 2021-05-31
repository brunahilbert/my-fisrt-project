package fundamentals;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		double fahrenheit = 1056;
		final double DIFERENCE = 32;
		final double MULTIPLIER = 5.0 / 9.0;

		String formatedCelcius;

		double celcius = (fahrenheit - DIFERENCE) * MULTIPLIER;
		formatedCelcius = String.format("%.2f", celcius);
		System.out.println(fahrenheit + "°F is the same as " + formatedCelcius + "°C");

		fahrenheit = 80;
		celcius = (fahrenheit - DIFERENCE) * MULTIPLIER;
		formatedCelcius = String.format("%.2f", celcius);
		System.out.println(fahrenheit + "°F is the same as " + formatedCelcius + "°C\n\n");
		
		String tittle = "Converter °F to °C";
		System.out.println(tittle.toUpperCase());
		
		Scanner entry = new Scanner(System.in);
		System.out.print("\nEnter the temperature in Fahrenheit: ");
		int fahrenheitEntry = entry.nextInt();
		
		double newCelcius = (fahrenheitEntry - DIFERENCE) * MULTIPLIER;
		String newFormatedCelcius = String.format("%.2f", newCelcius);
		
		System.out.println("\n" + fahrenheitEntry + "°F is the same as " + newFormatedCelcius + "°C.");
		
		entry.close();

	}

}
