//toko = (2 + (18 mod 3)) = 2 

import java.util.Scanner;

public class Tugas3_Jobsheet8_18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int toko, pelanggan = 0, barang = 0, totalPerToko = 0, totalSemuaBarang = 0, tertinggi = 0, tokoTerbanyak = 0; 

        System.out.print("Masukkan jumlah toko : ");
        toko = sc.nextInt();

        if (toko < 1) {
            System.out.println("Jumlah toko minimal 1");
            return;
        }
        for (int i = 1; i <= toko; i++) {
            System.out.print("Total pelanggan di Toko " + i + " : ");
            pelanggan = sc.nextInt();

            if (pelanggan < 0) {
                System.out.println("Jumlah pelanggan tidak boleh negatif");
            }
            totalPerToko = 0;
            for (int j = 1; j <= pelanggan; j++) {
                System.out.print("Jumlah barang yang dibeli pelanggan " + j + " : ");
                barang = sc.nextInt();
                if (barang < 0) {
                    System.out.println("Jumlah barang tidak boleh negatif");
                }
                totalPerToko += barang;
                totalSemuaBarang += totalPerToko;

                if (tertinggi < totalPerToko) {
                    tertinggi = totalPerToko;
                    tokoTerbanyak = toko;
                } 
            }
            System.out.println("Total Barang : " + totalPerToko);
            System.out.println();
        }
        System.out.println("Total semua barang : " + totalSemuaBarang);
        System.out.println("Toko  dengan jumlah barang terbanyak : " + tokoTerbanyak);
        System.out.println("Jumlah barang terjual terbanyak : " + tertinggi);

        sc.close();
    }
}