package org.example.level1;

public class lessons136798 {
    public static void main(String[] args) {
        // System.out.println(solution(5, 3, 2));
        solution(5, 3, 2);
    }


    public static int solution(int number, int limit, int power) {
        int answer = 0;
        int[] yaksuArray = new int[number];


        // 1이면 1     1개
        // 2이면 1.xxx 2개
        // 3이면 1.xxx 2개
        // 4이면 2     3개
        // 5이면 2.xxx 2개
        // 6이면 2.xxx 4개
        // 7이면 2.xxx 2개
        // 8이면 2.xxx 4개
        // 9이면 3     3개

        for (int i = 1; i <= number; i++) {
            int yaksu = 0;
            int sqrt = (int) Math.sqrt(i);
            for(int j=1; j <= sqrt; j++){
                // i가 4일때
                // j는 1
                // j는 2
                if(i % j == 0){
                    if (i / j == j){
                        yaksu += 1;
                    } else{
                        yaksu += 2;
                    }
                }
            }



            yaksuArray[i-1] = yaksu;
        }

        for(int knight : yaksuArray){
            System.out.println(knight);
            if(knight > limit){
                knight = power;
            }
            answer += knight;
        }


        return answer;
    }

}
