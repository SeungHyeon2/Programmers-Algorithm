package org.example.level1;

public class lessons76501 {

    public static void main(String[] args) {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};

        solution(absolutes, signs);
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        int[] real = new int[absolutes.length];

        for (int i = 0; i < absolutes.length; i++) {
            if(signs[i]){
                real[i] = absolutes[i];
            }else{
                real[i] = -absolutes[i];
            }

            answer += real[i];
        }

        return answer;
    }

}
