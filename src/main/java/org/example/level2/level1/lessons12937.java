package org.example.level2.level1;

public class lessons12937 {
    public static void main(String[] args) {
        int num = 3;
        solution(num);
    }

    public static String solution(int num) {
        String answer = "";

        if(num % 2 == 0){
            answer = "Even";
        }else {
            answer = "Odd";
        }

        return answer;
    }
}
