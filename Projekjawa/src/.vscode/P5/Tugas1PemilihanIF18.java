package P5;
import java.util.Scanner;

public class Tugas1PemilihanIF18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false) ");
        boolean uktLunas = sc.nextBoolean();
        String pesan = uktLunas
              ? "Pemabayaran UKT sudah Lunas, silakan meminta tanda tangan DPA"
              : "UKT belum lunas, silakan melunasi UKT terlebih dahulu";
            System.out.println(pesan);
    
    sc.close();    }
}
