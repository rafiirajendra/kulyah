import java.util.Scanner;

public class PemilihanPercobaan120 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        System.out.print("Masukkan angka:  ");
        int angka = input20.nextInt();
        String status = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + " bilangan " + status);
          
    }

    
}