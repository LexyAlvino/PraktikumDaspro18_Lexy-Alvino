import java.util.Scanner;

public class BankSoal18 {
   public static void main(String[] args) {
    int jml_tabungan_awal, lama_tabungan;
    double presentase_bunga=0.02, bunga, jml_tabungan_akhir;
    Scanner input = new Scanner(System.in);
    System.out.println("masukkan jumlah tabungan awal anda : ");
    jml_tabungan_awal = input.nextInt();
    System.out.println("masukkan lama tabungan anda : ");
    lama_tabungan = input.nextInt();
    bunga = jml_tabungan_awal * presentase_bunga * lama_tabungan;
    jml_tabungan_akhir = jml_tabungan_awal + bunga;
    System.out.println("Bunga adalah" + bunga);
    System.out.println("Jumlah tabungan akhir adalah" + jml_tabungan_akhir);

    input.close();
   }


}