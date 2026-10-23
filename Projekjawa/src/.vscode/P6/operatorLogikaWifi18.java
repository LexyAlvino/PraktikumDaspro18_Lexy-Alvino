import java.util.Scanner;

public class operatorLogikaWifi18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswa, dosen, akunDiBlokir;

        System.out.print("Apakah pengguna seorang mahassiwa? (True/False) : ");
        mahasiswa = sc.nextBoolean(); 

        System.out.print("Apakah pengguna seorang dosen? (True/False) : ");
        dosen = sc.nextBoolean();

        System.out.print("Apakah akun sedang diblokir? (True/False) : ");
        akunDiBlokir = sc.nextBoolean();

        if ((mahasiswa && dosen) && !akunDiBlokir) {
            System.out.println("Akses wifi diberikan");
        } else {
            System.out.println("Akses wifi ditolak");
        }
    sc.close();
    }
}