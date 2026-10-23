import java.util.Scanner;

public class tugas2SeleksiAsisten18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean statusAktif, sedangSanksi, punyaSertif;
        int nilaiDasPro, minNilaiDasPro = 82, nilaiWawancara, minNilaiWawancara = 77;

        System.out.print("Apakah berstatus mahasiswa aktif? (True/False) : ");
        statusAktif = sc.nextBoolean();
        System.out.print("Apakah mahasiswa sedang sanksi? (True/False) : ");
        sedangSanksi = sc.nextBoolean();
        System.out.print("Masukkan nilai Dasar Pemrogaman : ");
        nilaiDasPro = sc.nextInt();
        System.out.print("Apakah memiliki sertif? (True/False) : ");
        punyaSertif = sc.nextBoolean();
        System.out.print("Masukkan nilai wawancara : ");
        nilaiWawancara = sc.nextInt();

        if (statusAktif && !sedangSanksi) {
            if (nilaiDasPro > minNilaiDasPro || punyaSertif) {
                if (nilaiWawancara > minNilaiWawancara) {
                    System.out.println("Mahasiswa diterima menjadi asisten praktikum");
                } else {
                    System.out.println("Mahasiswa tidak lolos menjadi asisten praktikum karena nilai wawancara tidak memenuhi persyaratan");
                }
            } else {
                System.out.println("Mahasiswa tidak lolos ke tahap berikutnya karena nilai DasPro tidak memenuhi persyaratan atau tidak memiliki sertif");
            }
        } else {
            System.out.println("Mahasiswa bisa mengikuti tahap seleksi karena tidak memenuhi persyaratan");
        }
    sc.close();
    }
}
