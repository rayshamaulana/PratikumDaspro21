package Pertemuan9;

import java.util.Scanner;

public class KafeDoWhile21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
        
        int kopi, teh, roti, totalHarga;
        String namaPelanggan;
        int hargaKopi = 11000;
        int hargaTeh = 6000;
        int hargaRoti = 18000;

         do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar) : ");
            namaPelanggan = raysha.nextLine();
 
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
 
            System.out.print("Jumlah kopi: ");
            kopi = raysha.nextInt();
            System.out.print("Jumlah teh: ");
            teh = raysha.nextInt();
            System.out.print("Jumlah roti: ");
            roti = raysha.nextInt();
 
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            raysha.nextLine();

        } while (true);
 
        System.out.println("Semua transaksi selesai.");
        raysha.close();
    }
}
