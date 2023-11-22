package jobsheet13;

import java.util.Scanner;

public class Tugas2 {
    public static Scanner scanner = new Scanner(System.in);
    public static int[][] nilaiMahasiswa;
    public static String[] namaMahasiswa;

    public static void main(String[] args) {
        inputDataMahasiswa();
        tampilkanNilaiMahasiswa();
        int hariNilaiTertinggi = cariHariNilaiTertinggi();
        System.out.println("Nilai tertinggi ditemukan pada hari ke-" + hariNilaiTertinggi);
        tampilkanMahasiswaNilaiTertinggi();
    }
    
    public static void inputDataMahasiswa() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine();
        
        String[] namaMahasiswa = new String[jumlahMahasiswa];
        int[][] nilaiMahasiswa = new int[jumlahMahasiswa][7]; 
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.nextLine();
            
            System.out.println("Masukkan nilai mahasiswa " + namaMahasiswa[i] + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
            scanner.nextLine();
        }
    }
    

    public static void tampilkanNilaiMahasiswa() {
        System.out.println("Rekap nilai mahasiswa dari minggu pertama hingga ketujuh:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Mahasiswa " + namaMahasiswa[i] + ": ");
            for (int j = 0; j < 7; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int cariHariNilaiTertinggi() {
        int[] nilaiTotalPerHari = new int[7];

        for (int j = 0; j < 7; j++) {
            int totalHari = 0;
            for (int i = 0; i < 5; i++) {
                totalHari += nilaiMahasiswa[i][j];
            }
            nilaiTotalPerHari[j] = totalHari;
        }

        int hariNilaiTertinggi = 0;
        int nilaiTertinggi = nilaiTotalPerHari[0];

        for (int j = 1; j < 7; j++) {
            if (nilaiTotalPerHari[j] > nilaiTertinggi) {
                nilaiTertinggi = nilaiTotalPerHari[j];
                hariNilaiTertinggi = j;
            }
        }

        return hariNilaiTertinggi + 1; // Karena hari dimulai dari 1, bukan indeks 0
    }

    public static void tampilkanMahasiswaNilaiTertinggi() {
        int hariNilaiTertinggi = cariHariNilaiTertinggi();
        System.out.println("Mahasiswa dengan nilai tertinggi pada hari ke-" + hariNilaiTertinggi + ":");
        int nilaiTertinggi = -1;
        int mahasiswaTertinggi = -1;

        for (int i = 0; i < 5; i++) {
            if (nilaiMahasiswa[i][hariNilaiTertinggi - 1] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i][hariNilaiTertinggi - 1];
                mahasiswaTertinggi = i;
            }
        }

        System.out.println("Mahasiswa " + namaMahasiswa[mahasiswaTertinggi] + " dengan nilai " + nilaiTertinggi + " pada minggu ke-" + hariNilaiTertinggi);
    }
}