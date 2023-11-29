package jobsheet14;

public class Tugas4 {
    public static int jumlahPasanganMarmut(int bulan) {
        if (bulan <= 0) {
            return 0;
        } else if (bulan == 1 || bulan == 2) {
            return 1;
        } else {
            return jumlahPasanganMarmut(bulan - 1) + jumlahPasanganMarmut(bulan - 2);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            int jumlahPasangan = jumlahPasanganMarmut(i);
            System.out.println("Jumlah pasangan marmut pada bulan ke-" + i + ": " + jumlahPasangan);
        }
    }
}