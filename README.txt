Dynamic Programming 

In with dynamic programming, utilizing the memoization tool, you save exponential time by memorizing the solutions to the subproblems, which will eliminate the redundant calculations in many recursive programs. 

Fibonacci Sequence:
- The dynamic programming used for this program only works down a quarter of the fibonnaci tree. 
- Saving the solution from fib(n-1) to fib(1). The value when calculating fib(n-1) is already saved in an array. 

Coin Change Problem:
- The memoize array memorizes the optimal solutions to the subproblems by saving the smallest number of coins needed for current amount [a], and replaced when a single bigger coin can make up for multiple smaller ones.
- optimal amount memo[a] = 1 + memo[a - current coin] (if a is >= to current coin)/
