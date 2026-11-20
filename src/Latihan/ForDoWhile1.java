package Latihan;
// Seorang dosen ingin merekap nilai kuis mahasiswa di dalam satu kelas. Buat program dengan ketentuan berikut. 
// 1. Program meminta jumlah mahasiswa (n). Nilai n dianggap sudah benar (n minimal 1). 
// 2. Gunakan perulangan FOR untuk membaca nilai n mahasiswa. Nilai yang valid berada pada rentang 0 sampai 100. 
// Jika nilai tidak valid, tampilkan pesan kesalahan dan minta nilai mahasiswa yang sama diinput ulang menggunakan perulangan DO-WHILE. 
// 3. Setelah semua nilai diterima, tampilkan rata-rata nilai (bertipe double), nilai tertinggi, nilai terendah, jumlah mahasiswa lulus 
// (nilai minimal 60), dan jumlah mahasiswa tidak lulus. 
import java.util.Scanner;

public class ForDoWhile1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah mahasiswa : ");
        int n = sc.nextInt();

        int total = 0;
        int tertinggi = 0;
        int terendah = 100;
        int lulus = 0;
        int tidakLulus = 0;

        for (int i = 1; i <= n; i++) {
            int nilai;

            do {
                System.out.print("Nilai mahasiswa ke-" + i + " : ");
                nilai = sc.nextInt();
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

            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        double rataRata = (double) total / n;

        System.out.println("Rata-rata       : " + rataRata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);
        System.out.println("Lulus (>= 60)   : " + lulus);
        System.out.println("Tidak lulus     : " + tidakLulus);

        sc.close();
    }
}