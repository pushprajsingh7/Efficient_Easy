package Approach2;
public class LinkedList {
Node head;
int count=1;
Node prevnode;
Node temp;
	public Node push(Node node, int newdata) {
		Node newnode = new Node(newdata);
		newnode.next = node;
		head=newnode;
		return newnode;
	}
	Node getNode(int position) {
		Node node=head;
		while(node!=null && count!=position) {
			node=node.next;
		count++;
		
	
		
	}
		return node;
		}
	   Node getvalue(int position) {
		   Node last= getNode(position);
	    	while(head!=null && count!=position) {
	    		last=last.next;
	    		last.next=head;
	    		return last;
	    	}
			return last;
	    }
	int get(int element) {
		System.out.println("Returning the position at which given element is");
    	Node temp = head;
    	while(temp!=null && temp.data!=element) {
    		temp= temp.next;
    		count++;
    	}
		return count;
    	
    }
	public void insertAtPos(int pos, int newdata)
    {    
		Node newnode = new Node(newdata);
        prevnode= this.getNode(pos);
        newnode.next=prevnode.next;
        prevnode.next=newnode;
       // return newnode.data;
    }
}

