package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";

		String[] textarr = text.split(" ");
		int counter = 0;
		for (int i = 0; i < textarr.length; i++) {
			for (int j = i + 1; j < textarr.length; j++) {
				if (textarr[i].equalsIgnoreCase(textarr[j])) {

					textarr[j] = "";
					counter++;
				}

			}
			if (textarr[i] != ("")) {
				System.out.print(" " + textarr[i]);
			}
		}
	}

}
