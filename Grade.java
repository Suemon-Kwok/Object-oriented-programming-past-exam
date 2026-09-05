public class Grade implements Comparable<Grade> {

    public Character letter;

    // compareTo method that compares Grade objects by their letter
    @Override
    public int compareTo(Grade o) {
        // Use the Character class's compareTo method to compare the letters
        return this.letter.compareTo(o.letter);
    }
}

/*
Implement the Comparable interface on the Grade class by providing a body for the method
int compareTo(Grade o) 
 
which returns:
a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object, by comparing Grade objects according to the instance variable letter of type Character 
Hint: use the compareTo method implemented by the Character class
For example:
Test	Result
Grade g1 = new Grade();
g1.letter ='A';
Grade g2 = new Grade();
g2.letter ='B';
System.out.println(g1.compareTo(g2));	-1

Grade g1 = new Grade();
g1.letter ='D';
Grade g2 = new Grade();
g2.letter ='C';
System.out.println(g1.compareTo(g2));	1

Grade g1 = new Grade();
g1.letter ='D';
Grade g2 = new Grade();
g2.letter ='F';
System.out.println(g1.compareTo(g2));	-2

Grade g1 = new Grade();
g1.letter ='D';
Grade g2 = new Grade();
g2.letter ='A';
System.out.println(g1.compareTo(g2));	3


Starter code
public class Grade //implements Comparable here
{

	public Character letter;

	//compareTo method here
	@Override
	public int compareTo(Grade o)
	{
	    return 0;
	}
}
public class Grade implements Comparable<Grade> {

    public Character letter;

    // compareTo method that compares Grade objects by their letter
    @Override
    public int compareTo(Grade o) {
        // Use the Character class's compareTo method to compare the letters
        return this.letter.compareTo(o.letter);
    }
}
*/