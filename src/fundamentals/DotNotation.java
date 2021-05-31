package fundamentals;

public class DotNotation {
	
	public static void main(String[] args) {
		
		String s = "Good morning X!";
		s = s.replace("X", "Mister");
		s = s.toUpperCase();
		s = s.concat("!!!");
		System.out.println(s);
		
		System.out.println("Bruna".toUpperCase());
		
		String x = "Bruna".toUpperCase();
		System.out.println(x);
		
		String y = "Good morning X"
				.replace("X", "Bruna")
				.toUpperCase()
				.concat("!");
		System.out.println(y);
		
		// Primitive types don´t have the "." operator
		int a = 3;
		// a.
		System.out.println(a);
		
	}

}
