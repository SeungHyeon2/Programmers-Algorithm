package org.example.level1;

public class lessons161989 {

    public static void main(String[] args) {

        int n = 8;
        int m = 4;
        int[] section = {2, 3, 6};

        solution(n, m, section);
    }

    public static int solution(int n, int m, int[] section) {
        int answer = 0;

        int min = section[0];
        int max = section[section.length - 1];

        int target = max - min + 1;

        if(target > 0){
            answer = 1;
        }

        if(target%m!=0){
            answer = target/m + 1;
        }else if(target%m==0){
            answer = target/m;
        }

        // System.out.println("answer : " + answer);
        return answer;
    }

}
