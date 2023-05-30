package org.example.level2;

import java.util.HashMap;
import java.util.StringTokenizer;

public class lessons12909 {

    public static void main(String[] args) {
//        String s = "()()";
//        String s = "(())()";
        String s = ")()(";
//        String s = "(()(";
        solution(s);
    }

    public static boolean solution(String s) {
        boolean answer = false;

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                count++;
            }else if (s.charAt(i) == ')' && count != 0) {
                count--;
            }
        }

        if(count == 0){
            answer = true;
        }

        if(s.charAt(0) == ')'){
            answer = false;
        }

        System.out.println("answer : " + answer);

        return answer;

    }

}
