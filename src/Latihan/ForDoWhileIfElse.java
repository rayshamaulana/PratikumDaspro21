package Latihan;
// Seorang panitia ingin merekap nilai peserta lomba coding.dengan ketentuan berikut.
// Program meminta jumlah peserta (n). Nilai n dianggap sudah benar (n minimal 1).
// Gunakan perulangan FOR untuk membaca nilai n peserta. Nilai yang valid berada pada rentang 0 sampai 100. 
// Jika nilai tidak valid, tampilkan pesan kesalahan dan minta nilai peserta yang sama diinput ulang menggunakan perulangan DO-WHILE.
// Setelah semua nilai diterima, tampilkan rata-rata nilai (bertipe double), nilai tertinggi, nilai terendah, 
// dan jumlah peserta untuk setiap predikat: Sangat Baik (nilai minimal 85), Baik (nilai 70 sampai 84), dan Cukup (nilai kurang dari 70).
import java.util.Scanner;

public class ForDoWhileIfElse {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
        System.out.print("Jumlah peserta : ");
        int n = raysha.nextInt();

        int total = 0;
        int tertinggi = 0;
        int terendah = 100;
        int sangatBaik = 0;
        int baik = 0;
        int cukup = 0;

        for (int i = 1; i <= n; i++) {
            int nilai;

            do {
                System.out.print("Nilai peserta ke-" + i + " : ");
                nilai = raysha.nextInt();
                if (nilai < 0 || nilai > 100) {
                    System.out.println("Nilai harus 0-100. Ulangi input!");
                }
            } while (nilai < 0 || nilai > 100);
             
            total += nilai;

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 85) {
                sangatBaik++;
            } else if (nilai >= 70) {
                baik++;
            } else {
                cukup++;
            }
        }
        double rataRata = (double) total / n;
        System.out.println("Rata-rata          : " + rataRata);
        System.out.println("Nilai tertinggi    : " + tertinggi);
        System.out.println("Nilai terendah     : " + terendah);
        System.out.println("Sangat baik (>=85) : " + sangatBaik);
        System.out.println("Baik (70 - 84)     : " + baik);
        System.out.println("Cukup (< 70)       : " + cukup);

        raysha.close();
    }
}