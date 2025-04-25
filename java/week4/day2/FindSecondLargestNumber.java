package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Home Assignment <2>: Find Second Largest Number using List

public class FindSecondLargestNumber {

	public static void main(String[] args) {
//Declare and Initialize a list 
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(11);
		list.add(4);
		list.add(6);
		list.add(7);
		int LengthOfList = list.size();

// Sort the list - default is ascending order
		Collections.sort(list);

// Print second largest number in the list
		System.out.println(list.get(LengthOfList - 2));
	}

}
