/*
Complete the LevelApp class by
1. declaring the Levels enum, with constants LOW, MED and HIGH
2. complete the public String directions(Levels) method which uses a switch statement to return strings such that, an input of LOW returns "Down", MED returns "Stay" and HIGH returns "Up". Any other input will return the string "?".
For example:
Test	Result
LevelApp.main(new String[]{});	Down
Stay
Up

Starter code

public class LevelApp {
	
	
     //Levels enum is declared here.

	
	 public String directions(Levels level) 
	 {
		
		 //use a switch statement to return the correct string
		 //when level is 
		 //LOW, return "Down"
		 //MED, return "Stay"
		//HIGH, return "Up"
		 //any other input return "?"		
	}
	
	
	public static void main(String[] args) 
	{
	 LevelApp la = new LevelApp();
	 
	 System.out.println(la.directions(Levels.LOW));
	 System.out.println(la.directions(Levels.MED));
	 System.out.println(la.directions(Levels.HIGH)); 
	 	
	}

}
*/
public class LevelApp {
               
    // Levels enum is declared here
    enum Levels {
        LOW, MED, HIGH
    }
               
    public String directions(Levels level) {
        // use a switch statement to return the correct string
        switch (level) {
            case LOW:
                return "Down";
            case MED:
                return "Stay";
            case HIGH:
                return "Up";
            default:
                return "?";
        }
    }
               
    public static void main(String[] args) {
        LevelApp la = new LevelApp();
        
        System.out.println(la.directions(Levels.LOW));   // Output: Down
        System.out.println(la.directions(Levels.MED));   // Output: Stay
        System.out.println(la.directions(Levels.HIGH));  // Output: Up
    }
}
