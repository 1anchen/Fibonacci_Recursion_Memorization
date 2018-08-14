public class Fibonacci {

    public int calculate(int number){
        int [] memo = new int[number+1];

        if(number<=0) return 0;
        if(number==1) return 1;
        if(memo[number] >0) return memo[number];

        memo[number] =calculate(number-1) + calculate(number-2);

        return memo[number];
    }



}