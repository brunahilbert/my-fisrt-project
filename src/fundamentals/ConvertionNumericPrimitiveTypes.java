package fundamentals;

public class ConvertionNumericPrimitiveTypes {
	public static void main(String[] args) {
		
		double a = 1; // Implicit
		System.out.println(a);
		
		float b = (float) 1.23456788888; // Explicit (CAST)
		System.out.println(b);
		
		int c = 130;
		byte d = (byte) c; // Explicit (CAST)
		System.out.println(d);
		
		double e = 1.99; // Explicit (CAST)
		int f = (int) e;
		System.out.println(f);
	}

}
