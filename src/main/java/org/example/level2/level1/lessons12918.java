package org.example.level2.level1;

import java.util.Arrays;

public class lessons12918 {

    public static void main(String[] args) {
        String s = "a234";
        solution(s);
    }

    public static boolean solution(String s) {
        boolean answer = true;

        boolean isAllDigit = true;

        for(int i = 0; i < s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                isAllDigit = false;
            }
        }

        if(!(s.length()==4 || s.length()==6)){
            answer = false;
        }

        if(!isAllDigit){
            answer = false;
        }

        return answer;
    }

}
