package INSERTPOS;

public class LinkedList {
	Node head;
	Node newnode;
	int count=1;
	public int push( int newdata) {
		
		Node newnode = new Node(newdata);

		newnode.next = head;

		head = newnode;
		return newdata;
	}
	
	public void insertAtPos(int pos, int newdata)
    {
        Node newnode = new Node(newdata);
        newnode.next =newnode;
    }

    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
       
    }
    Node get(int element) {
    	Node temp = head;
    	while(temp!=null && count!=element) {
    		temp= temp.next;
    		
    	}
		return temp;
    	
    }
	}

