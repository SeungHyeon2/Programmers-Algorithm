package org.example.level2;

public class lessons12980 {

    public static void main(String[] args) {
        int N = 5;
        solution(N);
    }

    public static int solution(int n){
        int ans = 0;

        while(n!=0){
            if(n%2==0){
                n = n/2;
            }else{
                n = n - 1;
                ans++;
            }
        }

        return ans;
    }

}
