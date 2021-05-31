package fundamentals;

public class Inference {
	public static void main(String[] args) {
		
		double a = 4.5; // Declaration and initialization // Values with decimal places can receive an integer
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
		//	a = "...";
				
		var b = 4.5;
		System.out.println(b);
		
		var c = "texto";
		System.out.println(c);
		
		c = "outro texto";
		System.out.println(c);
		
		// c = 4.5;
		
		double d; // Variable was declared
		d = 123.65; // Variable was initialized
		System.out.println(d); // Variable was used!
		
		// var e;
		// e = 123.45;    Does not work with var
		
		var e = 123.45;
		System.out.println(e);
		
		var f = 12; // Integer
		// f = 12.01;  Integer values cannot receive a value wit decimal places
		System.out.println(f);
		
		
		
	}

}
