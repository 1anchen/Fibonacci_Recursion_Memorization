public class Fibonacci {

    public int calculateFibonacci(int number, int[] memo){

        if(number<=0) return 0;
        if(number==1) return 1;
        if(memo[number] >0) return memo[number];

        memo[number] = memo[number-1] + memo[number-2];

        return memo[number];
    }



}