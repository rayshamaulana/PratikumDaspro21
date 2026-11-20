package Pertemuan11;

import java.util.Scanner;

public class Internet21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
        int n = 0;
         String namaPelanggan, isi;
        do {
            System.out.print("Tambah Pelanggan (y/t) : ");
            isi = raysha.nextLine();
            if (isi.equalsIgnoreCase("t")) {
                break;
            }
            n++;
            System.out.print("Masukkan pelanggan : ");
            namaPelanggan = raysha.nextLine();

        
        int total = 0;
        int layak = 0;
        int tidakLayak = 0;

        for (int i = 1; i <= n; i++) {
            int uji;

            do {
                System.out.print("Kecepatan uji -" + i + " : ");
                uji = raysha.nextInt();
                if (uji >= 20) {
                    System.out.println("Data tidak valid. Ulangi input!");
                }
            } while (uji < 20);
             
            uji += total;

            if (uji >= 20) {
                layak = uji;
            }
            if (uji < 20) {
                tidakLayak = uji;
            }
            if (layak >= 20) {
                layak++;
            } else if (tidakLayak < 20) {
                tidakLayak++;
        }
        double rata = (double) uji / n;
        System.out.println("Rata - rata :    " + rata);
        System.out.println("Jumlah layak: " + layak);
        System.out.println("Jumlah Tidak layak : " + tidakLayak);
        raysha.close();
    }
  }
}
}