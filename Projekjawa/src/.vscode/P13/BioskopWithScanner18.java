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
                    sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                    
                    if ((baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length)) {
                        System.out.println("Tidak valid, ulangi lagi!");
                        continue;
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi oleh " + penonton[baris - 1][kolom - 1] + ". Pilih kursi lain!");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data berhasil disimpan.");
                        break;
                    }
                    break;
                case 2 :
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.print("Baris ke-" + (i + 1) + ": ");
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("***");
                            } else {
                                System.out.print(penonton[i][j]);
                            }
                            if (j < penonton[i].length - 1) {
                                System.out.print(", ");
                            }
                    }
                    System.out.println();
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