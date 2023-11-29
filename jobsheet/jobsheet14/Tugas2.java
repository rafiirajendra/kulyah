package jobsheet14;

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
        int f = 8;
        System.out.println("Hasil penjumlahan dari 1 sampai " + f + " adalah : ");
        int hasil = penjumlahanRekursif(f);
        System.out.print(" = " + hasil);
    }
}
