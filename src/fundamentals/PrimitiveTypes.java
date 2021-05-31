package fundamentals;

public class PrimitiveTypes {
	
	public static void main(String[] args) {
	// Employee information
	
	// Numeric types
	byte yearsOfCompany = 23;
	short flightNumbers = 542;
	int id = 56789;
	long accumulatedPoints = 3_134_845_223L;
	
	// Real numeric types
	float salary = 11_445.44F;
	double accumulatedSales = 2_991_797_103.01;
	
	// Boolean type
	boolean isOnVacation = true; //false
			
	// Character type
	char status = 'A'; // Active
	
	// Days of company
	System.out.println(yearsOfCompany * 365);
	
	// Number of trips
	System.out.println(flightNumbers / 2);
	
	// Points for money
	System.out.println(accumulatedPoints / accumulatedSales);
	
	System.out.println("ID " + id + " earn " + salary + "€ a month");
	System.out.println("Vacation? " + isOnVacation);
	System.out.println("Status: " + status);
		
	}

}
