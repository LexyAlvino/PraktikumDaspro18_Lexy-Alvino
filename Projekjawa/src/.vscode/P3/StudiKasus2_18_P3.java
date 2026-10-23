import java.util.Scanner;

public class StudiKasus2_18_P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int banyakLembar;
        int hargaPerLembar = 500;
        int hargaJilid = 5000;
        int totalHarga;
    
    System.out.println("Masukkan banyak lembar : ");
    banyakLembar = sc.nextInt();
    totalHarga = (banyakLembar * hargaPerLembar) + hargaJilid;
    System.out.println("Total harga adalah " + totalHarga);

    sc.close();
    }
}
