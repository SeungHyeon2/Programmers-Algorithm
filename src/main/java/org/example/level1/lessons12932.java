package org.example.level1;

public class lessons12932 {

    public static void main(String[] args) {
        long n = 12345;
        solution(n);
    }

    public static int[] solution(long n) {


        StringBuilder sb = new StringBuilder(20).append(n);
        char[] sex = sb.reverse().toString().toCharArray();

        int[] answer = new int[sex.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Character.digit(sex[i], 10);
            System.out.println(answer[i]);
        }
        return answer;
    }
}
