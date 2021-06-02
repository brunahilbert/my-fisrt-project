package fundamentals.operators;

public class Logicals {

    public static void main(String[] args) {
        boolean condition1 = true;
        boolean condition2 = 3 > 7;

        System.out.println(condition1 && condition2); // and
        System.out.println(condition1 || condition2); // or
        System.out.println(condition1 ^ condition2); // xor
        System.out.println(!condition1);
        System.out.println(!!condition1);
        System.out.println(!condition2);


        System.out.println("\n\nTruth table AND:");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("\n\nTruth table OR:");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("\n\nTruth table XOR:");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("\n\nTruth table NOT:");
        System.out.println(!true);
        System.out.println(!false);




    }
}
