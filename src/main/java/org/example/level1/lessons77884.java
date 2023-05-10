package org.example.level1;

public class lessons77884 {
    public static void main(String[] args) {
        int left = 13;
        int right = 17;

        solution(left, right);
    }

    public static int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int yaksu = 0;
            // int yeah = (int)Math.sqrt(i);
            for(int j = 1; j <= i; j++){
                if(i%j == 0){
                    System.out.println("i : " + i);
                    System.out.println("j : " + j);
                    yaksu += 1;
                }
            }
            // System.out.println("약수 : " + yaksu);
            if(yaksu%2 == 0){
                // System.out.println("약수 갯수가 짝수 : " + i);
                answer += i;
            }else if(yaksu%2 == 1){
                // System.out.println("약수 갯수가 홀수 : " + i);
                answer -= i;
            }
        }


        System.out.println(answer);
        return answer;
    }
}
