package org.example.level2.level1;

public class lessons131705 {
    public static void main(String[] args) {

        solution(new int[]{-2, 3, 0, 2, -5});
    }


    public static int solution(int[] numbers){
        int answer = 0;

        for(int i = 0; i < numbers.length-2; i++){
            for (int j = i+1; j < numbers.length-1; j++) {
                for (int k=j+1; k < numbers.length; k++) {
                    // System.out.println(i + " " + j + " " + k);
                    if(numbers[i]+numbers[j]+numbers[k] == 0) answer += 1;
                }
            }
        }

        System.out.println("answer : " + answer);
        return answer;
    }

}
