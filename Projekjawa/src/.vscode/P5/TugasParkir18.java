package P5;
import java.util.Scanner;

public class TugasParkir18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan durasi lama parkir : ");
        int lamaParkir = sc.nextInt();
         
        if (lamaParkir <= 2) {
            int tarifParkir = 2000;
            System.out.println("Tarif yang harus dibayar : " + tarifParkir);
        }
        else {
            int tarifParkir = 2000 + (lamaParkir - 2)*1000;
            System.out.println("Tarif yang harus dibayar : " + tarifParkir);
        }
    sc.close();}
}
