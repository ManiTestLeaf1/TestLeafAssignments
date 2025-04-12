package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "stops", str2 = "potss";
		int counter = 0;

		if (str1.length() != str2.length()) {
			System.out.println("Not an anagram due to difference in length");
		} else {

			char[] str1char = str1.toCharArray();
			char[] str2char = str2.toCharArray();

			Arrays.sort(str1char);
			Arrays.sort(str2char);

			for (int i = 0; i < str1.length(); i++) {

				if (str1char[i] == str2char[i]) {
					counter++;

				}
			}
			if (counter == str1.length()) {
				System.out.println("Given strings are anagram");
			} else {
				System.out.println("Given strings are Not an anagram due to not matching letters");
			}

		}

	}

}
