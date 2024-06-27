package org.example.level1;

public class lessons147355 {
    public static void main(String[] args) {
        System.out.println(solution("10203", "15"));
    }


    public static int solution(String t, String p){
        int i1 = t.length() - p.length() + 1;
        String[] array = new String[i1];

        // System.out.println(p.length());

        int answer = 0;

        for(int i = 0; i< i1; i++){
            array[i] = t.substring(i, i+p.length());
            // System.out.println("array[" + i + "] : " + array[i]);

            if(Long.parseLong(array[i]) <= Long.parseLong(p)){
                answer += 1;
            }
        }

        return answer;
    }

}
