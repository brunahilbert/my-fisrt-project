package fundamentals;

import javax.swing.JOptionPane;

public class ConversionStringNumber {
	public static void main(String[] args) {
		
		String value1 = JOptionPane.showInputDialog("Enter the first number:");
		String value2 = JOptionPane.showInputDialog("Enter the second number:");
		
		System.out.println(value1 + value2);
		
		double number1 = Double.parseDouble(value1);
		double number2 = Double.parseDouble(value2);
		
		double sum = number1 + number2;
		double media = sum / 2;
		
		String formatedSum = String.format("%.1f", sum);
		String formatedMedia = String.format("%.1f", media);
		
		System.out.println("The sum is " + formatedSum);
		System.out.println("The media is " + formatedMedia);
		
		
		
		// BigDecimal
		
		
				
	}

}
