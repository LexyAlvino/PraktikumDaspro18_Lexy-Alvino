//n = (2 + (18 mod 3))=2

import java.util.Scanner;

public class Triangle18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();

        int i=0;
        while (i<=n) {
            System.out.print("[i=" + i + "]");
            int j =0;
            while (j<i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}