package week3.day1;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] testarr = test.toCharArray();
		for (int i = 0; i < testarr.length; i++) {
			if (i % 2 != 0) {
				testarr[i] = Character.toUpperCase(testarr[i]);
			}
			System.out.print(testarr[i]);
		}
	}

}
