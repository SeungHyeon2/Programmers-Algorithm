package org.example.level2.level1;

public class lessons159994 {

    public static void main(String[] args) {
        // String[] cards1 = {"i", "drink", "water"};
        // String[] cards2 = {"want", "to"};
        // String[] goal = {"i", "want", "to", "drink" , "water"};
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink" , "water"};
        solution(cards1, cards2 , goal);
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int Index1 = 0;
        int Index2 = 0;

        for (String s : goal) {
            if (s.equals(cards1[Index1])) {
                if (Index1 + 1 < cards1.length) {
                    Index1++;
                }
            } else if (s.equals(cards2[Index2])) {
                if (Index2 + 1 < cards2.length) {
                    Index2++;
                }
            } else {
                answer = "No";
            }
        }

        return answer;
    }

}
