package ArrayMaximumMinimum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Remove {
	public void getMinMax(Integer[] array) {
		List<Integer> newlist = new LinkedList<>(Arrays.asList(array));

		while (newlist.size() > 1) {
			int n = newlist.size();
			int max = newlist.get(0);
			int min = newlist.get(0);

			for (int i = 1; i <= n - 1; i++) {
				if (newlist.get(i) > max) {
					max = newlist.get(i);
				} else if (newlist.get(i) < min) {
					min = newlist.get(i);
				}
				int ans[] = { max, min };

			}

			newlist.remove(Integer.valueOf(max));
			newlist.remove(Integer.valueOf(min));

			Integer[] arr = new Integer[newlist.size()];
			newlist.toArray(arr);
			System.out.println(Arrays.toString(arr));
		}

	}

	public static void main(String args[]) {
		Integer a[] = { 9, 8, 3, 4, 2, 7, 5 };
		Remove rm = new Remove();
		rm.getMinMax(a);
	}
}
