package DeleteFunction;


public class LinkedList {
	Node head;
 int count=1;
 Node prevnode;
 Node temp;
	public void push(int newdata) {

		Node newnode = new Node(newdata);

		newnode.next = head;

		head = newnode;
	}
	void delete(int data)
    {
         temp = head; 
         if(temp != null && temp.data == data) {
         	head=temp.next;
         }else
         {
        while (temp != null && temp.data != data) {
            prevnode = temp;
            temp = temp.next;
        }
      
        prevnode.next = temp.next;
    }}
	public void printList() {
		Node headnode = head;
		while (headnode != null) {
			System.out.print(headnode.data + "\t");
			headnode = headnode.next;
		}
	}
}
