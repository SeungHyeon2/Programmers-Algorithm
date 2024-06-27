package org.example.level2.level1;

public class lessons12919 {

    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        solution(seoul);
    }

    public static String solution(String[] seoul) {
        StringBuilder answer = new StringBuilder("김서방은 ");

        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer.append(i).append("에 있다");
            }
        }

        System.out.println(answer);

        return answer.toString();
    }

}
