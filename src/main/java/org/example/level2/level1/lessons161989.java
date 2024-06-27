package org.example.level2.level1;

public class lessons161989 {

    public static void main(String[] args) {

        int n = 4;
        int m = 1;
        int[] section = {1, 2, 3, 4};

        solution(n, m, section);
    }

    public static int solution(int n, int m, int[] section) {
        int start = section[0];
        int end = section[0] + (m-1);
        int ans = 1;

        for(int i : section){
            if(i>=start && i<=end)
                continue;
            else{
                start = i;
                end = i + (m-1);
                ans++;
            }

        }
        return ans;
    }

}
