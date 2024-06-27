package org.example.level2.level1;

public class lessons12916 {
    public static void main(String[] args) {
        String s = "pPoooyY";
        solution(s);
    }

    public static boolean solution(String s) {
        boolean answer = true;

        char[] c = s.toLowerCase().toCharArray();
        int countP = 0;
        int countY = 0;
        for (int i = 0; i < c.length; i++) {
            if(c[i] == 'p'){
                countP += 1;
            }if(c[i] == 'y'){
                countY += 1;
            }
        }

        System.out.println("countP : " + countP);
        System.out.println("countY : " + countY);

        if(countP==0&countY==0){
            answer = true;
        }else if(countP==countY){
            answer = true;
        }else{
            answer = false;
        }

        return answer;
    }
}
