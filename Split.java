package split;

/**
 * program to split a string without using inbuilt split method
 * 
 * @author ss
 *
 */
public class Split {
	public static void SplitString(String args[]) {

		String StringToSplit = "good morning All";
		String array_to_store_split_words[] = new String[3];
		String word = "";
		int count = 0;
		for (int i = 0; i <= StringToSplit.length() - 1; i++) {

			char characters = StringToSplit.charAt(i);
			if (characters != ' ') {
				word += characters;
			} else {
				array_to_store_split_words[count] = word;
				word = "";
				count++;
			}
		}
		array_to_store_split_words[count] = word;

		System.out.println(array_to_store_split_words[0]);
		System.out.println(array_to_store_split_words[1]);
		System.out.println(array_to_store_split_words[2]);
	}
}
