import java.util.Scanner;

public class KafeDoWhile18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, kopi, teh, roti;
        double totalHarga;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar)   : ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("Masukkan jumlah kopi : ");
            kopi = sc.nextInt();
            System.out.print("Masukkan jumlah teh : ");
            teh = sc.nextInt();
            System.out.print("Masukkan jumlah roti : ");
            roti = sc.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harga yang dibayar : " + totalHarga);
            sc.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai");

        sc.close();
    }
}
