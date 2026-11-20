import java.util.Arrays;
import java.util.Scanner;

public class SorthNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang ingin diinput : " );
        int banyak = sc.nextInt();
        int[] nilai = new int[banyak];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai baris ke-" + (i+1) + " : ");
            nilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari : ");
        int key = sc.nextInt();
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Nilai yang dicari tidak ditemukan.");
            System.out.println("Nilai " + key + " tidak ada di antara " + nilai.length  + " data: " + Arrays.toString(nilai));
        }

        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j] < nilai[j + 1]) {   // diubah dari > menjadi <
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }
    System.out.println(Arrays.toString(nilai));
    }
}
