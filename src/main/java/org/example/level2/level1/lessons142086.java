package org.example.level2.level1;

import java.util.ArrayList;

public class lessons142086 {

    public static void main(String[] args) {
        String s = "banana";
        // [-1, -1, -1, 2, 2, 2]
        solution(s);
    }


    public static int[] solution(String s){
        int[] answer = new int[s.length()];

        for(int i = 0; i < answer.length; i++){
            for(int j = i; j >= 0; j--){
                if(s.charAt(i)==s.charAt(j) && answer[i] == 0){
                    answer[i] = i-j;
                }
            }

            if(answer[i] == 0){
                answer[i] = -1;
            }
        }

        for(int x : answer){
            System.out.println(x);
        }


        return answer;
    }

}
