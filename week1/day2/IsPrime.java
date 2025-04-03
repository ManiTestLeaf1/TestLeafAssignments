package week1.day2;

public class IsPrime {
public static void main(String[] args) {
	int n=11;
	boolean isPrime = true;
	for(int i=2;i<n-1;i++) {
		if(n%i ==0) {
			isPrime=false;
		break;
		}
	}
	if(isPrime){
		System.out.println("prime");
	}
		else {
			System.out.println("not a prime");
		}
	
}
}
