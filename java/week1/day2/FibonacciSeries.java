package week1.day2;

public class FibonacciSeries {
	public static void main(String[] args) {
	
		int N=8;
		int F=0,S=1;
		
		for(int i=0;i<N;i++) {
			System.out.print(F+" ");
			int sum = F+S;
			F=S;
			S=sum;
		}
		
		
	}

}
