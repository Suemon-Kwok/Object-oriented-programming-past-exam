/*
Complete the BoardingApp class by implementing the Membership enum by
1. defining constants GOLD, SILVER, BRONZE and NONE
2. defining a private instance variable fee of type int in the enum Membership 
3. writing a private constructor Membership(int) in the enum Membership to set the value of the fee instance variable
4. writing get and set methods for the private instance variable fee
5. completing the main method to print the fee of each Membership constant in order, using Membership.values() and getFee() methods
For example:
Test	Result
BoardingApp.main(new String[]{});	500
300
150
0

Starter code
public class BoardingApp {

	enum Membership 
	{
	    //declare constants
	    //private constructor
	    //get and set methods
	};


	public static void main(String[] args) 
	{
	    //complete the for loop with the Membership.values()
	    //and getFee() methods
		for(Membership m : )
		{
			System.out.println( );			
		}

	}

}
*/
public class BoardingApp {
 
    enum Membership {
        // declare constants with fee values
        GOLD(500),
        SILVER(300),
        BRONZE(150),
        NONE(0);
        
        // private instance variable
        private int fee;
        
        // private constructor
        private Membership(int fee) {
            this.fee = fee;
        }
        
        // getter method
        public int getFee() {
            return fee;
        }
        
        // setter method
        public void setFee(int fee) {
            this.fee = fee;
        }
    }

    public static void main(String[] args) {
        // complete the for loop with the Membership.values()
        // and getFee() methods
        for(Membership m : Membership.values()) {
            System.out.println(m.getFee());                                    
        }
    }
}
