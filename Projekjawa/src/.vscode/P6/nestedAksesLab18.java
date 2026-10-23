import java.util.Scanner;

public class nestedAksesLab18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswaAktif, sedangDisanksi, punyaIzinDosen, asistenLab;
        
        System.out.print("Apakah anda seorang mahassiwa aktif? (True/False) : ");
        mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah anda sedang disanksi? (True/False) : ");
        sedangDisanksi = sc.nextBoolean();
        System.out.print("Apakah anda mempunyai izin dari dosen? (True/False) : ");
        punyaIzinDosen = sc.nextBoolean();
        System.out.print("Apakah anda mempunyai izin dari asisten dosen? (True/False) : ");
        asistenLab = sc.nextBoolean();
        
        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak : membutuhkan izin dosen atau stsatus asisten dosen");
            }
        } else {
            System.out.println("Akses ditolak : status mahasiswa tidak memenuhi syarat");
        }
    sc.close();}
}
