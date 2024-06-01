package org.example.level2;

import java.util.*;

//괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어
//
//"()()" 또는 "(())()" 는 올바른 괄호입니다.
//")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
//'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.
//
//제한사항
//문자열 s의 길이 : 100,000 이하의 자연수
//문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
//입출력 예
//s	answer
//"()()"	true
//"(())()"	true
//")()("	false
//"(()("	false

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
        ArrayList<Character> list = new ArrayList<Character>();
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < s.length(); i++){
            list.add(s.charAt(i));

//            if(list.get(0)  == ')'){
//                answer = false;
//                return answer;
//            } else if(list.get(list.size() - 1) == '('){
//                answer= false;
//                return answer;
//            }

            if((i == 0 && s.charAt(i) == ')') || (i == s.length() -1 && s.charAt(i) == '(') ){
                return false;
            }

            if(stack.isEmpty() && s.charAt(i) == ')'){
                return false;
            }

            if(stack.isEmpty()){
                // 스택이 비어있을 경우
                stack.push(s.charAt(i));
            }else if(stack.peek() == '('){
                if(s.charAt(i) == '('){
                    stack.push(s.charAt(i));
                }else if(s.charAt(i) == ')'){
                    stack.pop();
                }
            }else if(stack.peek() == ')'){
                if(s.charAt(i) == '('){
                    stack.pop();
                }else if(s.charAt(i) == ')'){
                    stack.push(s.charAt(i));

                }
            }
        }

        if(stack.isEmpty()){
           answer = true;
        }

//        int count = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) == '('){
//                count++;
//            }else if (s.charAt(i) == ')' && count != 0) {
//                count--;
//            }
//        }
//
//        if(count == 0){
//            answer = true;
//        }
//
//        if(s.charAt(0) == ')'){
//            answer = false;
//        }
//
//        System.out.println("answer : " + answer);

        return answer;

    }

}
