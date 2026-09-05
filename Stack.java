public class Stack {

    private Integer[] stack;
    private int top;
    static int MAX = 10;

    // complete this method
    public boolean isEmpty() {
        return top == 0;
    }

    //-------------------------------------------------------
    public Stack() {
        this.stack = new Integer[MAX];
        this.top = 0;
    }
    
    //-------------------------------------------------------
    public void push(Integer element) {
        if (this.top < MAX) {
            this.stack[top] = element;
            this.top++;
        }
    }
    
    //-------------------------------------------------------
    public Integer pop() {
        if (this.top > 0) {
            this.top--;
            return stack[top];
        }
        return null;
    }
}
/*
Complete the Stack class by writing the method
public int isEmpty()
which returns true if the Stack does not contain any elements and false otherwise
For example:
Test	Result
Stack stack = new Stack();
stack.push(5);	
System.out.println(stack.isEmpty());	false

Stack stack = new Stack();
System.out.println(stack.isEmpty());	true


Starter Code
public class Stack {


	private Integer[] stack;
	private int top;
	static int MAX=10;
	
	
	//complete this method
	public boolean isEmpty()
	{
		return false;
	}





	//-------------------------------------------------------
	public Stack()
	{
		this.stack = new Integer[MAX];
		this.top = 0;
	}
	//-------------------------------------------------------
	public void push(Integer element)
	{
		if(this.top < MAX)
		{
			this.stack[top] = element;
			this.top++;
		}
	}
	//-------------------------------------------------------
	public Integer pop()
	{
		if(this.top>0)
		{
			this.top--;
			return stack[top];
		}
		return null;
	}
}
public class Stack {

    private Integer[] stack;
    private int top;
    static int MAX = 10;

    // complete this method
    public boolean isEmpty() {
        return top == 0;
    }

    //-------------------------------------------------------
    public Stack() {
        this.stack = new Integer[MAX];
        this.top = 0;
    }
    
    //-------------------------------------------------------
    public void push(Integer element) {
        if (this.top < MAX) {
            this.stack[top] = element;
            this.top++;
        }
    }
    
    //-------------------------------------------------------
    public Integer pop() {
        if (this.top > 0) {
            this.top--;
            return stack[top];
        }
        return null;
    }
}
*/