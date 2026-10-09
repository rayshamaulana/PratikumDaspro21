package Pertemuan5;
import java.util.Scanner;

public class PemilihanIf21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
        
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas?  (true/false) : ");
        boolean uktLunas = raysha.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }
        raysha.close();
    }
}
