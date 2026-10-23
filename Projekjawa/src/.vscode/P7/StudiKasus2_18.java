package P7;

import java.util.Scanner;

public class StudiKasus2_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumen, peringkat, status, syaratDokumen;

        System.out.print("Masuskkan nama mahasiswa : ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Masukkan jenis kegiatan(BELMAWA, BAKORMA, Mandiri, PKM, atau Lainnya) : ");
        jenisKegiatan = sc.nextLine();
        System.out.print("Masukkan jumlah dokumen (0-4) :");
        jumlahDokumen = sc.nextInt();
        System.out.print("Masukkan Peringkat juara (0=tidak juara) : ");
        peringkat = sc.nextInt();
        
        syaratDokumen = 4 - jumlahDokumen;

        if (jenisKegiatan.equalsIgnoreCase("BAKORMA")||jenisKegiatan.equalsIgnoreCase("Belmawa")||jenisKegiatan.equalsIgnoreCase("Mandiri")) {
            if (peringkat > 0 || peringkat <= 3) {
                if (jumlahDokumen == 4) {
                    System.out.println("Pendanaan diberikan");
                } else {
                    System.out.println("Pendanaan tidak diberikan, kurang " + syaratDokumen + " dokumen");
                }
            } else {
                System.out.println("Pendanaan tidak diberikan. Karena tidak juara");
            }
        } else {
            
        }
sc.close();}
}
