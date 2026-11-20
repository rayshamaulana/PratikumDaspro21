package Pertemuan12;
import java.util.Scanner;

public class Tugas2Kafe21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng",
                         "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=== KAFE KAMPUS ===");
        System.out.println("Daftar menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("  - %-16s Rp %,6d%n", menu[i], harga[i]);
        }
        System.out.println();

        int jumlah;
        do {
            System.out.print("Masukkan jumlah item yang dipesan: ");
            jumlah = raysha.nextInt();
        } while (jumlah <= 0);
        raysha.nextLine();

        String[] pesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            int indeks = -1;

            while (indeks == -1) {
                System.out.print("Pesanan ke-" + (i + 1) + " - masukkan nama menu: ");
                String cari = raysha.nextLine().trim();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(cari)) {
                        indeks = j;
                        break;
                    }
                }

                if (indeks == -1) {
                    System.out.println("  Maaf, menu \"" + cari + "\" tidak tersedia. Silakan coba lagi.");
                }
            }

            System.out.printf("  Menu ditemukan: %s (Rp %,d)%n", menu[indeks], harga[indeks]);
            pesanan[i] = menu[indeks];
            hargaPesanan[i] = harga[indeks];
            total += harga[indeks];
        }

        System.out.println();
        System.out.println("======= DAFTAR PESANAN ========");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%d. %-16s Rp %,8d%n", (i + 1), pesanan[i], hargaPesanan[i]);
        }
        System.out.println("-------------------------------");
        System.out.printf("%-19s Rp %,8d%n", "TOTAL BIAYA", total);
        System.out.println("===============================");
        raysha.close();
    }
}