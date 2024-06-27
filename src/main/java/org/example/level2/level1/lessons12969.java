package org.example.level2.level1;

import java.util.Scanner;

public class lessons12969 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder row = new StringBuilder();
        for (int i = 0; i < a; i++) {
            row.append("*");
        }
        for (int i = 0; i < b; i++) {
            System.out.println(row);
        }
    }


}
