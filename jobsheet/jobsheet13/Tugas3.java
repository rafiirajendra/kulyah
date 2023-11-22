package jobsheet13;

import java.util.Scanner;

public class Tugas3 {
    public static Scanner scanner = new Scanner(System.in);
    public static int[][] nilaiMahasiswa;
    public static String[] namaMahasiswa;

    public static void main(String[] args) {
        inputDataMahasiswa();
        tampilkanNilaiMahasiswa();
        int hariNilaiTertinggi = cariHariNilaiTertinggi();
        System.out.println("Nilai tertinggi ditemukan pada tugas ke-" + hariNilaiTertinggi);
        tampilkanMahasiswaNilaiTertinggi();
    }
    
    public static void inputDataMahasiswa() {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah Tugas: ");
        int jumlahTugas = sc.nextInt();
    
        sc.nextLine(); // Membersihkan karakter newline setelah nextInt() sebelum memasukkan string.
    
        namaMahasiswa = new String[jumlahMahasiswa];
        nilaiMahasiswa = new int[jumlahMahasiswa][jumlahTugas];
    
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = sc.nextLine();
        }
    
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan nilai mahasiswa " + namaMahasiswa[i] + ":");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Tugas ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = sc.nextInt();
            }
            sc.nextLine(); // Membersihkan karakter newline setelah nextInt().
        }
        sc.close(); 
    }
    
    public static void tampilkanNilaiMahasiswa() {
        System.out.println("Rekap nilai mahasiswa:");
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.print("Mahasiswa " + namaMahasiswa[i] + ": ");
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int cariHariNilaiTertinggi() {
        int[] nilaiTotalPerHari = new int[nilaiMahasiswa[0].length];

        for (int j = 0; j < nilaiMahasiswa[0].length; j++) {
            int totalHari = 0;
            for (int i = 0; i < namaMahasiswa.length; i++) {
                totalHari += nilaiMahasiswa[i][j];
            }
            nilaiTotalPerHari[j] = totalHari;
        }
        int hariNilaiTertinggi = 0;
        int nilaiTertinggi = nilaiTotalPerHari[0];

        for (int j = 1; j < nilaiMahasiswa[0].length; j++) {
            if (nilaiTotalPerHari[j] > nilaiTertinggi) {
                nilaiTertinggi = nilaiTotalPerHari[j];
                hariNilaiTertinggi = j;
            }
        }
        return hariNilaiTertinggi + 1;
    }

    public static void tampilkanMahasiswaNilaiTertinggi() {
        int hariNilaiTertinggi = cariHariNilaiTertinggi();
        System.out.println("Mahasiswa dengan nilai tertinggi pada tugas ke-" + hariNilaiTertinggi + ":");
        int nilaiTertinggi = -1;
        int mahasiswaTertinggi = -1;

        for (int i = 0; i < namaMahasiswa.length; i++) {
            if (nilaiMahasiswa[i][hariNilaiTertinggi - 1] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i][hariNilaiTertinggi - 1];
                mahasiswaTertinggi = i;
            }
        }
        System.out.println("Mahasiswa " + namaMahasiswa[mahasiswaTertinggi] + " dengan nilai " + nilaiTertinggi + " pada tugas ke-" + hariNilaiTertinggi);
    }
}