package fundamentals.operators;

public class Relationals {
    public static void main(String[] args) {

        int a = 97;
        int b = 'a';

        System.out.println(a == b);
        System.out.println(30 != 7);
        System.out.println(3 > 4);
        System.out.println(3 >= 3);
        System.out.println(3 < 7);
        System.out.println(30 <= 7);

        double note = 9.8;
        boolean goodBehavior = false;
        boolean gotTheMedia = note >= 7;
        boolean haveDiscount = goodBehavior && gotTheMedia;

        System.out.println("\nDo you have a discount? " + haveDiscount);


    }
}
