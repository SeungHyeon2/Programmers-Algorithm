package org.example.level2;

public class lessons12924 {

    public static void main(String[] args) {
        int n = 15;
        solution(15);
    }

    public static int solution(int n) {
        int answer= 0;


        for(int i = 1; i <= n; i++){
            int temp = 0;
            for (int j = i; j <= n; j++) {
                if(temp > n){
                    break;
                }
                temp = temp + j;
                if(temp == n){
                    answer++;
                }

            }
        }

        return answer;
    }

}
