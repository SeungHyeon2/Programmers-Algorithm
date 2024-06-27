package org.example.level1;

public class lessons12934 {

    public static void main(String[] args) {
        long n = 3;
        solution(n);
    }

    public static long solution(long n) {
        long max = (long) Math.sqrt(n);
        long answer = 0;
        for (int i = 1; i <= max; i++) {
            if((long) i *i == n){
                answer = (long) (i + 1) *(i+1);
                return answer;
            }else{
                answer = -1;
            }
        }
        return answer;
    }

}
