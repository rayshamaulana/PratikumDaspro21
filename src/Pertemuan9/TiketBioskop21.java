package Pertemuan9;


import java.util.Scanner;

public class TiketBioskop21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
 
        int hargaTiket = 46000;
        int jumlahTiket;
        int totalTiket = 0;
        int totalPenjualan = 0;
 
        while (true) {
            System.out.print("Masukkan jumlah tiket pelanggan (0 untuk selesai): ");
            jumlahTiket = raysha.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi!");
                continue;
            }

            if (jumlahTiket == 0) {
                break;
            }
 
            int harga = jumlahTiket * hargaTiket;
            int diskon = 0;
 
            if (jumlahTiket > 9) {
                diskon = 16;
            } else if (jumlahTiket > 3) {
                diskon = 9;
            }
 
            int potongan = harga * diskon / 100;
            int bayar = harga - potongan;
 
            System.out.println("Harga sebelum diskon : Rp " + harga);
            System.out.println("Diskon " + diskon + "%          : Rp " + potongan);
            System.out.println("Total bayar          : Rp " + bayar);
 
            totalTiket += jumlahTiket;
            totalPenjualan += bayar;
        }
 
        System.out.println("=== Rekap Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total penjualan     : Rp " + totalPenjualan);
 
        raysha.close();
    }
}