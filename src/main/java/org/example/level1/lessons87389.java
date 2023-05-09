package org.example.level1;

public class lessons87389 {

    public static void main(String[] args) {
        solution(10);
    }


    public static int solution(int n){
        int answer = 0;

        for (int i = 1; i < n; i++) {
            if(n%i==1){
                return i;
            }
        }

        return answer;
    }

}
