package Latihan;
// Seorang dosen ingin merekap nilai praktik basis data peserta di dalam satu kelas.dengan ketentuan berikut.
// Program meminta jumlah peserta (n). Nilai n dianggap sudah benar (n minimal 1).
// Gunakan perulangan FOR untuk membaca nilai n peserta. Nilai yang valid berada pada rentang 0 sampai 100. 
// Jika nilai tidak valid, tampilkan pesan kesalahan dan minta nilai peserta yang sama diinput ulang menggunakan perulangan DO-WHILE.
// Setelah semua nilai diterima, tampilkan rata-rata nilai (bertipe double), nilai tertinggi, nilai terendah, 
// jumlah peserta kompeten (nilai minimal 75), dan jumlah peserta belum kompeten.
import java.util.Scanner;

public class ForDoWhile3 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);

        System.out.print("Jumlah Pesesrta : ");
        int n = raysha.nextInt();

        int total = 0;
        int tertinggi = 0;
        int terendah = 100;
        int kompeten = 0;
        int belumKompeten = 0;

        for (int i = 1; i <= n; i++) {
            int nilai;
            do {
            System.out.print("Nilai peserta ke-" + i + ":");
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
        if (nilai >=75) {
            kompeten++;
        } else {
            belumKompeten++;
        }
    }
        double rataRata = (double) total / n;
        System.out.println("Rata- rata      : " + rataRata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);
        System.out.println("Kompeten (>=75) : " + kompeten);
        System.out.println("Belum kompeten  : " + belumKompeten);
        raysha.close();
        }
    }