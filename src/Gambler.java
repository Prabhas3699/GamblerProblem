
public class Gambler {
	public static void main(String[] args) {
		/*
		 * initialize variables
		 */
		int stake = 100;
		int bet = 1;
		
		/*
		 * using random to generate no. 
		 */
		double win = (double)(Math.random());
		stake -= 1;
		
		if(win>0.5) {
			stake += (bet*2);
		}
		System.out.println("current stake: $"+stake);
		
	}
}
