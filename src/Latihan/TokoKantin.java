package Latihan;
import java.util.Scanner;
public class TokoKantin {
    public static void main(String[] args) {
        Scanner inInt = new Scanner(System.in);
        Scanner inString = new Scanner(System.in);

        String namaPelanggan, isi, member;
        int jumlahTransaksi = 0, jumlahBesar = 0, jumlahReguler = 0;
        double totalPendapatan = 0, totalDiskon = 0;

        do {
            System.out.print("Ingin input transaksi baru (y/t) : ");
            isi = inString.nextLine();
            if (isi.equalsIgnoreCase("t")) {
                break;
            }
            jumlahTransaksi++;
            System.out.print("Masukkan nama pelanggan : ");
            namaPelanggan = inString.nextLine();

            int harga1 = 0, jumlah1 = 0, harga2 = 0, jumlah2 = 0;
            double persenDiskon = 0;

            do {
                System.out.print("Harga barang 1 : ");
                harga1 = inInt.nextInt();
                if (harga1 <= 0) {
                    System.out.println("ulangi input");
                }
            } while (harga1 <= 0);
            do {
                System.out.print("Jumlah barang 1 (1-50) : ");
                jumlah1 = inInt.nextInt();
                if (jumlah1 < 1 || jumlah1 > 50) {
                    System.out.println("ulangi input");
                }
            } while (jumlah1 < 1 || jumlah1 > 50);
            do {
                System.out.print("Harga barang 2 : ");
                harga2 = inInt.nextInt();
                if (harga2 <= 0) {
                    System.out.println("ulangi input");
                }
            } while (harga2 <= 0);
            do {
                System.out.print("Jumlah barang 2 (1-50) : ");
                jumlah2 = inInt.nextInt();
                if (jumlah2 < 1 || jumlah2 > 50) {
                    System.out.println("ulangi input");
                }
            } while (jumlah2 < 1 || jumlah2 > 50);
            do {
                System.out.print("Anggota koperasi (y/t) : ");
                member = inString.nextLine();
                if (!member.equalsIgnoreCase("y") && !member.equalsIgnoreCase("t")) {
                    System.out.println("ulangi input");
                }
            } while (!member.equalsIgnoreCase("y") && !member.equalsIgnoreCase("t"));

            double subtotal = (harga1 * jumlah1) + (harga2 * jumlah2);
            if (member.equalsIgnoreCase("y")) {
                persenDiskon += 10;
            }
            if (subtotal >= 200000) {
                persenDiskon += 5;
            }
            double diskon = subtotal * persenDiskon / 100;
            double totalBayar = subtotal - diskon;

            System.out.printf("Subtotal       : Rp %.0f%n", subtotal);
            System.out.printf("Diskon (%.0f%%)   : Rp %.0f%n", persenDiskon, diskon);
            System.out.printf("Total bayar    : Rp %.0f%n", totalBayar);
            if (totalBayar >= 200000) {
                System.out.println("Kategori       : Pelanggan Besar");
                jumlahBesar++;
            } else {
                System.out.println("Kategori       : Pelanggan Reguler");
                jumlahReguler++;
            }
            totalPendapatan += totalBayar;
            totalDiskon += diskon;

        } while (isi.equalsIgnoreCase("y"));
        System.out.println("Jumlah transaksi : " + jumlahTransaksi);
        System.out.println("Pelanggan besar : " + jumlahBesar);
        System.out.println("Pelanggan reguler : " + jumlahReguler);
        System.out.printf("Total pendapatan : Rp %.0f%n", totalPendapatan);
        System.out.printf("Total diskon : Rp %.0f%n", totalDiskon);
        inInt.close();
        inString.close();
    }
}
