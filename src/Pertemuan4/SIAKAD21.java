package Pertemuan4;
import java.util.Scanner;

public class SIAKAD21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);

        System.out.print("Masukkan nama : ");
        String nama = raysha.nextLine();
        System.out.print("Masukkan NIM : ");
        String nim = raysha.nextLine();
        System.out.print("Masukkan kelas : ");
        String kelas = raysha.nextLine();
        System.out.print("Masukkan nomor absen : ");
        int noAbsen = raysha.nextInt();
        System.out.print("Masukkan nilai kuis : ");
        double kuis = raysha.nextDouble();
        System.out.print("Masukkan nilai tugas : ");
        double tugas = raysha.nextDouble();
        System.out.print("Masukkan nilai ujian : ");

        double ujian = raysha.nextDouble();
        double nilaiAkhir = (kuis + tugas + ujian) / 3;

        String nilaiHuruf;
        String kualifikasi;

        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }

        System.out.println();
        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + noAbsen);

        System.out.println("Nilai akhir : " + nilaiAkhir);
        System.out.println("Nilai akhir huruf : " + nilaiHuruf);
        System.out.println("Kualifikasi : " + kualifikasi);

        raysha.close();
    }
}
