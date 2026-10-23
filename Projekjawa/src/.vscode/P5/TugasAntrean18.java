package P5;
import java.util.Scanner;

public class TugasAntrean18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kode : ");
        int kode = sc.nextInt();

        switch (kode) {
            case 1:
                System.out.println("Legalisir ijazah");
                System.out.println("Loket A");
                break;
            case 2:
                System.out.println("SUrat Keterangan Aktif Kuliah");
                System.out.println("Loket B");
                break;
            case 3:
                System.out.println("Pembayaran UKT");
                System.out.println("Loket C");
                break;
            case 4:
                System.out.println("Pengajuan Cuti Akademik");
                System.out.println("Loket D");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
                break;
        }
        sc.close();
    }
}
