import java.util.Scanner;
/**
 * Bioskop02
 */
public class Bioskop02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int jumlahTiket, totalTiketTerjual = 0;
        double hargaTiket = 50000, hargaJual, totalHargaJual = 0, totalPendapatan = 0;

        do {
            System.out.print("Masukkan jumlah tiket yang akan dibeli: ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Masukkan kembali pesanan anda!");
                continue;
            }
            if (jumlahTiket == 0) {
                System.out.println("Pemesanan tiket dibatalkan.");
                break;
            }

            hargaJual = hargaTiket * jumlahTiket;
            if (jumlahTiket > 10) {
                totalHargaJual = hargaJual - (hargaJual * 0.15);
                System.out.println("Total Harga yang harus anda bayar: " + totalHargaJual);
                System.out.println("Selamat anda telah mendapatkan diskon senilai 15%");
            } else if (jumlahTiket > 4) {
                totalHargaJual = hargaJual - (hargaJual * 0.10);
                System.out.println("Selamat anda telah mendapatkan diskon senilai 10%");
                System.out.println("Total Harga yang harus anda bayar: " + totalHargaJual);
            } else {
                totalHargaJual = hargaJual;
                System.out.println("Total Harga yang harus anda bayar: " +totalHargaJual);
            }
            totalTiketTerjual += jumlahTiket;
            totalPendapatan += totalHargaJual;

        } while (true);

        System.out.println("Total tiket bioskop yang terjual hari ini: " + totalTiketTerjual);
        System.out.println("Total pendapatan tiket yang anda dapatkan hari ini: " + totalPendapatan);
    }
}