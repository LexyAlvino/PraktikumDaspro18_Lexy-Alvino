import java.util.Scanner;   
    
public class Segitiga18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan alas : ");
        int alas = scanner.nextInt();
        System.out.print("Masukkan tinggi : ");
        int tinggi = scanner.nextInt();
        int luas = alas * tinggi / 2;



        System.out.println("Luas segitiga : " + luas);
        scanner.close();
    }
}
