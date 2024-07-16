import java.util.*;


public class Fibonacci {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
	
	
		System.out.print("Enter value of n ");
		int n = sc.nextInt();
		
		fibonacci_non_rec(n);
		
		fib_rec(n);	
	}
	
	public static void fibonacci_non_rec(int n) {
		int t1 = 0;
		int t2 = 1;
		
		for(int i=0; i<=n; i++) {
			System.out.print(t1 + " ");
			int t3 = t1 + t2;
			t1 = t2;
			t2 = t3;
		}
		
		System.out.println();
	}
	
	public static void fib_rec(int n){
		for(int i=0; i<=n; i++){
			System.out.print(fibonacci_rec(i) + " ");
		}
		System.out.println();
	}
	
	public static int fibonacci_rec(int n) {
		if(n <= 1) 
			return n;
		return fibonacci_rec(n-1) + fibonacci_rec(n-2);
	}

}
