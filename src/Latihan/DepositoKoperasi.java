package Latihan;
import java.util.Scanner;
public class DepositoKoperasi {
    public static void main(String[] args) {
        Scanner inInt = new Scanner(System.in);
        Scanner inString = new Scanner(System.in);

        String namaNasabah, isi;
        int jumlahNasabah = 0, jumlahPrioritas = 0, jumlahReguler = 0;
        double totalDana = 0, totalBunga = 0;

        do {
            System.out.print("Ingin input nasabah baru (y/t) : ");
            isi = inString.nextLine();
            if (isi.equalsIgnoreCase("t")) {
                break;
            }
            jumlahNasabah++;
            System.out.print("Masukkan nama nasabah : ");
            namaNasabah = inString.nextLine();

            int nominal = 0, jangka = 0;
            double persenBunga = 0;

            do {
                System.out.print("Nominal simpanan (min 1000000) : ");
                nominal = inInt.nextInt();
                if (nominal < 1000000) {
                    System.out.println("ulangi input");
                }
            } while (nominal < 1000000);
            do {
                System.out.print("Jangka waktu (3/6/12 bulan) : ");
                jangka = inInt.nextInt();
                if (jangka != 3 && jangka != 6 && jangka != 12) {
                    System.out.println("ulangi input");
                }
            } while (jangka != 3 && jangka != 6 && jangka != 12);

            if (jangka == 3) {
                persenBunga = 4;
            } else if (jangka == 6) {
                persenBunga = 5;
            } else {
                persenBunga = 6;
            }
            double bunga = nominal * persenBunga / 100 * jangka / 12;
            double totalAkhir = nominal + bunga;

            System.out.println("Bunga per tahun : " + persenBunga + "%");
            System.out.printf("Bunga diterima  : Rp %.0f%n", bunga);
            System.out.printf("Total akhir     : Rp %.0f%n", totalAkhir);
            if (nominal >= 10000000) {
                System.out.println("Kategori        : Nasabah Prioritas");
                jumlahPrioritas++;
            } else {
                System.out.println("Kategori        : Nasabah Reguler");
                jumlahReguler++;
            }
            totalDana += nominal;
            totalBunga += bunga;

        } while (isi.equalsIgnoreCase("y"));
        System.out.println("Jumlah nasabah : " + jumlahNasabah);
        System.out.println("Nasabah prioritas : " + jumlahPrioritas);
        System.out.println("Nasabah reguler : " + jumlahReguler);
        System.out.printf("Total dana terkumpul : Rp %.0f%n", totalDana);
        System.out.printf("Total bunga dibayarkan : Rp %.0f%n", totalBunga);
        inInt.close();
        inString.close();
    }
}
