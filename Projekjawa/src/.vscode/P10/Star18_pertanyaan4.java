//n = (10 + (18 mod 6)) = 10

import java.util.Scanner;

public class Star18_pertanyaan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}