package org.example.free;


import java.util.*;
import java.util.stream.Collectors;


class Solution {

    public static void main(String[] args){
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";

        solution(data, ext, val_ext, sort_by);
    }

    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};

        ArrayList<int[]> answerList = new ArrayList<int[]>();

        ArrayList<int[]> dataList = new ArrayList<int[]>(Arrays.asList(data));

        // ext -> 어떤 정보를 기준으로 데이터를 뽑아낼지를 의미
        // val_ext -> 뽑아낼 정보의 기준값을 나타냄
        switch(ext){
            case "code":
                dataList = (ArrayList<int[]>) dataList.stream().filter(index -> (index[0] <= val_ext)).collect(Collectors.toList());
                break;
            case "date":
                dataList = (ArrayList<int[]>) dataList.stream().filter(index -> (index[1] <= val_ext)).collect(Collectors.toList());
                break;
            case "maximum":
                dataList = (ArrayList<int[]>) dataList.stream().filter(index -> (index[2] <= val_ext)).collect(Collectors.toList());
                break;
            case "remain":
                dataList = (ArrayList<int[]>) dataList.stream().filter(index -> (index[3] <= val_ext)).collect(Collectors.toList());
                break;
        }

        switch(sort_by){
            case "code":
                dataList = (ArrayList<int[]>) dataList.stream().sorted((a, b) -> Integer.compare(a[0], b[0])).collect(Collectors.toList());
                break;
            case "date":
                dataList = (ArrayList<int[]>) dataList.stream().sorted((a, b) -> Integer.compare(a[1], b[1])).collect(Collectors.toList());
                break;
            case "maximum":
                dataList = (ArrayList<int[]>) dataList.stream().sorted((a, b) -> Integer.compare(a[2], b[2])).collect(Collectors.toList());
                break;
            case "remain":
                dataList = (ArrayList<int[]>) dataList.stream().sorted((a, b) -> Integer.compare(a[3], b[3])).collect(Collectors.toList());
                break;
        }

        answer = dataList.toArray(new int[dataList.size()][]);

        return answer;
    }
}