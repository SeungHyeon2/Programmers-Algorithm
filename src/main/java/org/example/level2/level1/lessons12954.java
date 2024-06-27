package org.example.level2.level1;

public class lessons12954 {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        solution(x, n);
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i+1);
        }

        return answer;
    }

}
