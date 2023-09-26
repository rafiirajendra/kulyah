import java.util.Scanner;

public class PemilihanPercobaan120 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        System.out.println("Masukkan angka:  ");
        int angka = input20.nextInt();
        if (angka % 2 == 0)
            System.out.println("Angka "+angka+" bilangan genap");
        else
            System.out.println("Angka "+angka+" bilangan ganjil");

        
        
    }

    
}