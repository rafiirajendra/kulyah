import java.util.Scanner;

public class PemilihanPercobaan219 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        System.out.print("Nilai uas   : ");
        float uas = input19.nextFloat();
        System.out.print("Nilai uts   : ");
        float uts = input19.nextFloat();
        System.out.print("Nilai kuis  : ");
        float kuis = input19.nextFloat();
        System.out.print("Nilai tugas : ");
        float tugas = input19.nextFloat();

        input19.close();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak remidi";

        if(total>80&&total<=100){
            System.out.println("Nilai akhir= " +total+ " sehingga " +message);
            System.out.println("Nilai huruf = A (Sangat Baik)");
        }else if (total>73&&total>= 80){
            System.out.println("Nilai akhir " +total+ " sehingga " +message);
            System.out.println("Nilai huruf = B (Lebih dari baik)");
        }else if (total>60&&total>=73){
            System.out.println("Nilai akhir " +total+ " sehingga " +message);Z
            System.out.println("Nilai huruf = B (Baik)");
        }else if (total>60&&total>= 65){
            System.out.println("Nilai akhir " +total+ " sehingga " +message);
            System.out.println("Nilai Huruf = C+ (Lebih dari cukup)");
        }else if (total>50&&total>= 60){
            System.out.println("Nilai akhir " +total+ " sehingga " +message);
            System.out.println("Nilai Huruf = C (Cukup)");
        }else if (total>39&&total>= 50){
            System.out.println("Nilai akhir " +total+ " sehingga " + message);
            System.out.println("Nilai huruf = D (Kurang)");
        }else if (total<=39){
            System.out.println("Nilai akhir " +total+ " sehingga " +message);
            System.out.println("Nilai huruf = E (Gagal)");
        }
    }

    
}