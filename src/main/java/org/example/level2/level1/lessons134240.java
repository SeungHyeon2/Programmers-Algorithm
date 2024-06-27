package org.example.level2.level1;

public class lessons134240 {

    public static void main(String[] args) {
        solution(new int[]{1, 3, 4, 6});
    }

    public static String solution(int[] food) {
        String answer = "";

        for (int i = 0; i < food.length; i++) {
            if(food[i]%2 == 0){
                // 인덱스가 짝수일 때
                System.out.println("짝수 호출");
                for(int j = 0; j< (food[i]/2); j++){
                    answer += Integer.toString(i);
                }
            }else {
                // 인덱스가 홀수일 때
                System.out.println("홀수 호출");
                for(int j = 0; j< (food[i]/2); j++){
                    answer += Integer.toString(i);
                }
            }
        }
        StringBuilder sb = new StringBuilder(answer);
        String answer2 = sb.reverse().toString();

        answer+= "0";
        answer+= answer2;
        System.out.println("answer : " + answer);
        return answer;
    }
}
