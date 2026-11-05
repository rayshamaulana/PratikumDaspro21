package Pertemuan10;
import java.util.Scanner;

public class Tugas321 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);

        int jumlahToko;
        
        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = raysha.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1. Ulangi input!");
            }
        } while (jumlahToko < 1);

        int totalSemua = 0;
        int tokoTerbanyak = 0;
        int barangTertinggi = -1;
        String ringkasan = "";

        for (int t = 1; t <= jumlahToko; t++) {
            System.out.println("Toko " + t);

            int jumlahPelanggan;

            do {
                System.out.print("  Jumlah pelanggan: ");
                jumlahPelanggan = raysha.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("  Tidak boleh negatif. Ulangi input!");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangToko = 0;

            for (int p = 1; p <= jumlahPelanggan; p++) {
                int barang;
                do {
                    System.out.print("    Barang dibeli pelanggan " + p + ": ");
                    barang = raysha.nextInt();
                    if (barang < 0) {
                        System.out.println("    Tidak boleh negatif. Ulangi input!");
                    }
                } while (barang < 0);
                totalBarangToko += barang;
            }

            ringkasan += "Toko " + t + " - pelanggan: " + jumlahPelanggan
                    + ", total barang: " + totalBarangToko + "\n";
            totalSemua += totalBarangToko;

            if (totalBarangToko > barangTertinggi) {
                barangTertinggi = totalBarangToko;
                tokoTerbanyak = t;
            }
        }

        System.out.print(ringkasan);
        System.out.println("Total barang seluruh toko: " + totalSemua);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        raysha.close();
    }
}