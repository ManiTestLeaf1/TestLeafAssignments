package week3.day1;

public class ReverseOddWords {

	/*
	Reverse the odd position words from a String with the input:
String test = "I am a software tester";
Expected output: “I ma a erawtfos tester
*/
	
	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] strarr=test.split(" ");
		for(int i=0;i<strarr.length;i++)
		{
			if(i%2!=0) {
			char[] chars = strarr[i].toCharArray();
			
			for(int j=chars.length-1;j>=0;j--)
			{
		
				System.out.print(chars[j]);
			
			
		}
			
		}
else {
	System.out.print(" "+strarr[i]);		
			}
			System.out.print(" ");
		}
	}

}
