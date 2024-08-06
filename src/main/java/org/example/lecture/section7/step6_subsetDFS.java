package org.example.lecture.section7;

import java.util.Scanner;

public class step6_subsetDFS {

    private static int n;
    private static boolean[] check;

    public static void DFS(int v){
        if(v == n+1){
            for(int i = 1; i < check.length; i++){
                if(check[i]){
                    System.out.print(i + " " );
                }
            }
            System.out.println();
        }else {
            check[v] = true;
            DFS(v+1);
            check[v] = false;
            DFS(v+1);
         }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();
        check = new boolean[n+1];
        DFS(1);


    }


}
