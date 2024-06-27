package org.example.level2.level1;

import java.util.StringTokenizer;

public class lessons12926 {

    public static void main(String[] args) {
        String s = "a A b B";
        int n = 25;
        solution(s, n);
    }

    public static String solution(String s, int n) {

        char[] alpha = s.toCharArray();

        for(int i = 0; i < alpha.length; i++){
            if(Character.isUpperCase(alpha[i])){
                if(alpha[i] + n > 'Z'){
                    alpha[i] = (char) ('A' + (alpha[i] + n - 90) - 1);
                }else{
                    alpha[i] = (char) (alpha[i] + n);
                }
            }else if(Character.isLowerCase(alpha[i])){
                if(alpha[i] + n > 'z'){
                    alpha[i] = (char) ('a' + (alpha[i] + n - 122 - 1));
                }else{
                    alpha[i] = (char) (alpha[i] + n);
                }
            }
        }

        String answer = new String(alpha);
        System.out.println("answer : " + answer);

        return answer;
    }
}
