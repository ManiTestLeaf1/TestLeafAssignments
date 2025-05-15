package AssignmentPrograms;

public class LengthCharacter {

	public static void FindLengthy(String input) {
		String[] words = input.split(" ");
		int i = words.length;
		System.out.println("The last word length is " + words[i - 1].length());
	}

	public static void main(String[] args) {
		FindLengthy("Hello World  ");
		FindLengthy("   fly me   to   the moon  ");
		FindLengthy("luffy is  still joyboy  ");
	}

}
