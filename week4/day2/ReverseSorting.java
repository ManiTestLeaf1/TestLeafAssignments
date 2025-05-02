package week4.day2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Home Assignment <4>: Sorting Using Collection

public class ReverseSorting {
	public static void main(String[] args) {
		// Declare a List {HCL, Wipro, Aspire Systems, CTS}
		List<String> companies = new ArrayList<String>();
		companies.add("HCL");
		companies.add("Wipro");
		companies.add("Aspire Systems");
		companies.add("CTS");

		int L = companies.size();
		// Sort the list - Default order is Ascending
		Collections.sort(companies);

		// Iterate the list and print it in reverse order

		for (int i = L - 1; i >= 0; i--) {

			System.out.print(" " + companies.get(i));
			;
		}

	}

}
