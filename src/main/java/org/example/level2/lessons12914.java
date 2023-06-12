package org.example.level2;

import java.util.HashSet;

public class lessons12914 {

    public static void main(String[] args) {
        int n = 4;
        solution(n);
    }

    public static long solution(int n) {
        long answer = 0;

        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }

        long[] dp = new long[n + 1];

        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i < n+1; i++){
            dp[i] = (dp[i-1] + dp[i-2])%1234567;
        }



        return dp[n+1];
    }

}
