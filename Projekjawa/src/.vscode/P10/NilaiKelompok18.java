// jumlahKelompok = (2 + (18 mod 3)) = 2 
// jumlahPenilai = (3 + (18 mod 2)) = 3

import java.util.Scanner;

public class NilaiKelompok18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kelompok : ");
        int jumlahKelompok = sc.nextInt();
        System.out.print("Masukkan jumlah penilai : ");
        int jumlahPenilai = sc.nextInt();

        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus > 0.");
        } else {
            int nomorKelompok = 1;
            double rataTertinggi = -1;
            int kelompokTerbaik = 0;

            while (nomorKelompok <= jumlahKelompok) {
                System.out.println("Kelompok " + nomorKelompok);
                    double totalNilai = 0;
                for (int i = 1; i <= jumlahPenilai; i++) {
                    int nilai;
                    do {
                        System.out.println("Nilai dari penilai " + i + " : ");
                        nilai = sc.nextInt();
                        if (nilai <0 || nilai > 100) {
                            System.out.println("nilai harus 0-100, ulangi");
                        }
                    } while (totalNilai <= nilai);
                        totalNilai += nilai;
                }
                nomorKelompok++;
                double rataNilai = totalNilai / jumlahPenilai;
                System.out.println("Kelompok " + nomorKelompok + " : nilai rata-rata = " + rataNilai);

                if (rataNilai > rataTertinggi) {
                    rataTertinggi = rataNilai;
                    kelompokTerbaik = nomorKelompok;
            }
                
            }
            System.out.println("==========================");
            System.out.println("Kelompok terbaik : " + kelompokTerbaik);
            System.out.println("Rata-rata tertinggi : " + rataTertinggi);
        }
            

            sc.close();
    }
}