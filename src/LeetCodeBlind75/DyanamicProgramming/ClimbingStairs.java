package LeetCodeBlind75.DyanamicProgramming;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        int[] fab =  new int[n+1];
        fab[0] =1;
        fab[1] =1;
        for(int i=2;i<=n;i++)
            fab[i] = fab[i-1]+fab[i-2];

        return fab[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
