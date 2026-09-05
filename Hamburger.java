// Hamburger subclass of Food
public class Hamburger extends Food {
    
    // protected instance variable
    protected int calories;
    
    // constructor to initialize both instance variables
    public Hamburger(String description, int calories) {
        super(description);  // call parent constructor
        this.calories = calories;
    }
    
    // override isHealthy() method to always return false
    @Override
    public boolean isHealthy() {
        return false;
    }
}

/*
Create and attach the Food class by
1.	Declaring the private String typed instance variable description
2.	Writing the constructor to initialise description with an input parameter
3.	Writing the get method for description
4.	Writing the boolean isHealthy() method, which always returns true;
Create the Hamburger subclass of Food by
1.	Using the extends keyword in the class declaration of Hamburger
2.	Declaring the protected integer-typed instance variable calories
3.	Writing the Hamburger(String,int) constructor to initialise both instance variables with the input parameters
4.	Overriding the isHealthy() method to always return false
 
For example:
Test	Result
Hamburger h = new Hamburger("ham",100);
System.out.println(h.getDescription());
	ham
Hamburger h = new Hamburger("ham",100);
System.out.println(h.calories);
	100
Hamburger h = new Hamburger("ham",100);
System.out.println(h.isHealthy());
	false
Hamburger b = new Hamburger("test",100);
try {
    System.out.println(b.getClass().getDeclaredField("calories"));
} catch (Exception e) 
{
    System.out.println("access modifier error for name instance variable");
}

	protected int Hamburger.calories

Food b = new Food("test");
try {
    System.out.println(b.getClass().getDeclaredField("description"));
} catch (Exception e)
{
    System.out.println("access modifier error for name instance variable");
}	private java.lang.String Food.description


Starter code 
public class Hamburger //suclass of Food
{

	//intance variable here
	
	//constructor here

   //override is boolean isHealthy()


}
// Hamburger subclass of Food
public class Hamburger extends Food {
    
    // protected instance variable
    protected int calories;
    
    // constructor to initialize both instance variables
    public Hamburger(String description, int calories) {
        super(description);  // call parent constructor
        this.calories = calories;
    }
    
    // override isHealthy() method to always return false
    @Override
    public boolean isHealthy() {
        return false;
    }
}
// Food class
class Food {
    // private instance variable
    private String description;
    
    // constructor to initialize description
    public Food(String description) {
        this.description = description;
    }
    
    // getter method for description
    public String getDescription() {
        return description;
    }
    
    // isHealthy method that always returns true
    public boolean isHealthy() {
        return true;
    }
}
*/