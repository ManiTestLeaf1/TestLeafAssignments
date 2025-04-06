package week1.day2;


public class CheckPalindrome {
public static void main(String[] args) {
	String input="19011091";
	String output="";

	for(int i=input.length()-1;i>=0;i--) {
		
	output = output+input.charAt(i);
}
	if(input.equals(output))
	{
		System.out.println(output);	
	System.out.println("Palindrome");
	}
	else {
		System.out.println(output);	
		System.out.println("Not a Palindrome");
}
}
}