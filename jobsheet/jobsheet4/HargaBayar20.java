import java.util.Scanner;

public class HargaBayar20 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int harga, jumlah;
        double total, bayar, jmlDis, dis;

        System.out.println("Masukkan merk buku yang dibeli");
        input.next().charAt(0);
        System.out.println("Masukkan jumlah halaman buku");
        input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli");
        jumlah=input.nextInt();
        System.out.println("Masukkan Diskon yang anda dapatkan");
        dis=input.nextDouble();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);

    }
    
}