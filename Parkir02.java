import java.util.Scanner;
/**
 * Parkir02
 */
public class Parkir02 {

    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);

        int jenis, durasi, total = 0, totalPembayaran = 0;

        do {
           System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): " );
           jenis = sc02.nextInt();

           if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan lama durasi parkir: ");
                durasi = sc02.nextInt();
                if (durasi > 5) {
                    total += 12500;
                    System.out.println("Total pembayaran yang harus anda bayar senilai : Rp " + total);
                } else if (jenis == 1) {
                    total += durasi * 3000;
                    System.out.println("Total pembayaran yang harus anda bayar senilai : Rp " + total);
                } else if (jenis == 2) {
                    total += durasi * 2000;
                    System.out.println("Total pembayaran yang harus anda bayar senilai : Rp " + total);
                }
           } else if (jenis == 0) {
                System.out.println("Keluar dari sistem, pembayaran dihentikan.");
                break;
           } else {
                System.out.println("Input jenis kendaraan tidak valid, Silahkan input ulang jenis kendaraan.");
                continue;
           }

           totalPembayaran += total;

        } while (jenis != 0);

        System.out.println("Total pembayaran parkir dari beberapa kendaraan senilai: Rp " + totalPembayaran);
    }
}