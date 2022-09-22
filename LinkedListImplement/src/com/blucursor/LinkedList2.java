package com.blucursor;

public class LinkedList2 {

	public Node push(Node node, int newdata) {
		Node newnode = new Node(newdata);

		newnode.next = node;
		return newnode;
	}
}
