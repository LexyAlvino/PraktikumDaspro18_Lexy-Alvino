import java.util.Scanner;

public class ArrayNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];
        int lulus=0, tdkLulus=0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
            if (nilaiAkhir[i]>70) {
                lulus++;
            } else {
                tdkLulus++;
            }
        }
        int no = 1;
        for (int nilai : nilaiAkhir) {
            String status = (nilai > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + no + ": " + nilai + " (" + status + ")");
            no++;
        } 
        System.out.println("Jumlah Mahasiswa yang lulus\t   : " + lulus);
        System.out.println("Jumlah Mahasiswa yang tidak lulus : " + tdkLulus);
    sc.close();
    }
}