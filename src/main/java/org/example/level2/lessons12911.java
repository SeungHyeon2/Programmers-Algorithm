package org.example.level2;

public class lessons12911 {

    public static void main(String[] args) {
        int n = 78;
        solution(n);
    }

    public static int solution(int n) {
        int answer= 0;

        String nToBinary = Integer.toBinaryString(n);
        int nCount = 0;
        for (int i = 0; i < nToBinary.length(); i++) {
            if(nToBinary.charAt(i) == '1'){
                nCount++;
            }
        }

        // System.out.println("nCount : " + nCount);


        for (int i = n+1; i <= 1000000; i++) {
            String nextToBinary = Integer.toBinaryString(i);
            int nextCount = 0;

            for(int j = 0; j< nextToBinary.length(); j++){
                if(nextToBinary.charAt(j) == '1'){
                    nextCount++;
                }
            }

//            System.out.println("nextCount : " + nextCount);
//            System.out.println("i : " + i);
            if(nextCount == nCount){
                answer = i;
                break;
            }
        }


        return answer;
    }

}
