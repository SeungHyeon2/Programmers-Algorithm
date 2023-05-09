package org.example.level1;

public class lessons12947 {
    public static void main(String[] args) {
        int x = 11;
        solution(x);
    }

    public static boolean solution(int x) {
        boolean answer = true;

        int sum = 0;
        char[] yes = Integer.toString(x).toCharArray();
        for(char c : yes){
            sum += Integer.parseInt(String.valueOf(c));
        }

        if(x%sum==0){
            answer = true;
        }else{
            answer = false;
        }

        System.out.println(answer);
        return answer;
    }

}
