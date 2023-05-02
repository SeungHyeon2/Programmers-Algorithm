package org.example.level1;

import java.util.Arrays;
import java.util.List;

public class lessons176963 {

    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        solution(name, yearning, photo);
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {

        int[] answer = new int[photo.length];
        List<String> yeah = Arrays.asList(name);

        for(int i = 0; i < photo.length; i++){
            int sum = 0;
            for(int j = 0; j< photo[i].length; j++){
                if(yeah.contains(photo[i][j])){
                    System.out.println(yearning[yeah.indexOf(photo[i][j])]);
                    sum += yearning[yeah.indexOf(photo[i][j])];
                }else{
                    sum += 0;
                }
            }
            answer[i] = sum;
        }

        return answer;
    }
}
