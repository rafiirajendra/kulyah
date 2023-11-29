package jobsheet14;

import java.util.Scanner;

public class Tugas1 {
    static int DeretDescendingRekursif(int n) {
        if (n >= 0){
            System.out.print(n + " ");
            DeretDescendingRekursif(n-1);
        }
        return n;
    }
    static void DeretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan n: ");
        int n = sc.nextInt();
        
        System.out.println("Deret Descunding Rekursif: ");
        DeretDescendingRekursif(n);
        System.out.println("\nDeret Descunding Iteratif: ");
        DeretDescendingIteratif(n);
    }
}
