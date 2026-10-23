import java.util.Scanner;

public class MenghitungTotalBayar18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double harga;
        double potongan;
        double jumlahBayar;
        double diskon = 0.15;

        System.out.println("Masukkan harga : ");
        harga = sc.nextDouble();
        potongan = harga * diskon;
        jumlahBayar = harga - potongan;
        System.out.println("Jadi jumlah bayarnya adalah " + jumlahBayar);

        sc.close();
}
}