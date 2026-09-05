// Person class
public class Person {
    
    String name;
    Integer age;
    
    // Constructor that throws InvalidAgeException if age is out of range
    public Person(String name, int age) throws InvalidAgeException {
        // Check if age is within valid range (0 to 150)
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Out of Range");
        }
        
        // If age is valid, initialize instance variables
        this.name = name;
        this.age = age;
    }
}
/*
Create and attach the InvalidAgeException class which
1.	Extends the Exception class
2.	Overrides the InvalidAgeException(String message) constructor
Complete the Person class by 
1.	Completing the constructor to throw an InvalidAgeException exception. The exception is constructed with the message "Out of Range" e.g. the age is not within the range of 0 and 150 years
For example:
Test	Result
try
{
    new Person("Bob",-1);
}
catch(InvalidAgeException e)
{
    System.out.println(e.getMessage());
}	Out of Range

try
{
    new Person("Bob",151);
}
catch(InvalidAgeException e)
{
    System.out.println(e.getMessage());
}	Out of Range

try
{
    Person bob = new Person("bob",50);
    System.out.println("name = "+bob.name+"\n"+"age = "+bob.age);
}
catch(InvalidAgeException e)
{
    System.out.println(e.getMessage());
}	

Starter code 

public class Person 
{
	
	String name;
	Integer age;
	
	//complete the constructor here
	
}
// Person class
public class Person {
    
    String name;
    Integer age;
    
    // Constructor that throws InvalidAgeException if age is out of range
    public Person(String name, int age) throws InvalidAgeException {
        // Check if age is within valid range (0 to 150)
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Out of Range");
        }
        
        // If age is valid, initialize instance variables
        this.name = name;
        this.age = age;
    }
}
// InvalidAgeException class that extends Exception
class InvalidAgeException extends Exception {
    // Override constructor with String message parameter
    public InvalidAgeException(String message) {
        super(message);
    }
}
*/