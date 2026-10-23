import java.util.Scanner;
import java.util.Locale;

public class SiakadFor18_parameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        double lulus = 0, tidakLulus = 0, nilai, tertinggi = 0, terendah = 100;
        

        for (int i = 1; i <= (8+(18%5)); i++) {
            System.out.print("Masukkan nilai mahasiswa ke - " + i + " : ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            } 
            if (nilai < terendah){
                terendah  = nilai;
            }
            if (nilai >= (55+(18%11)) && nilai <= 100) {
                lulus++;
            } else if(nilai >= 0) {
                tidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah); 
        System.out.println("Yang lulus : " + lulus);
        System.out.println("Yang tidak lulus : " + tidakLulus);

        sc.close();
    }
}
