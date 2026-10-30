//(baris, kolom) pertama = (2 + (18 mod 3), 4 + (18 mod 3)) = (2,4)
//(baris, kolom) kedua =  (5 + (18 mod 3), (2 + (18 mod 3)) = (5,2)
import java.util.Scanner;

public class Rectangle18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Masukkan jumlah baris : ");
        int baris =sc.nextInt();
        System.out.println("Masukkan jumlah kolom : ");
        int kolom = sc.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.println("*");
            }
        System.out.println();
        } 
        sc.close();
    }
}
