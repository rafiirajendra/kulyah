package jobsheet11;

import java.util.Scanner;

public class NestedLoop_2341720158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) { 
            System.out.println("Kota ke-" + i); 
            double total = 0; // Deklarasikan variabel total di sini
            for (int j = 0; j < temps[0].length; j++) { 
                System.out.print("Hari ke-" + (j + 1) + ": "); 
                temps[i][j] = scanner.nextDouble();
                total += temps[i][j]; // Akumulasi total suhu harian
            } 
            double rata = total / temps[i].length; // Hitung rata-rata
            System.out.println("Rata-rata " + rata); // Cetak rata-rata
            System.out.println(); 
        }
        
        // Menampilkan array menggunakan foreach
        for (int i = 0; i < temps.length; i++) { 
            System.out.print("Kota ke-" + (i + 1) + ": "); 
            for (double temperature : temps[i]) {
                System.out.print(temperature + " ");
            }
            System.out.println(); 
        }
    }
}
