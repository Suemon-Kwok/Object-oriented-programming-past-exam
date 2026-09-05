public class LinkedList {

    LinkedList next;
    Integer data;

    // complete this method          
    public LinkedList find(int data) {
        // Check if current node's data matches the search value
        if (this.data != null && this.data.equals(data)) {
            return this;
        }
        
        // If not found in current node and there's a next node, search recursively
        if (this.next != null) {
            return this.next.find(data);
        }
        
        // If not found and no more nodes, return null
        return null;
    }

    public String toString() {
        return "" + this.data;
    }

    public LinkedList(Integer data) {
        this.data = data;
        this.next = null;
    }

    public void add(Integer data) {
        if (this.next != null) {
            this.next.add(data);
        } else {
            LinkedList ll = new LinkedList(data);
            this.next = ll;
        }
    }
}
/*
Complete the LinkedList class by writing the 

public LinkedList find(int data)

method, which returns the LinkedList object storing the value given by input parameter data. 
If the data value is not found, then null is returned
For example:
Test	Result
LinkedList list = new LinkedList(10);
list.add(7);
System.out.println(list.find(10));	10

LinkedList list = new LinkedList(10);
list.add(7);
list.add(-4);
list.add(-11);
list.add(0);
System.out.println(list.find(0));	0

LinkedList list = new LinkedList(10);
list.add(7);
list.add(-4);
list.add(-11);
list.add(0);
System.out.println(list.find(330));	null


Starter code
public class LinkedList {

	LinkedList next;
	Integer data;


   //complete this method	
	public LinkedList find(int data)
	{
	    return null;
	}


public String toString()
   {
       return ""+this.data;
   }

	public LinkedList(Integer data) 
	{
		this.data = data;
		this.next = null;
	}



	public void add(Integer data)
	{
		if(this.next!=null)
		{
			this.next.add(data);
		}
		else
		{
			LinkedList ll = new LinkedList(data);
			this.next = ll;
		}
	}
}
public class LinkedList {

   LinkedList next;
   Integer data;

   // complete this method          
   public LinkedList find(int data) {
       // Check if current node's data matches the search value
       if (this.data != null && this.data.equals(data)) {
           return this;
       }
       
       // If not found in current node and there's a next node, search recursively
       if (this.next != null) {
           return this.next.find(data);
       }
       
       // If not found and no more nodes, return null
       return null;
   }

   public String toString() {
       return "" + this.data;
   }

   public LinkedList(Integer data) {
       this.data = data;
       this.next = null;
   }

   public void add(Integer data) {
       if (this.next != null) {
           this.next.add(data);
       } else {
           LinkedList ll = new LinkedList(data);
           this.next = ll;
       }
   }
}
*/