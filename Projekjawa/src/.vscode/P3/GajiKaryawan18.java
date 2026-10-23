import java.util.Scanner;

public class GajiKaryawan18 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       int gajiPokok;
       double bonus;
       int totalGaji;
       double tunjTransp = 600000;
       double tunjMakan = 400000;

       System.out.println("Masukkan gaji pokok : ");
       gajiPokok = sc.nextInt();
       bonus = gajiPokok * 0.05;
       totalGaji = gajiPokok + (int)tunjTransp + (int)tunjMakan + (int)bonus - (int)(0.1 * gajiPokok);

       System.out.println("Bonus bulana yang diterima adalah " + bonus);
       System.out.println("Gaji yang diterima adalah " + totalGaji);

       sc.close();

    }
}
