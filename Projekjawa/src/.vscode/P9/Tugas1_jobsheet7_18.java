import java.util.Scanner;

public class Tugas1_jobsheet7_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = (40000 + (18%6)*2000), jumlahTiket = 0, totalHarga, totalTiket = 0, pembeli;
        double diskon = 0, totalBayar;
        
        System.out.print("Masukkan jumlah pembeli : ");
        pembeli = sc.nextInt();
        System.out.println(hargaTiket);
        for (int org = 0; org < pembeli ; org++) {
            System.out.print("Masukkan jumlah tiket pembeli ke - " +(org + 1) + " : ");
            jumlahTiket = sc.nextInt();
            
            if (jumlahTiket > 10) {
                diskon = 0.15;
                totalHarga = hargaTiket * jumlahTiket;
                totalBayar = totalHarga - (totalHarga*diskon);
                System.out.println(totalBayar);
            } else if (jumlahTiket > (3+(18%3))){
                //(8+(18%5))/100
                diskon = 0.11; 
                System.out.println(diskon);
                totalHarga = hargaTiket * jumlahTiket;
                totalBayar = totalHarga - (totalHarga*diskon);
                System.out.println(totalBayar);
            } else if (jumlahTiket <= 4 && jumlahTiket >= 0){
                diskon = 0;
                totalHarga = hargaTiket * jumlahTiket;
                totalBayar = totalHarga - (totalHarga*diskon);
                System.out.println(totalBayar);
            } else {
                System.out.println("Tidak valid, isi lagi");
                continue;
            }
            totalTiket += jumlahTiket;
        }
       
        totalHarga = hargaTiket * totalTiket;
        totalBayar = totalHarga - (totalHarga*diskon);

        System.out.println("Total tiket = " + totalTiket);
        System.out.println("Total penjualan = Rp. " + totalBayar);

    sc.close();
    }
}
