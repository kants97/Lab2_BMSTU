package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int [][] A = new int [n][n];
        float [][] Af = new float [n][n];
        Random r = new Random();
        int x = n - (-n);
        float ar = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = r.nextInt(x + 1);
                A[i][j] += (-n);
                System.out.print(A[i][j] + "\t");
                ar = ar + A[i][j];
            }
            System.out.println();
        }
        ar = ar / (n*n);
        System.out.println(ar);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Af[i][j] =  A[i][j] - ar;
                System.out.print(Af[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
