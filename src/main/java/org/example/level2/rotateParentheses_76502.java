package org.example.level2;

import java.util.*;

public class rotateParentheses_76502 {

    public static void main(String[] args) {
        // String s = "[](){}";
        // String s = "}]()[{";
        // String s = "[)(]";
        String s = "}}}";
        solution(s);
    }

    public static boolean validCheck (LinkedList<String> list){
        int count = 0;
        Stack<String> stack = new Stack<>();
        for(String str : list){
            if(!stack.isEmpty()){
                // 스택에 값이 들어있을때
                if(stack.peek().equals("[")){
                    if(str.equals("]")){
                        stack.pop();
                    }else{
                        stack.push(str);
                    }
                } else if(stack.peek().equals("(")){
                    if(str.equals(")")){
                        stack.pop();
                    }else{
                        stack.push(str);
                    }
                } else if(stack.peek().equals("{")){
                    if(str.equals("}")){
                        stack.pop();
                    }else{
                        stack.push(str);
                    }
                }
            }else{
                stack.push(str);
            }
        }

        if(stack.isEmpty()){
            return true;
        }else {
            return false;
        }

    }

    public static int solution(String origin) {
        int answer = 0;

        LinkedList<String> list = new LinkedList<>();
        for(int i=0; i<origin.length(); i++){
            list.add(Character.toString(origin.charAt(i)));
        }

        for(int i=0; i<origin.length(); i++){
            list.addLast(list.getFirst());
            list.removeFirst();
            if(validCheck(list)){
                answer++;
            }
        }


        System.out.println("answer: " + answer);
        return answer;
    }
}
