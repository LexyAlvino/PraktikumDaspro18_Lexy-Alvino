import java.util.Scanner;
public class StudiKasus1Modifikasi_18 {
    
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        int gaji_pokok, jumlah_anak, tunjangan_anak, total_tunjangan_anak;
        double prosentase_bunga = 0.1, potongan, gaji_bersih;

        System.out.println("Masukkan gaji pokok :");
        gaji_pokok = input.nextInt();
        System.out.println("Masukkan tunjangan anak :");
        tunjangan_anak = input.nextInt();
        System.out.println("Masukkan jumlah anak :");
        jumlah_anak = input.nextInt();

        potongan = gaji_pokok * prosentase_bunga;
        total_tunjangan_anak = jumlah_anak * tunjangan_anak;
        gaji_bersih = gaji_pokok - potongan + total_tunjangan_anak;

        System.out.println("Total potongan untuk simpanan wajib dana pensiun sebesar Rp " + potongan);
        System.out.println("Total tunjangan anak sebesar Rp " + total_tunjangan_anak);
        System.out.println("Gaji bersih sebesar Rp " + gaji_bersih);

        input.close();
    }
}
