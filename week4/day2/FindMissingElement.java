package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Home Assignment <3>: Find Missing Element using List

public class FindMissingElement {

	public static void main(String[] args) {
		// Declare a List - {1, 2, 3, 4, 10, 6, 8}

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(10);
		list.add(6);
		list.add(8);
// sort the list
		Collections.sort(list);
		System.out.print("The missing numbers are ");

		int LengthOfList = list.size();
// find the missing no - compare the second element is equal to first element+1 and so on until the size of the list 
		for (int i = 0; i < LengthOfList - 1; i++) {
			if (list.get(i + 1) != (list.get(i) + 1)) {
				System.out.print(" " + (list.get(i) + 1));
				int first = list.get(i + 1);
			}

		}

	}

}
