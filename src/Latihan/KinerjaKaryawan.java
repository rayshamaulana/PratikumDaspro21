package Latihan;
import java.util.Scanner;
public class KinerjaKaryawan {
    public static void main(String[] args) {
        Scanner inInt = new Scanner(System.in);
        Scanner inString = new Scanner(System.in);

        String namaKaryawan, isi;
        int jumlahKaryawan = 0, jumlahSangatBaik = 0, jumlahBaik = 0, jumlahBina = 0;
        double totalBonus = 0, totalNilai = 0;

        do {
            System.out.print("Ingin input karyawan baru (y/t) : ");
            isi = inString.nextLine();
            if (isi.equalsIgnoreCase("t")) {
                break;
            }
            jumlahKaryawan++;
            System.out.print("Masukkan nama karyawan : ");
            namaKaryawan = inString.nextLine();

            int gaji = 0, disiplin = 0, penjualan = 0, pelanggan1 = 0, pelanggan2 = 0;
            double rataPelanggan = 0, nilaiAkhir = 0, bonus = 0;

            do {
                System.out.print("Gaji pokok : ");
                gaji = inInt.nextInt();
                if (gaji <= 0) {
                    System.out.println("ulangi input");
                }
            } while (gaji <= 0);
            do {
                System.out.print("Nilai kedisiplinan (0-100) : ");
                disiplin = inInt.nextInt();
                if (disiplin < 0 || disiplin > 100) {
                    System.out.println("ulangi input");
                }
            } while (disiplin < 0 || disiplin > 100);
            do {
                System.out.print("Nilai target penjualan (0-100) : ");
                penjualan = inInt.nextInt();
                if (penjualan < 0 || penjualan > 100) {
                    System.out.println("ulangi input");
                }
            } while (penjualan < 0 || penjualan > 100);
            do {
                System.out.print("Nilai penilaian pelanggan 1 (0-100) : ");
                pelanggan1 = inInt.nextInt();
                if (pelanggan1 < 0 || pelanggan1 > 100) {
                    System.out.println("ulangi input");
                }
            } while (pelanggan1 < 0 || pelanggan1 > 100);
            do {
                System.out.print("Nilai penilaian pelanggan 2 (0-100) : ");
                pelanggan2 = inInt.nextInt();
                if (pelanggan2 < 0 || pelanggan2 > 100) {
                    System.out.println("ulangi input");
                }
            } while (pelanggan2 < 0 || pelanggan2 > 100);

            rataPelanggan = (pelanggan1 + pelanggan2) / 2.0;
            nilaiAkhir = disiplin * 0.2 + penjualan * 0.4 + rataPelanggan * 0.4;

            System.out.println("Rata-rata penilaian pelanggan : " + rataPelanggan);
            System.out.println("Nilai akhir : " + nilaiAkhir);
            if (nilaiAkhir >= 85) {
                System.out.println("Kategori : Sangat Baik");
                bonus = gaji * 0.2;
                jumlahSangatBaik++;
            } else if (nilaiAkhir >= 70) {
                System.out.println("Kategori : Baik");
                bonus = gaji * 0.1;
                jumlahBaik++;
            } else {
                System.out.println("Kategori : Perlu Pembinaan");
                bonus = 0;
                jumlahBina++;
            }
            System.out.printf("Bonus : Rp %.0f%n", bonus);
            totalBonus += bonus;
            totalNilai += nilaiAkhir;

        } while (isi.equalsIgnoreCase("y"));
        System.out.println("Jumlah karyawan : " + jumlahKaryawan);
        System.out.println("Sangat Baik : " + jumlahSangatBaik);
        System.out.println("Baik : " + jumlahBaik);
        System.out.println("Perlu Pembinaan : " + jumlahBina);
        System.out.printf("Total bonus : Rp %.0f%n", totalBonus);
        if (jumlahKaryawan > 0) {
            System.out.println("Rata-rata nilai akhir : " + (totalNilai / jumlahKaryawan));
        }
        inInt.close();
        inString.close();
    }
}
