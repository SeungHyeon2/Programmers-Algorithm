package org.example.level1;

public class lessons12922 {
    public static void main(String[] args) {
        int n = 3;
        solution(n);
    }

    public static String solution(int n) {
        char[] xx = new char[n];
        for (int i = 1; i < n+1; i++) {
            String str1 = "수";
            String str2 = "박";
            if(i%2==0){
                xx[i-1] = str2.charAt(0);
            }else {
                xx[i - 1] = str1.charAt(0);
            }
            // System.out.println(xx[i-1]);
        }


        String answer = new String(xx);

        return answer;
    }
}
