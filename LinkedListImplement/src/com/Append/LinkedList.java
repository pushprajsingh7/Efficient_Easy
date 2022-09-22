package com.Append;

public class LinkedList {
	Node head;

	public void push(int newdata) {

		Node newnode = new Node(newdata);

		newnode.next = head;

		head = newnode;
	}

	public void append(int newdata) {
		Node newnode = new Node(newdata);
		newnode.next = null;
		Node last = head;
		while (last.next != null)
			last = last.next;
		last.next = newnode;
		return;
	}

	public void printList() {
		Node headnode = head;
		while (headnode != null) {
			System.out.print(headnode.data + "\n");
			headnode = headnode.next;
		}
	}
}
