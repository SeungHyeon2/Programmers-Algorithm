package org.example.level2.level1;

import java.util.StringTokenizer;

public class lessons132267 {

    public static void main(String[] args) {
        solution(2, 1, 20);
    }

    public static int solution(int a, int b, int n) {

        int answer = 0;

        // a는 콜라를 받기 위해 마트에 주어야 하는 병 수
        // b는 빈병 a개 를 가져다 주면 마트가 주는 콜라 개수
        // n은 처음 가지고 있는 콜라 개수
        // answer는 최대로 받을 수 있는 병의 갯수

        // n이 8이고 a 가 3일때
        while(n/a > 0){
            answer += (n/a)*b;
            System.out.println("answer : " + answer);
            n=(n/a)*b + (n%a);
            System.out.println("n : " + n);
        }

        System.out.println("answer : " + answer);

        return answer;
    }
}
