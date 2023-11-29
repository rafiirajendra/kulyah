package jobsheet14;

import java.util.Scanner;

public class Tugas2 {
    public static int penjumlahanRekursif(int n) {
        if (n <= 1) {
            System.out.print(n);
            return n;
        } else {
            int result = penjumlahanRekursif(n - 1);
            System.out.print("+" + n);
            return n + result;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan yang ingin di hitung: ");
        int f = sc.nextInt();
        System.out.println("Hasil penjumlahan dari 1 sampai " + f + " adalah : ");
        int hasil = penjumlahanRekursif(f);
        System.out.print(" = " + hasil);
    }
}
