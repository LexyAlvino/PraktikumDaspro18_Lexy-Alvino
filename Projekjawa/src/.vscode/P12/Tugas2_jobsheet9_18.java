// 2 + (P mod 4)=4
// 18 mod 7=4
    
import java.util.Scanner;

public class Tugas2_jobsheet9_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng",
                         "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.print("Cari menu: ");
        String cari = sc.nextLine();
        int idx = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                idx = i;
                break;
            }
        }
        if (idx != -1) {
            System.out.println(menu[idx] + " tersedia, harga: Rp" + harga[idx]);
        } else {
            System.out.println("Menu \"" + cari + "\" tidak tersedia.");
        }

        System.out.print("\nJumlah item yang ingin dipesan: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        String[] pesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];
        int total = 0;

        for (int p = 0; p < jumlah; p++) {
            int pos = -1;
            while (pos == -1) {
                System.out.print("Pesanan ke-" + (p + 1) + ": ");
                String nama = sc.nextLine();
                for (int i = 0; i < menu.length; i++) {
                    if (menu[i].equalsIgnoreCase(nama)) {
                        pos = i;
                        break;
                    }
                }
                if (pos == -1) {
                    System.out.println("Menu tidak tersedia, silakan coba lagi.");
                }
            }
            pesanan[p] = menu[pos];
            hargaPesanan[p] = harga[pos];
            total += harga[pos];
        }

        System.out.println("\n===== DAFTAR PESANAN =====");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%d. %-16s Rp%,d%n", (i + 1), pesanan[i], hargaPesanan[i]);
        }
        System.out.println("--------------------------");
        System.out.printf("Total biaya: Rp%,d%n", total);
    }
}