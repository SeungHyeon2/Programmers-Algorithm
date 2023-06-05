package org.example.level2;

import java.util.ArrayList;
import java.util.Collections;

public class lessons12945 {

    public static void main(String[] args) {
        int n = 3;
        solution(n);
    }

    public static int solution(int n) {
        int answer = 0;
        ArrayList<Integer> al = new ArrayList<>();

        al.add(0);
        al.add(1);

        for(int i = 2; i <= n; i++){
            al.add(al.get(i-1)%1234567 + al.get(i-2)%1234567);
        }
        answer = al.get(n)%1234567;
        return answer;
    }

}
