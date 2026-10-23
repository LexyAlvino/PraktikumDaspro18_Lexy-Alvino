import java.util.Scanner;

public class StudiKasus1_18_P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaLaptop;
        int uangMuka;
        int sisaHarga;
        int bulan;
        double totalBunga;
        double bunga = 0.2;
        double totalCicilan;
        double jumlahCicilanPerBulan;
    
    System.out.println("Masukkan harga laptop : ");
    hargaLaptop = sc.nextInt();
    System.out.println("Masukkan uang muka : ");
    uangMuka = sc.nextInt();    
    System.out.println("Masukkan jumlah bulan cicilan : ");
    bulan = sc.nextInt();
    sisaHarga = hargaLaptop - uangMuka;
    totalBunga = sisaHarga * bunga;
    totalCicilan = sisaHarga + totalBunga;
    jumlahCicilanPerBulan = totalCicilan / bulan;

    System.out.println("Total bunga adalah " + totalBunga);
    System.out.println("Jumlah cicilan per bulan adalah " + jumlahCicilanPerBulan);

    sc.close();
    }
}
