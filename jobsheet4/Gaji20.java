import java.util.Scanner;

public class Gaji20 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int jmlMasuk, JmlTdkMsk, TotGaji;
        int gaji=40000, potGaji=25000;
        System.out.println("Masukkan Jumlah Hari Masuk Keja Anda");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Anda");
        JmlTdkMsk=input.nextInt();
        TotGaji=(jmlMasuk*gaji)-(JmlTdkMsk*potGaji);
        System.out.println("Gaji yang anda terima adalah " +TotGaji);
        

    }
    
}