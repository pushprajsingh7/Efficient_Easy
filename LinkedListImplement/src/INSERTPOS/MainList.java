package INSERTPOS;

public class MainList {
	static LinkedList list = new LinkedList();
	public static void main(String[] args) {
		int a=13;
		int b=7;
		int c=17;
		int d=3;
		list.push(a);
		list.push(b);

		list.push(c);

		list.push(d);
		list.printList();
		System.out.println("\n"+list.get(17));
	}

	}
