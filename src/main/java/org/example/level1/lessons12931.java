package org.example.level1;

public class lessons12931 {

    public static void main(String[] args) {
        int n = 123;
        solution(n);
    }

    public static int solution(int n) {
        int answer = 0;
        char[] x = Integer.toString(n).toCharArray();
        for(int i = 0; i < x.length; i++){
            answer += Integer.parseInt(Character.toString(x[i]));
        }
        return answer;
    }
}
