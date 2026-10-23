//nomer absen=18, 4R=4000, 5R=6000, 10R=16000,B=15, S=55
package P8;

import java.util.Scanner;

 public class CetakFoto18 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    int kode, harga, jumlahLembar, biayaDasar = 0, B, S;
    boolean layananKilat;
    double tambahan = 0, totalBayar = 0;
    
    System.out.println("===Selamat Datang di Layanan Fotocopy===");
    System.out.println("Masukkan kode ukuran Foto(1=4R/2=5R/3=10R : ");
    kode = sc.nextInt();
    System.out.println("Masukkan jumlah lembar nya (1-100) : ");
    jumlahLembar = sc.nextInt();
    System.out.println("Apakah anda ingin memakai layanan kilat? (true/false) : ");
    layananKilat = sc.nextBoolean();

    switch (kode) {
        case 1:
            harga = 3000 + (18%4) * 500;

            if (layananKilat == true) {
                if (jumlahLembar >= 0 && jumlahLembar <= 155) {
                    B = 15+(18%6);
                biayaDasar = harga * jumlahLembar - (jumlahLembar - B) * 500;
                    tambahan = biayaDasar * 0.25;
                    totalBayar= biayaDasar + tambahan;
                } else {   
                }
            } else if(layananKilat == false){
                if (jumlahLembar >= 0 && jumlahLembar <= 100) {
                    B = 15+(18%6);
                biayaDasar = harga * jumlahLembar - (jumlahLembar - B) * 500;
                    totalBayar= biayaDasar;
                } else {   
                }
            } else {
                System.out.println("input tidak valid");
            }
            break;
        case 2 :
            harga = 5000 + (18%4) * 500;
            if (layananKilat == true) {
                if (jumlahLembar >= 0 && jumlahLembar <= 155) {
                    B = 15+(18%6);
                biayaDasar = harga * jumlahLembar - (jumlahLembar - B) * 500;
                    tambahan = biayaDasar * 0.25;
                    totalBayar= biayaDasar + tambahan;
                } else {   
                }
            } else if(layananKilat == false){
                if (jumlahLembar >= 0 && jumlahLembar <= 100) {
                    B = 15+(18%6);
                biayaDasar = harga * jumlahLembar - (jumlahLembar - B) * 500;
                    totalBayar= biayaDasar + tambahan;
                } else {   
                }
            } else {
                System.out.println("input tidak valid");
            }
                break;
        case 3 :
            harga = 15000 + (18%4)*500;
            if (layananKilat == true) {
                if (jumlahLembar >= 0 && jumlahLembar <= 155) {
                    B = 15+(18%6);
                biayaDasar = harga * jumlahLembar - (jumlahLembar - B) * 500;
                    tambahan = biayaDasar * 0.25;
                    totalBayar= biayaDasar + tambahan;
                } else {   
                }
            } else if(layananKilat == false){
                if (jumlahLembar >= 0 && jumlahLembar <= 100) {
                    B = 15+(18%6);
                biayaDasar = harga * jumlahLembar - (jumlahLembar - B) * 500;
                    totalBayar= biayaDasar + tambahan;
                } else {   
                }
            } else {
                System.out.println("input tidak valid");
            }
                break;
        default:
            break;
    }
        System.out.println("biaya dasar : " + biayaDasar);
        System.out.println("Besar tambahan : " + tambahan);
        System.out.println("Total bayar : " + totalBayar);
    }
 }

// ===Selamat Datang di Layanan Fotocopy===
// Masukkan kode ukuran Foto(1=4R/2=5R/3=10R : 
// 1
// Masukkan jumlah lembar nya (1-100) : 
// 100
// Apakah anda ingin memakai layanan kilat? (true/false) : 
// true
// biaya dasar : 357500
// Besar tambahan : 89375.0
// Total bayar : 446875.0