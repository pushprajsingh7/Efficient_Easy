/**
 * Data Structure – Linked List Create a linked list from scratch in Java:
 * 
 * 1. Create a class Node to store data and pointer to next node. 2. Create a
 * class LinkedList to maintain head pointer that points to start of linked list
 * 3. Define a function push, that create a new node at start of linked list
 * Public void push(int newdata) { //Write code here }
 * 
 * @author ss
 *
 */
public class MainList {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.push(7);

		list.push(1);

		list.push(3);
		System.out.println(" Linked list is: ");
		list.printList();

	}

}
