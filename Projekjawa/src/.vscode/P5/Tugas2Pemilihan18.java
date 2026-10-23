package P5;
import java.util.Scanner;

public class Tugas2Pemilihan18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahSKS;

        System.out.print("Masukkan jumlah SKS : ");
        jumlahSKS = sc.nextInt();

        if (jumlahSKS > 24) {
            System.out.println("SKS melebihi batas");
        }
        else {
            System.out.println("Jumlah SKS valid");
        }
    sc.close();
    }
}
