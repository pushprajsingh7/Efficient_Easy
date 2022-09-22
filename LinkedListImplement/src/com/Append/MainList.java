package com.Append;

/**
 * program to append element at end of the Linkedlist
 * 
 * @author ss
 *
 */
public class MainList {
	public static void main(String args[]) {
		LinkedList list = new LinkedList();

		list.push(7);
		list.push(1);
		list.push(3);
		list.append(4);
		System.out.println(" Linked list is: ");
		list.printList();

	}
}
