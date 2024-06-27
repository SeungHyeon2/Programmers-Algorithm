package org.example.level2.level1;

public class lessons12901 {

    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        solution(a, b);
    }

    public static String solution(int a, int b) {
        String answer = "";

        String[] Day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] DaysPerMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] DaysOfYear = new String[366];
        int seven = 5;
        for (int i = 0; i < DaysOfYear.length; i++) {
            if(seven>=7){
                seven = 0;
            }

            DaysOfYear[i] = Day[seven];
            seven++;
        }

        int x = 0;
        for(int i = 0; i < a-1; i++){
            x+= DaysPerMonth[i];
        }
        x = x+b;

        answer = DaysOfYear[x-1];

        System.out.println(answer);
        return answer;
    }

}
