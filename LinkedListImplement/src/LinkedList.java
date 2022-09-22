
public class LinkedList {
	Node head;

	public void push(int newentry) {

		Node newnode = new Node(newentry);

		newnode.next = head;

		head = newnode;
	}
	public void printList(){
		Node headnode = head;
		while (headnode != null) {
			System.out.print(headnode.data + "\n");
			headnode = headnode.next;
		}
	}
}
