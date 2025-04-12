package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int input[] = { 1, 4, 3, 2, 8, 6, 7 };
		boolean flag = true;
		Arrays.sort(input);

		for (int i = 0; i < input.length - 1; i++) {
			if (input[i + 1] != input[i] + 1) {
				System.out.println("The missing number is " + (input[i] + 1));
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("No missing number");

		}

	}

}
