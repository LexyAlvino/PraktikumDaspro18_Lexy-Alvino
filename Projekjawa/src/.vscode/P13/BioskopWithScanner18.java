import java.util.Scanner;

public class BioskopWithScanner18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        do {
            System.out.println("============ Menu ============");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan  daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu : ");
            menu=sc.nextInt();
          
            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    penonton[baris - 1][kolom - 1] = nama;
                    break;
            
                case 2 :
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.println("Baris ke-" + (i + 1) + ": "+ String.join(", ", penonton[i]));
                    }
                    break;
                case 3 : 
                    System.out.println("Porgram selesai");
                    break;
                default:
                System.out.println("Menu tidak tersedia");
            }
        } 
        while (menu != 3);
    }
}    