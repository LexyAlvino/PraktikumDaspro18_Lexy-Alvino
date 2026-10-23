public class StudiKasus3_18 {
    public static void main(String []args) {
       int lebar_tanah=30;
       int panjang_tanah=100;
       int diameter_kolam=5;
       int panjang_sisi_persegi=2;
       double luas_tanah;
       double luas_kolam_lingkaran;
       double luas_kolam_persegi;
       double luas_tanah_tidak_digunakan;
       double phi= 3.14; 
       double jari_jari= 2.5;

       luas_tanah = lebar_tanah * panjang_tanah;
       luas_kolam_lingkaran = phi * jari_jari * jari_jari;
       luas_kolam_persegi = panjang_sisi_persegi * panjang_sisi_persegi;
       luas_tanah_tidak_digunakan = luas_tanah - (luas_kolam_lingkaran + luas_kolam_persegi);

       System.out.println("Luas tanah Pak Tono adalah " + luas_tanah);
       System.out.println("Luas kolam lingkaran Pak Tono adalah " + luas_kolam_lingkaran);
       System.out.println("Luas kolam persegi Pak Tono adalah " + luas_kolam_persegi);
       System.out.println("Luas tanah Pak Tono yang tidak digunakan adalah " + luas_tanah_tidak_digunakan);
    }
}
