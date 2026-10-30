//n = (3 + (18 mod 5)) = 6 
//n = (9 + (18 mod 5)) = 12

import java.util.Scanner;

public class Star18 {
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