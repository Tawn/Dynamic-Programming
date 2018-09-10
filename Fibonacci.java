package dynamic_programming;

public class Fibonacci {
	
	public static void main(String[] args) {
		int[] memo = new int[100];
		
		long startTime = System.nanoTime();
		System.out.println(fibDP(25, memo));
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	
		// Comment above and uncomment below to test regular fib(n)
		
//		long startTime = System.nanoTime();
//		System.out.println(fib2(25));
//		long endTime   = System.nanoTime();
//		long totalTime = endTime - startTime;
//		System.out.println(totalTime);
		
		
	}
	
	
	
	public static int fibDP(int n, int[] memo) {
		
		// Base Case
		if(n <= 1)
			return n;
		
		// Memoize Array
		if(memo[n] != 0) 
			return memo[n];
		
		// Recursive and Save Solution to Subproblems
		else {
			int f = fibDP(n-1, memo) + fibDP(n-2, memo);
			memo[n] = f;
			return f;	
		}
	}
	
	// Normal Fibonacci algorithm
	public static int fib2(int n) {
		if(n <= 1) {
			return n;
		} else { 
			return fib2(n-1) + fib2(n-2);
		}
	}

}
