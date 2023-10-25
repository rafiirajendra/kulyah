package jobsheet9;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = sc.nextInt();
        
        int[] arrayInt = new int[jumlah];
        
        for(int i = 0; i < jumlah; i++){
            System.out.print("Masukkan elemen array ke-"+i+" : ");
            arrayInt[i] = sc.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        int key = sc.nextInt();

        int hasil = 0;

        for (int i = 0; i < arrayInt.length; i++){
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        if (hasil != 0) {
            System.out.println("Key ada di posisi indeks ke-"+hasil);
        } else{
            System.out.println("Key tidak ditemukan");
        }

    }
    
}