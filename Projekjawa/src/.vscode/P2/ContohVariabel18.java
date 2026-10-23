public class ContohVariabel18 {
    public static void main(String[] args) {
        String salahSatuHobiSayaAdalah = "bermain petak umpet";
        boolean isPandai = true;
        char JenisKelamin = 'L';
        byte umurSayaSekarang = 20;
        double ipk = 3.24, tinggi = 1.78;
        System.out.println("salahSatuHobiSayaAdalah: " + salahSatuHobiSayaAdalah);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis Kelamin: " + JenisKelamin);
        System.out.println("Umurku saat ini: " + umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}