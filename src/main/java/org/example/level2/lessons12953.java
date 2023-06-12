package org.example.level2;

public class lessons12953 {

    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 14};
        solution(arr);
    }

    public static int solution(int[] arr){
        int answer = 0;
        int max = 0;
        long range = 1;

        for(int i = 0; i < arr.length; i++){
            range = range * arr[i];
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int i = max; i<=range; i++){
            int count = 0;
            for(int j = 0; j<arr.length; j++){
                if((i % arr[j]) == 0){
                    count++;
                }

                if(count == arr.length){
                    return i;
                }
            }
        }

        return answer;
    }

}
