package org.example.level2.level1;

public class lessons12944 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        solution(arr);
    }

    public static double solution(int[] arr) {
        double answer = 0;

        for(double x : arr){
            answer += x;
        }

        answer = answer / arr.length;

        return answer;
    }
}
