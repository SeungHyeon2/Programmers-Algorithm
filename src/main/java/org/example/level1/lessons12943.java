package org.example.level1;

public class lessons12943 {

    public static void main(String[] args) {
        int n = 626331;
        solution(n);
    }

    public static int solution(int num1) {
        int answer = 0;
        double num = num1;
        while(!(num==1)){
            if(answer >= 500){
                return -1;
            }
            if(num%2==0){
                num = num / 2;
                answer += 1;
            }else {
                num = (num*3) + 1;
                answer += 1;
            }
        }
        return answer;
    }
}
