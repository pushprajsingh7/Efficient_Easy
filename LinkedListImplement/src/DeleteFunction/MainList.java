package DeleteFunction;
/**
 * Program to delete a data from linked list
 * @author ss
 *
 */
public class MainList {
	public static void main(String args[]) {
		LinkedList list = new LinkedList();

		list.push(7);
		list.push(1);
		list.push(3);
		list.push(17);
		System.out.println(" Linked list is: ");
		list.printList();
		System.out.println("\n");
		list.delete(1);
		list.delete(17);
		list.printList();

	}
}
