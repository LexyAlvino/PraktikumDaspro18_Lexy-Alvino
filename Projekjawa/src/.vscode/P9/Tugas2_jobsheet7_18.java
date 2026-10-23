import java.util.Scanner;

public class Tugas2_jobsheet7_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total=0;

        do {
            System.out.println("Masukkan jenis kendaraan (1=mobil, 2=motor, 0=keluar) : ");
            jenis = sc.nextInt();
            if (jenis==1||jenis==2) {
                System.out.println("Masukkan durasi parkirnya(jam): ");
                durasi = sc.nextInt();
                if (jenis==1) {
                    total += durasi*(2500+(18%6));
                } else if (jenis==2) {
                    total += durasi*(1500+(18%6));
                }
            } else if (jenis != 0) {
                
            }
        } while (jenis != 0);
        System.out.println("Total bayar : " + total);
        System.out.println("Transaksi selesai");

        sc.close();
    }
}
