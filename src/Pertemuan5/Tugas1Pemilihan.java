package Pertemuan5;

import java.util.Scanner;

public class Tugas1Pemilihan {
    public static void main(String[] args) {

        Scanner raysha = new Scanner(System.in);

       System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas?  (true/false) : ");
        boolean uktLunas = raysha.nextBoolean();

        String pesan = uktLunas
                ? "Pembayaran UKT terverifikasi. Silahkan cetak KRS dan minta tanda tangan DPA"
                : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";

        System.out.println(pesan);

        raysha.close();
    }
}

