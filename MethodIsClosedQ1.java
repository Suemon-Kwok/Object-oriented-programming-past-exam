/*
Write a Java method
 public static boolean isClosed(String input)
that takes a String as an input parameter and returns a boolean value. 
Using the .contains(String) method, compare the input with the String “CLOSED”. If the input contains the String “CLOSED” then return true. Otherwise, return false. 

Your method must also return true when “CLOSED” is given in a sentence, and not the same upper/lower case. e.g. the isClosed method is not case-sensitive. The .toUpperCase() method changes the case of a String
For example:
Test	Result
System.out.println(isClosed(new String("CLOSED")));	true
System.out.println(isClosed(new String("This store is clOSED.")));	true

System.out.println(isClosed(new String("open")));	false

System.out.println(isClosed(new String("closed")));	true

Starter code
public static boolean isClosed(String input)
	{

        //complete this method with an if statement
        //using toUpperCase and contains
		return false;

	}
	*/
public static boolean isClosed(String input) {
    // Check if the input contains "CLOSED" (case-insensitive)
    if (input.toUpperCase().contains("CLOSED")) {
        return true;
    } else {
        return false;
    }
}
