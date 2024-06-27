package org.example.level2.level1;

public class lessons12948 {
    public static void main(String[] args) {
        String phone_number = "01033334444";
        solution(phone_number);
    }

    public static String solution(String phone_number) {
        String answer = "";

        String asterisk = phone_number.substring(0,phone_number.length()-4);
        String number = phone_number.substring(phone_number.length() - 4);

        answer = asterisk.replaceAll(".","*") + number;

        return answer;
    }
}
