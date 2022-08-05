import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SingleElement {

	public static void main(String args[]) {
		int[] arr = { 1, 2, 2, 3, 3, 7 };
		System.out.println("Original array is" + Arrays.toString(arr));
		Set<Integer> set = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		for (int i : arr) {
			set2.add(i);
			boolean s = set.add(i);
			if (s == false) {
				set.remove(i);
				list.add(i);

			}

		}
		System.out.println("Duplicate elements are : " + list);
		System.out.println("Single  elements are : " + set);
		System.out.println("elements should be : " + set2);
	}

}
