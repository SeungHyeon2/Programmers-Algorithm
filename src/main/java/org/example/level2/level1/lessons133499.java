package org.example.level2.level1;

public class lessons133499 {

    public static void main(String[] args) {
        String[] babbling = {"aya", "yee", "u", "maa"};
        // String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        solution(babbling);
    }

    public static int solution(String[] babbling) {
        int answer = 0;
        String[] canSpeak = {"aya", "ye", "woo", "ma"};

        for(int i = 0; i < babbling.length; i++){
            for(int j = 0; j< babbling[i].length()-1; j++){
                if(babbling[i].charAt(j) == babbling[i].charAt(j+1)){
                    System.out.println("d");
                    break;
                }
            }


        }

        return answer;
    }

}
