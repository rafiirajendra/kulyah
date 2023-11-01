package jobsheet10;

import java.util.Scanner;

public class BioskopWithScanner19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris;
        int kolom;
        String nama;
        String next;
       

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Pilih Menu");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih Menu 1/2/3: ");
            int pilihMenu = sc.nextInt();

            switch (pilihMenu) {
                case 1:
                do {
                    System.out.print("Masukkan nama: ");
                    nama = sc.next();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris > 0 && baris <= 4 && kolom > 0 && kolom <=2) {
                        if (penonton[baris-1][kolom-1] == null) {
                            penonton[baris-1][kolom-1] = nama;
                        } else {
                            System.out.println("Kursi baris " + baris + ", kolom " + kolom + " sudah terisi");
                            System.out.println("Silahkan pilih baris & kolom yang lain");
                        }
                    }

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
                } while (next.equalsIgnoreCase("y"));
                break;
                case 2:
                    System.out.println("Daftar penonton");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            } else {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Terima Kasih!");
                    System.exit(0);
                default:
                    System.out.println("Tidak valid. Silahkan pilih menu yang benar!");
                    break;
            }
        }
    }
}
