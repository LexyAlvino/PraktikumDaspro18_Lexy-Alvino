import java.util.Scanner;
public class StudiKasus3Modifikasi_18 { 
    public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    
    int lebar_tanah, panjang_tanah, diameter, panjang_sisi_persegi, luas_tanah;
    double jari_jari, phi = 3.14, luas_kolam_lingkaran, luas_taman_persegi, luas_tanah_tidak_digunakan;
    
    System.out.println ("Masukkan diameter : ");
    diameter = input.nextInt();
    System.out.println("panjang tanah : ");
    panjang_tanah = input.nextInt();
    System.out.println("lebar tanah : ");
    lebar_tanah = input.nextInt();
    System.out.println("Masukkan panjang sisi persegi : ");
    panjang_sisi_persegi = input.nextInt();

    jari_jari = diameter / 2.0;
    luas_tanah = lebar_tanah * panjang_tanah;
    luas_kolam_lingkaran = phi * jari_jari * jari_jari;
    luas_taman_persegi = panjang_sisi_persegi * panjang_sisi_persegi;
    luas_tanah_tidak_digunakan = luas_tanah - (luas_kolam_lingkaran + luas_taman_persegi);


    System.out.println("Luas tanah Pak Tono adalah " + luas_tanah);
    System.out.println("Luas kolam lingkaran Pak Tono adalah " + luas_kolam_lingkaran);
    System.out.println("Luas taman persegi Pak Tono adalah " + luas_taman_persegi);
    System.out.println("Luas tanah Pak Tono yang tidak digunakan adalah " + luas_tanah_tidak_digunakan);

    input.close();
    }
}