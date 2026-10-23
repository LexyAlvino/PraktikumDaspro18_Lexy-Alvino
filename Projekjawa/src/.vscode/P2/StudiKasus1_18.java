public class StudiKasus1_18 {
    
    public static void main(String []args) {
          int gaji_pokok = 5000000;
          int jumlah_anak = 4;
          int tunjangan_anak = 100000;
          double prosentase_bunga = 0.1;
          double potongan;
          double total_tunjangan_anak;
          double gaji_bersih;

          potongan = gaji_pokok * prosentase_bunga;
          total_tunjangan_anak=jumlah_anak * tunjangan_anak;
          gaji_bersih=gaji_pokok - potongan + total_tunjangan_anak;

          System.out.println("Gaji bersih sebesar Rp." + gaji_bersih);
          System.out.println("Total tunjangan anak sebesar Rp." + total_tunjangan_anak);
          System.out.println("Total potongan untuk simpanan wajib dana pensiun sebesar Rp." + potongan);
    }
}
