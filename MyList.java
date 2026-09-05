import java.util.ArrayList;

public class MyList {

    public ArrayList<Integer> lengthCounter(ArrayList<String> words) {
        // Create a new ArrayList to store the lengths
        ArrayList<Integer> lengths = new ArrayList<Integer>();
        
        // Iterate through each string in the input ArrayList
        for (String word : words) {
            // Add the length of each string to the lengths ArrayList
            lengths.add(word.length());
        }
        
        // Return the ArrayList containing all the lengths
        return lengths;
    }
}

/*
Complete the MyList class by writing the method
public ArrayList<Integer> lengthCounter(ArrayList<String> words)
that returns an ArrayList of Integer values representing the lengths of each String
in the input ArrayList of String
For example:
Test	Result
MyList q = new MyList();
ArrayList<String> words = new ArrayList<String>();
words.add("World");
words.add("Zappa");
words.add("Hellooooo");
words.add("Abba");
System.out.println(q.lengthCounter(words));	[5, 5, 9, 4]

MyList q = new MyList();
ArrayList<String> words = new ArrayList<String>();
System.out.println(q.lengthCounter(words));	[]


Starter code
import java.util.ArrayList;

public class MyList {

	public ArrayList<Integer> lengthCounter(ArrayList<String> words)
	{
	return null;			
	}
}
import java.util.ArrayList;

public class MyList {

    public ArrayList<Integer> lengthCounter(ArrayList<String> words) {
        // Create a new ArrayList to store the lengths
        ArrayList<Integer> lengths = new ArrayList<Integer>();
        
        // Iterate through each string in the input ArrayList
        for (String word : words) {
            // Add the length of each string to the lengths ArrayList
            lengths.add(word.length());
        }
        
        // Return the ArrayList containing all the lengths
        return lengths;
    }
}
*/