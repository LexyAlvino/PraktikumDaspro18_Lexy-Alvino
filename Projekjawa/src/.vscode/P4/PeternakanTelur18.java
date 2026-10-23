public class PeternakanTelur18 {

    public static void main(String[] args) {

        int ayam = 1, telurPerayam = 25, beratTelur = 62, telurPertray = 30, jumlahKandang = 4;
        int jumlahAyam, totalTelur, jumlahTray, telurEceran;
        double beratTotal;
        
        jumlahAyam = ayam * jumlahKandang;
        System.out.println("Total jumlah ayam : " + jumlahAyam);

        totalTelur = jumlahKandang * ayam * telurPerayam;
        System.out.println("Total telur sebulan : " + totalTelur);
        
        jumlahTray = totalTelur / telurPertray;
        System.out.println("Total tray penuh : " + jumlahTray);

        telurEceran = totalTelur % telurPertray;
        System.out.println("Sisa telur : " + telurEceran);

        beratTotal= (double) (totalTelur *  beratTelur) / 1000;
        System.out.println("Total berat semua telur : " + beratTotal + " kg");

        //Total jumlah ayam : 4
        //Total telur sebulan : 100
        //Total tray penuh : 3
        //Sisa telur : 10
        //Total berat semua telur : 6.0 kg
    }
}
