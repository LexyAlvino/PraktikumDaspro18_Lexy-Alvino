//n = (4 + (18 mod 4)) = 6

import java.util.Scanner;

public class Star18_pertanyaan1dan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan nilai n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
        System.out.println();
        sc.close();
    }
}