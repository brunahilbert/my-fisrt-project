package fundamentals;

public class ArithmeticChallenge {
	public static void main(String[] args) {
		
		double a = 6 * (3 + 2);
		double aPower = Math.pow(a, 2);
		
		double b = 3 * 2;
		
		double c = ((1 - 5) * (2 - 7)) / 2;
		
		double cPower = Math.pow(c, 2);
		
		double d = (aPower / b) - cPower;
		
		double dPower = Math.pow(d, 3);
		
		double e = Math.pow(10, 3);
		
		double f = dPower / e;
		
		System.out.println(f);
		
	}

}
