package jobsheet14;

import java.util.Scanner;

public class Tugas3 {
    public static boolean CekPrimaRekursif(int n, int i) {
        if (n < 2)
            return false;
        if (i * i > n)
            return true;
        if (n % i == 0)
            return false;
        return CekPrimaRekursif(n, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int angkaCek = sc.nextInt(); 
        if (CekPrimaRekursif(angkaCek, 2))
            System.out.println(angkaCek + " adalah bilangan prima");
        else
            System.out.println(angkaCek + " bukan bilangan prima");
    }
}
