package org.example.level1;

public class lessons70128 {

    public static void main(String[] args) {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        solution(new int[]{1, 2, 3,4 }, new int[]{-3, -1, 0, 2});
    }

    public static int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        System.out.println(answer);
        return answer;
    }
}
