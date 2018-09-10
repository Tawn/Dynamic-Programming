package dynamic_programming;

public class CoinChange {
	
	/**
	 * This program returns the minimum # of coins needed for amount
	 */
	static final int[] coins = {1, 5, 6, 8}; // Different coins

	public static void main(String[] args) {
		// Unlimitted supply
		int amount = 11; // optimal solution is 5, 6
		
		// greedy algorithm causes: 8, 1, 1, 1, 1 (not optimal)
		
		
		int[] memo = new int[100];
		System.out.print(coinChange(amount, memo));
		
	}
	
	public static int coinChange(int amount, int[] memo) {
		
		// iterate through from coin 1 to k
		for(int i = 0; i < coins.length; i++) {
			// iterate through each coin from for each amount
			System.out.print("Coin " + coins[i] + ": ");
			for(int a = 0; a <= amount; a++) {
				// 0: 0, 1: 1, 2: 2, 3: 2
				
				// Algorithm
				if(a > 0 && a-coins[i] >= 0) {
					if((memo[a] > 1 + memo[a-coins[i]]) || memo[a] == 0) {
						memo[a] = 1 + memo[a-coins[i]];
					}
				}
				
				// Print result
				System.out.print(a + ": " + memo[a]);
				if(a > 9 && memo[a] < 10) {
					System.out.print("  | ");
				} else {
					System.out.print(" | ");
				}
			}
			System.out.println();
		}
		
		// return result
		return memo[amount - 1];
		
	}

}
