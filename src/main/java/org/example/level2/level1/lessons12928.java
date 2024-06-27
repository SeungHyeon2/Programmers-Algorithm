package org.example.level2.level1;

import java.util.ArrayList;

public class lessons12928 {

    public static void main(String[] args) {
        int n = 12;
        solution(n);
    }

    public static int solution(int n) {
        int answer = 0;

        // ArrayList<Integer> ai = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                answer += i;
            }
        }

        return answer;
    }
}
