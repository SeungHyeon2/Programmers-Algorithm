package org.example.level1;

import java.util.ArrayList;
import java.util.Collections;

public class lessons12917 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        solution(s);
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder(s);
        ArrayList<String> list = new ArrayList<>();
        char[] ca = s.toCharArray();

        int upper = 0;
        int lower = 0;

        for (int i = 0; i < ca.length; i++) {
            if(Character.isUpperCase(ca[i])){
                upper += 1;
            }else if(Character.isLowerCase(ca[i])){
                lower += 1;
            }
        }

        // System.out.println(upper);
        // System.out.println(lower);

        char[] upperChars = new char[upper];
        char[] lowerChars = new char[lower];

        int q = 0;
        int w = 0;

        for (int i = 0; i < ca.length; i++) {
            if(Character.isUpperCase(ca[i])){
                upperChars[q] = ca[i];
                q++;
            }else if(Character.isLowerCase(ca[i])){
                lowerChars[w] = ca[i];
                w++;
            }
        }

//        for (int i = 0; i < lowerChars.length; i++) {
//            System.out.println(lowerChars[i]);
//        }
//        String upperString = new String(upperChars);
//        String lowerString = new String(lowerChars);
//
        ArrayList<String> ALUpperStrings = new ArrayList<>();
        ArrayList<String> ALLowerStrings = new ArrayList<>();

        for(int i = 0; i < upperChars.length; i++){
            ALUpperStrings.add(String.valueOf(upperChars[i]));
        }

        for(int i = 0; i < lowerChars.length; i++){
            ALLowerStrings.add(String.valueOf(lowerChars[i]));
        }

//        System.out.println(ALUpperStrings);
//        System.out.println(ALLowerStrings);

        Collections.sort(ALLowerStrings);
        Collections.sort(ALUpperStrings);

        // System.out.println(ALLowerStrings + ALUpperStrings.toString());
        s = String.join("",ALLowerStrings) + String.join("", ALUpperStrings);
        System.out.println(s);

    return s;
    }
}
