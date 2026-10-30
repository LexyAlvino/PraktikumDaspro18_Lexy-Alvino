//baris = (4 +(18 mod 4)) = 6 
//kolom = (6 + (18 mod 4)) = 8

import java.util.Scanner;

public class Rectangle18_pertanyaan2 {
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
