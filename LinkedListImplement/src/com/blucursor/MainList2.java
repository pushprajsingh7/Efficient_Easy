package com.blucursor;

/**
 * Data Structure – Linked List Create a linked list from scratch in Java 1.
 * Create a class Node to store data and pointer to next node. 2. Create a class
 * LinkedList to maintain head pointer that points to start of linked list 3.
 * Define a function push, that create a new node at start of linked list Public
 * void push(Node head, int newdata) { //Write code here }
 * 
 * @author ss
 *
 */
public class MainList2 {

	public static void main(String args[]) {
		LinkedList2 list = new LinkedList2();
		Node node = list.push(null, 7);

		node = list.push(node, 1);

		node = list.push(node, 3);

		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
}
