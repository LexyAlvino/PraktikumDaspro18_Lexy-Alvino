import java.util.Scanner;

public class Tugas1MenghitungDiskon18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jenis;
        int jumlahBuku;
        double diskon;

        System.out.print("Masukkan jenis buku : ");
        jenis = sc.nextLine();
        System.out.print("Masukkan jumlah buku : ");
        jumlahBuku = sc.nextInt();

        if (jenis.equalsIgnoreCase("kamus") ) {
            diskon = 11;
            if (jumlahBuku > 2) {
            diskon += 2;
            }
        } else if (jenis.equalsIgnoreCase("novel")) {
            diskon = 7;
            if (jumlahBuku > 3) {
                diskon += 2;
            } else {
                diskon += 1;
            }
        } else {
            diskon = 0;
            if (jumlahBuku > 3) {
                diskon += 5;
            }
        }
        System.out.println("Total diskon : " + diskon + "%");
    sc.close();
    }
}
