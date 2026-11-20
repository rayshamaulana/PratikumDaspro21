package Latihan;
import java.util.Scanner;

public class PinjamanKoperasi {
    public static void main(String[] args) {
        Scanner inInt = new Scanner(System.in);
        Scanner inString = new Scanner(System.in);

        String namaAnggota, isi;
        int jumlahPengajuan = 0, jumlahSetuju = 0, jumlahTolak = 0;
        double totalPinjamanSetuju = 0, totalBungaSetuju = 0;

        do {
            System.out.print("Ingin input pengajuan baru (y/t) : ");
            isi = inString.nextLine();
            if (isi.equalsIgnoreCase("t")) {
                break;
            }
            jumlahPengajuan++;
            System.out.print("Masukkan nama anggota : ");
            namaAnggota = inString.nextLine();

            int pinjaman = 0, lama = 0, gaji = 0;
            double persenBunga = 0;

            do {
                System.out.print("Jumlah pinjaman (500000-10000000) : ");
                pinjaman = inInt.nextInt();
                if (pinjaman < 500000 || pinjaman > 10000000) {
                    System.out.println("ulangi input");
                }
            } while (pinjaman < 500000 || pinjaman > 10000000);
            do {
                System.out.print("Lama cicilan (1-24 bulan) : ");
                lama = inInt.nextInt();
                if (lama < 1 || lama > 24) {
                    System.out.println("ulangi input");
                }
            } while (lama < 1 || lama > 24);
            do {
                System.out.print("Gaji bulanan : ");
                gaji = inInt.nextInt();
                if (gaji <= 0) {
                    System.out.println("ulangi input");
                }
            } while (gaji <= 0);

            if (lama <= 6) {
                persenBunga = 1.5;
            } else if (lama <= 12) {
                persenBunga = 2;
            } else {
                persenBunga = 2.5;
            }
            double totalBunga = pinjaman * persenBunga / 100 * lama;
            double totalBayar = pinjaman + totalBunga;
            double cicilan = totalBayar / lama;

            System.out.println("Bunga per bulan : " + persenBunga + "%");
            System.out.printf("Total bunga     : Rp %.0f%n", totalBunga);
            System.out.printf("Total bayar     : Rp %.0f%n", totalBayar);
            System.out.printf("Cicilan/bulan   : Rp %.0f%n", cicilan);
            if (cicilan <= gaji * 0.3) {
                System.out.println("Status          : DISETUJUI");
                jumlahSetuju++;
                totalPinjamanSetuju += pinjaman;
                totalBungaSetuju += totalBunga;
            } else {
                System.out.println("Status          : DITOLAK");
                jumlahTolak++;
            }

        } while (isi.equalsIgnoreCase("y"));
        System.out.println("Jumlah pengajuan : " + jumlahPengajuan);
        System.out.println("Disetujui : " + jumlahSetuju);
        System.out.println("Ditolak : " + jumlahTolak);
        System.out.printf("Total pinjaman disetujui : Rp %.0f%n", totalPinjamanSetuju);
        System.out.printf("Total bunga disetujui : Rp %.0f%n", totalBungaSetuju);
        inInt.close();
        inString.close();
    }
}
