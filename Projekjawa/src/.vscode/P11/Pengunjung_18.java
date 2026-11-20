import java.util.Scanner;

public class Pengunjung_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahPengunjung, berkembang = -1, tidakBerkembang = 1000, jumlahToko = 0, jumlahBerkembang = 0, jumlahTidakBerkembang = 0, i = 1, jumlahTokoBerkembang = 0, jumlahTokoTidakBerkembang=0;
        String namaToko, lanjut;  

        do {
            System.out.print("Nama toko : ");
            namaToko = sc.nextLine();
            jumlahToko++;
            i=1;
            jumlahTokoBerkembang=0;
            jumlahTokoTidakBerkembang=0;

            do {
                System.out.print("Pengunjung hari ke-" + i + " : ");
                jumlahPengunjung = sc.nextInt();
                if (jumlahPengunjung < 0) {
                    System.out.println("Data tidak valid, ulangi!");
                    i--;
                    continue;
                }
                if (jumlahPengunjung > berkembang) {
                    berkembang = jumlahPengunjung;
                    jumlahBerkembang++;
                    jumlahTokoBerkembang++;
                }
                if (jumlahPengunjung < tidakBerkembang) {
                    tidakBerkembang = jumlahPengunjung;
                    jumlahTidakBerkembang++;
                    jumlahTokoTidakBerkembang++;
                }
                i++;
            } while (i<6);
                System.out.println("Hari naik : " + (jumlahBerkembang-1));
                if (jumlahBerkembang >= 4) {
                    System.out.println("Status : Berkembang");
                } else{
                    System.out.println("Status : Tidak Berkembang");
                }
            System.out.print("Tambah toko (y/t) ? ");
                lanjut = sc.nextLine();
                sc.nextLine();
                
                System.out.println();

        } while (lanjut.equalsIgnoreCase("t"));
        System.out.println("Jumlah Toko : " + jumlahToko);
        System.out.println("Jumlah berkembang : " + (jumlahTokoBerkembang-1));
        System.out.println("Jumlah tidak berkembang : " + (jumlahTokoTidakBerkembang-1));

        sc.close();
    }
}
