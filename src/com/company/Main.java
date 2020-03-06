package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String max, min; //длииная строк

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        String s = scan.nextLine();
        min = s;
        max = min;
        n--;

        while (n>0) {
            s = scan.nextLine();
            if (s.length()>max.length()) {
                max = s;
                //maxl = s.length();
            }
            if (s.length()<min.length()) {
                min = s;
                //minl = s.length();
            }
            n--;
        }

        System.out.println(min + " " + min.length());
        System.out.println(max + " " + max.length());

    }
}
