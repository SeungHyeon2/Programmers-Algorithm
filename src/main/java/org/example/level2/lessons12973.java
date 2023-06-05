package org.example.level2;

import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class lessons12973 {

    public static void main(String[] args) {
        String s = "baabaa";
//        String s = "cdcd";
        solution(s);
    }

    public static int solution(String str) {
        String[] split = str.split("");
        Stack<String> stack = new Stack<>();

        for(String s : split){
            if(!stack.isEmpty() && stack.peek().equals(s)){
                stack.pop();
            }else{
                stack.push(s);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
