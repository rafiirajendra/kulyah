package jobsheet11;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 3) : ");
        int N = sc.nextInt();

        int i = 0;

        for (i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i  == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N + " ");
                } else {
                    if (N >= 10) {
                        System.out.print(" ");
                    }
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
