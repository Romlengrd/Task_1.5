package com.company;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Введите размер матрицы (целое положительное число) -");
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("Число не положительное");
                return;
            }
            sc.close();


            int[][] a = new int[n][n];
            int i;
            int j;
            for (i = 0; i < n; i++) {
                for (j=0;j<n;j++) {
                   if(i==j||j==n-1-i) {
                       a[i][j]=1;
                       }
                    System.out.print(a[i][j]+ "");
                }
                System.out.println();

            }
        }
        catch (InputMismatchException e) {
            System.out.println("Введено не корректное число/символ");
        }
    }
}
