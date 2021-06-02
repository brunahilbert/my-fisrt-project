package fundamentals.operators;

public class LogicalsChallenge {
    public static void main(String[] args) {

        // job1 AND job2 = buy a TV 50" + family eat ice cream
        // job1 OR job2 = buy a TV 32" + family eat ice cream
        // !job1 OR !job2 = stay at home

        boolean job1 = true;
        boolean job2 = false;

        boolean buyTV50  = job1 && job2;
        System.out.println("Bought a TV 50\"? " + buyTV50);

        boolean buyTV32  = buyTV50 == false && (job1 || job2); // job1 ^ job2;
        System.out.println("Bought a TV 32\"? " + buyTV32);

        boolean eatIceCream  = buyTV50 || buyTV32;
        System.out.println("Ate ice cream? " + eatIceCream);

        boolean stayAtHome = !job1 && !job2; // !eatIceCream;
        System.out.println("Stayed at home? " + stayAtHome);






    }
}
