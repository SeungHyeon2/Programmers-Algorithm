package org.example.level1;

import java.util.ArrayList;

public class lessons12921 {

    public static void main(String[] args) {
        int n = 5;
        solution(n);
    }

    public static int solution(int n) {
        int answer = 0;

        // Case 1 Start
//        for(int i = 2; i <= n; i++){
//            int temp = 0;
//            for(int j = 1; j <= i; j++){
//                if(i%j==0){
//                    temp++;
//                }
//            }
//            if(temp<3){
//                answer++;
//            }
//        }
        // Case 1 end




        // Case 2 Start

        int[] arr = new int[n+1];

        for(int i = 0; i <= n; i++){
            arr[i] = i;
        }

        // 소수가 아닌 수 0
        // 소수인 수 1
        arr[1] = 0;

        for(int i=2; i<=n; i++){
            if(arr[i] == 0) continue;

            for(int j=i*2; j<= n; j+=i){
                arr[j] = 0;
            }
        }

        for (int j : arr) {
            if (j != 0) {
                answer++;
            }
        }

        // Case 2 End
        return answer;
    }

}
