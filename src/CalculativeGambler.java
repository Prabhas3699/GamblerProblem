
public class CalculativeGambler {
	public static void main(String[] args) {
		
		/*
         * initialize variables
         */
        int stake = 100;
        int bet = 1;
        int trial = stake;
        int temp=0;
        
        /*
         * using loop to print multiple output
         */
        while ((stake > (trial/2)) && stake < (trial+(trial/2))) {
            temp++;
            System.out.println("Game played - " + temp);
            
            /*
             * using random to generate no.
             */
            double win = (double) (Math.random());

            stake -= 1;
            if (win > 0.5) {
                stake += (bet * 2);
                System.out.println("Gambler win... Won $1");
            } else {
                System.out.println("Gambler loose... lose $1");
            }
            System.out.println("current stake: $"+stake);
            System.out.println("--------------------------------");
        }
        System.out.println("The Gambler resign for the day");
        System.out.println("--------------------------------");
	}
}
