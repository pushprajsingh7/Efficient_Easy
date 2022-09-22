package Approach2;

/**
 * program to insert element at given position in node in linked list
 * 
 * @author ss
 *
 */
public class MainList {
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		Node node = list.push(null, 7);
		node = list.push(node, 1);
		node = list.push(node, 3);
		node = list.push(node, 17);
		list.insertAtPos(2, 15);
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
}
