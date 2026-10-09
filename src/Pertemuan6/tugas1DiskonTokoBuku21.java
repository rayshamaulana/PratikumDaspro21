package Pertemuan6;
import java.util.Scanner;

public class tugas1DiskonTokoBuku21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);

        int P = 21;

        int diskonKamus = 8 + (P % 5);
        int batasKamus  = 2 + (P % 2);
        int diskonNovel = 5 + (P % 4);
        int batasNovel  = 3 + (P % 2);
        int diskonLain  = 3 + (P % 4);
        int batasLain   = 3 + (P % 2);

        System.out.println("=== PARAMETER UNIK ===");
        System.out.println("P = " + P);
        System.out.println("Diskon dasar kamus   = " + diskonKamus + "%, batas > " + batasKamus + " buah (tambahan 2%)");
        System.out.println("Diskon dasar novel   = " + diskonNovel + "%, batas > " + batasNovel + " buah (tambahan 2%, selain itu 1%)");
        System.out.println("Diskon buku lainnya  = " + diskonLain + "%, berlaku jika > " + batasLain + " buah");
        System.out.println();

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya) : ");
        String jenis = raysha.nextLine().trim();
        System.out.print("Masukkan jumlah buku : ");
        int jumlah = raysha.nextInt();
        System.out.print("Masukkan harga per buku : Rp. ");
        int harga = raysha.nextInt();

        double persen = 0;

        if (jumlah > 0 && harga > 0) {
            if (jenis.equalsIgnoreCase("kamus")) {
                persen = diskonKamus;
                if (jumlah > batasKamus) {
                    persen = persen + 2;
                }
            } else if (jenis.equalsIgnoreCase("novel")) {
                persen = diskonNovel;
                if (jumlah > batasNovel) {
                    persen = persen + 2;
                } else {
                    persen = persen + 1;
                }
            } else {
                if (jumlah > batasLain) {
                    persen = diskonLain;
                }
            }

            double totalHarga = (double) jumlah * harga;
            double diskon = totalHarga * persen / 100;
            double bayar = totalHarga - diskon;

            System.out.println();
            System.out.println("Total harga sebelum diskon  : Rp " + totalHarga);
            System.out.println("Persentase diskon           : " + persen + "%");
            System.out.println("Jumlah diskon               : Rp " + diskon);
            System.out.println("Total yang harus dibayar    : Rp " + bayar);
        } else {
            System.out.println("Input tidak valid: jumlah dan harga harus lebih dari 0");
        }

        raysha.close();
    }
}