package Latihan;
import java.util.Scanner;

public class RekapNilaiS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah mahasiswa : ");
        int n = sc.nextInt();

        int total = 0;
        int tertinggi = 0;
        int terendah = 100;
        int tuntas = 0;
        int remidi = 0;

        for (int i = 1; i <= n; i++) {
            int nilai;
            do {
                System.out.print("Nilai tugas ke-" + i + " : ");
                nilai = sc.nextInt();
                if (nilai < 0 || nilai > 100) {
                    System.out.println("Nilai harus 0-100. Ulangi input!");
                }
            } while (nilai < 0 || nilai > 100);

            total += nilai;
            if (nilai > tertinggi) tertinggi = nilai;
            if (nilai < terendah) terendah = nilai;

            if (nilai >= 70) tuntas++;
            else remidi++;
        }

        double rata = (double) total / n;

        System.out.println("Rata-rata       : " + rata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);
        System.out.println("Tuntas (>= 70)  : " + tuntas);
        System.out.println("Remidi          : " + remidi);
        sc.close();
    }
}
