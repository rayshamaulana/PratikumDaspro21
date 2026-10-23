//P=21
//tarif kode 1 = 2500
//tarif kode 2 = 5500
//tarif kode 3 = 10.500
//B = 2
//S = 7

package Pertemuan8;

import java.util.Scanner;

public class ParkirGedung21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);

        String kodeKendaraan = "";
        String layanan = "";

        double motor, mobil, truk;
        int B = 2, S = 7;
        double lamaParkir;
        double biayaDasar = 0;
        double besarTambahan = 0;
        double totalBayar = 0;
        double hargaDasar = 0;

        boolean kodeValid = true;

        System.out.print("Masukkan jenis layanan (1/2/3) : ");
        kodeKendaraan = raysha.nextLine();

        System.out.print("Masukkan berapa lama parkir (jam) : ");
        lamaParkir = raysha.nextDouble();

        switch (kodeKendaraan) {
            case "1":
                layanan = "Motor";
                hargaDasar = 2500;
                break;

            case "2":
                layanan = "Mobil";
                hargaDasar = 5500;
                break;

            case "3":
                layanan = "Truk";
                hargaDasar = 10500;
                break;

            default:
                kodeValid = false;
                System.out.println("Kode layanan tidak tersedia.");
                break;
        }

        if (kodeValid) {
            if (lamaParkir <= 0 && lamaParkir >=24) {
                System.out.println("Lama parkir harus lebih dari 0 jam.");
            } else {
                biayaDasar = hargaDasar;

                if (lamaParkir > B) {
                    besarTambahan = (lamaParkir - B) * S * 1000;
                } else {
                    besarTambahan = 0;
                }

                totalBayar = biayaDasar + besarTambahan;

                System.out.println("\n===== STRUK PARKIR =====");
                System.out.println("Layanan       : " + layanan);
                System.out.println("Lama Parkir   : " + lamaParkir + " jam");
                System.out.println("Biaya Dasar   : Rp" + biayaDasar);
                System.out.println("Tambahan      : Rp" + besarTambahan);
                System.out.println("Total Biaya   : Rp" + totalBayar);
            }
        }

        raysha.close();
    }
}
