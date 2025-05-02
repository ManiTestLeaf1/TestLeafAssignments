package week4.day2;

import java.util.ArrayList;
import java.util.List;

//Home Assignment <1> Find Intersection using List

public class FindIntersectionList {

	public static void main(String[] args) {

		// List Declaration and initialization

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();

		list1.add(3);
		list1.add(2);
		list1.add(11);
		list1.add(4);
		list1.add(6);
		list1.add(7);

		list2.add(1);
		list2.add(2);
		list2.add(8);
		list2.add(4);
		list2.add(9);
		list2.add(7);
//Find the size of the lists
		int L1 = list1.size();
		int L2 = list2.size();

		System.out.print("The duplicate numbers are ");
		
		// Iterate through the length of the lists to find the intersections 

		for (int i = 0; i < L1; i++) {
			for (int j = 0; j < L2; j++) {

				if (list1.get(i) == (list2.get(j))) {

					System.out.print(" " + list1.get(i));
				}

			}

		}

	}

}
