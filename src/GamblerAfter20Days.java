
public class GamblerAfter20Days {
	public static void main(String[] args) {
		
		/*
         * initialize variables
         */
        int stake = 100;
        int bet = 1;
        int trial = stake;
        int temp = 0;
        int days = 20;

        /*
         * using loop to print multiple output
         */
        for (int i=1 ; i<=days ; i++) {
            System.out.println("Day " + i + "\n");
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
            if(stake>trial)
            System.out.println("Total amount won: $" + (stake - trial) +" for the day "+i);
            else
                System.out.println("Total amount loss: $" + (trial - stake) +" for the day "+i);
            System.out.println("--------------------------------------");
        }

	}
}
