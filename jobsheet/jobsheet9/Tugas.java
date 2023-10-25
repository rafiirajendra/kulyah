package jobsheet9;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen: ");
        int jmlElemen = sc.nextInt();

        int[] nilai = new int[jmlElemen];

        for (int i = 0; i < jmlElemen; i++){
            System.out.print("Masukkan elemen ke-"+(i+1)+" : ");
            nilai[i] = sc.nextInt();
        }
        
        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];
        int rataRata = nilai[0];
        
        for (int i = 0; i < jmlElemen; i++){
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
            rataRata += nilai[i];
        }
        double rata = rataRata / jmlElemen;
        
        System.out.println("Nilai tertinggi: "+nilaiTertinggi);
        System.out.println("Nilai terendah: "+nilaiTerendah);
        System.out.println("Rata-rata: "+rata);
    }   
    
    

}
