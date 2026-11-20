package Latihan;
import java.util.Scanner;
public class ParkirKoperasi {
    public static void main(String[] args) {
        Scanner inInt = new Scanner(System.in);
        Scanner inString = new Scanner(System.in);

        String platNomor, isi, langganan;
        int jumlahKendaraan = 0, jumlahMotor = 0, jumlahMobil = 0, jumlahLangganan = 0;
        double totalDiskon = 0, totalPendapatan = 0;

        do {
            System.out.print("Ingin input kendaraan baru (y/t) : ");
            isi = inString.nextLine();
            if (isi.equalsIgnoreCase("t")) {
                break;
            }
            jumlahKendaraan++;
            System.out.print("Masukkan plat nomor : ");
            platNomor = inString.nextLine();

            int jenis = 0, lama = 0;
            double tarif = 0, diskon = 0;

            do {
                System.out.print("Jenis kendaraan (1=motor, 2=mobil) : ");
                jenis = inInt.nextInt();
                if (jenis != 1 && jenis != 2) {
                    System.out.println("ulangi input");
                }
            } while (jenis != 1 && jenis != 2);
            do {
                System.out.print("Lama parkir (1-24 jam) : ");
                lama = inInt.nextInt();
                if (lama < 1 || lama > 24) {
                    System.out.println("ulangi input");
                }
            } while (lama < 1 || lama > 24);
            do {
                System.out.print("Karcis langganan (y/t) : ");
                langganan = inString.nextLine();
                if (!langganan.equalsIgnoreCase("y") && !langganan.equalsIgnoreCase("t")) {
                    System.out.println("ulangi input");
                }
            } while (!langganan.equalsIgnoreCase("y") && !langganan.equalsIgnoreCase("t"));

            if (jenis == 1) {
                tarif = 2000 + (lama - 1) * 1000;
                jumlahMotor++;
            } else {
                tarif = 5000 + (lama - 1) * 3000;
                jumlahMobil++;
            }
            if (lama > 12) {
                tarif += 10000;
            }
            if (langganan.equalsIgnoreCase("y")) {
                diskon = tarif * 20 / 100;
                jumlahLangganan++;
            }
            double totalBayar = tarif - diskon;

            System.out.printf("Tarif parkir  : Rp %.0f%n", tarif);
            System.out.printf("Diskon        : Rp %.0f%n", diskon);
            System.out.printf("Total bayar   : Rp %.0f%n", totalBayar);
            totalDiskon += diskon;
            totalPendapatan += totalBayar;

        } while (isi.equalsIgnoreCase("y"));
        System.out.println("Jumlah kendaraan : " + jumlahKendaraan);
        System.out.println("Motor : " + jumlahMotor);
        System.out.println("Mobil : " + jumlahMobil);
        System.out.println("Pelanggan langganan : " + jumlahLangganan);
        System.out.printf("Total diskon : Rp %.0f%n", totalDiskon);
        System.out.printf("Total pendapatan : Rp %.0f%n", totalPendapatan);
        inInt.close();
        inString.close();
    }
}
