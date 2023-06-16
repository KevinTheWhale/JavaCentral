package Part2;

import java.util.Random;

public class CTS {

	class Coin {

	   private String sideUp;


	   
	   public Coin()
	   {
	       toss();
	   }

	   
	   public void toss() {

	       Random rand = new Random();

	       // Get a random value, 0 or 1.
	       int value = rand.nextInt(2);

	       if (value == 0)
	       {
	           this.sideUp = "Head";
	       }
	       
	       else 
	       {
	           this.sideUp = "Tail";
	       }
	       
	   }
	   
	   
	   public String getSideUp() 
	   {
	       return sideUp;
	   }
	}
	
	static final int NUMBER_OF_TOSSES = 20;

	
	
	
	
	
	public static void main(String args[]) {

		CTS coinTossSimulator = new CTS();
	   Coin myCoin = coinTossSimulator.new Coin();

	   System.out.println("Now the Coin is facing up: "
	           + myCoin.getSideUp());

	   System.out.println("Now I will toss the coin " + NUMBER_OF_TOSSES
	           + " times.\n");

	   int headCount = 0;
	   for (int i = 0; i < NUMBER_OF_TOSSES; i++) {

	       myCoin.toss();

	       System.out.println("Results:   " + myCoin.getSideUp());

	       if ("Head".equals(myCoin.getSideUp())) {
	           headCount++;
	       }
	   }

	   System.out.println("\nHeads facing up: " + headCount);
	   System.out
	           .println("Tail is facing up: " + (NUMBER_OF_TOSSES - headCount));
	}
}