package org.example.level2.level1;

import java.util.ArrayList;

public class lessons17682 {

    public static void main(String[] args) {
        String dartResult = "1S2D*3T";
//        String dartResult = "1D2S#10S";
//        String dartResult = "1D2S0T";
//        String dartResult = "1S*2T*3S";
//        String dartResult = "1D#2S*3S";
//        String dartResult = "1T2D3D#";
//        String dartResult = "1D2S3T*";
        solution(dartResult);
    }

    public static int solution(String dartResult) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> al = new ArrayList<>();

        for (int i = 0; i < dartResult.length(); i++) {
            if(!Character.isDigit(dartResult.charAt(i)) && sb.length() > 0){
                al.add(String.valueOf(sb));
                sb.setLength(0);
            }

            if(Character.isDigit(dartResult.charAt(i))){
                sb.append(dartResult.charAt(i));
            }else{
                al.add(String.valueOf(dartResult.charAt(i)));
            }
        }

        int trial1 = 0;
        int trial2 = 0;
        int trial3 = 0;
        int count = 0;
        int answer = 0;

        for(int i = 0; i < al.size(); i++){
            if(count == 0){
                if(i==0){
                    trial1 = Integer.parseInt(al.get(i));
                }else if(i==1){
                    if(al.get(i).equals("D")){
                        trial1 = (int) Math.pow(trial1, 2);
                    }else if(al.get(i).equals("T")){
                        trial1 = (int) Math.pow(trial1, 3);
                    }
                    if(Character.isDigit(al.get(i+1).charAt(0))){
                        count++;
                    }
                }else if(i==2){
                    if(al.get(i).equals("*")){
                        trial1 = trial1 * 2;
                    }else if(al.get(i).equals("#")){
                        trial1 = -trial1;
                    }
                    count++;
                }

            }else if(count == 1){
                if(Character.isDigit(al.get(i).charAt(0))){
                    trial2 = Integer.parseInt(al.get(i));
                }else if(al.get(i).equals("S") || al.get(i).equals("D") || al.get(i).equals("T")){
                    if(al.get(i).equals("D")){
                        trial2 = (int) Math.pow(trial2, 2);
                    }else if(al.get(i).equals("T")){
                        trial2 = (int) Math.pow(trial2, 3);
                    }

                    if(Character.isDigit(al.get(i+1).charAt(0))){
                        count++;
                    }
                }else if(al.get(i).equals("*") || al.get(i).equals("#")){
                    if(al.get(i).equals("*")){
                        trial2 = trial2 * 2;
                        trial1 = trial1 * 2;
                    }else if(al.get(i).equals("#")){
                        trial2 = -trial2;
                    }
                    count++;
                }
            }else if(count == 2){
                if(Character.isDigit(al.get(i).charAt(0))){
                    trial3 = Integer.parseInt(al.get(i));
                }else if(al.get(i).equals("S") || al.get(i).equals("D") || al.get(i).equals("T")){
                    if(al.get(i).equals("D")){
                        trial3 = (int) Math.pow(trial3, 2);
                    }else if(al.get(i).equals("T")){
                        trial3 = (int) Math.pow(trial3, 3);
                    }
                    if(i+1< al.size()) {
                        if (Character.isDigit(al.get(i + 1).charAt(0))) {
                            break;
                        }
                    }
                }else if(al.get(i).equals("*") || al.get(i).equals("#")){
                    if(al.get(i).equals("*")){
                        trial3 = trial3 * 2;
                        trial2 = trial2 * 2;
                    }else if(al.get(i).equals("#")){
                        trial3 = -trial3;
                    }
                    break;
                }
            }
        }

        answer = trial1 + trial2 + trial3;
        return answer;
    }

}
