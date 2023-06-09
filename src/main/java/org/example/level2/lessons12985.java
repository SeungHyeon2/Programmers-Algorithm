package org.example.level2;

import java.util.HashMap;
import java.util.Map;

public class lessons12985 {

    public static void main(String[] args) {

        int n = 8;
        int a = 3;
        int b = 7;

        solution(n, a, b);
    }

    public static int solution(int n, int a, int b) {
        int answer = 0;

        while(true){
            a = a/2 + a%2;
            b = b/2 + b%2;
            answer++;

            if(a==b){
                break;
            }
        }

        return answer;
    }

}
