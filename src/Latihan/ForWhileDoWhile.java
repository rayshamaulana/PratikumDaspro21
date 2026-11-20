package Latihan;
// Sebuah perpustakaan memiliki beberapa ruang baca. Jumlah pengunjung setiap ruang dicatat selama beberapa hari. Buat program dengan ketentuan berikut. 
// 1. Program meminta jumlah ruang baca dan jumlah hari. Jika salah satunya kurang dari atau sama dengan 0, tampilkan pesan Jumlah ruang dan hari harus > 0. 
// lalu program selesai tanpa memproses data (gunakan IF-ELSE). 
// 2. Proses data menggunakan tiga tingkat perulangan: FOR (luar) untuk ruang baca, WHILE (tengah) untuk hari, dan DO-WHILE (dalam) untuk memvalidasi jumlah pengunjung. 
// Jumlah pengunjung tidak boleh negatif; jika negatif, tampilkan pesan dan minta input ulang untuk hari yang sama. 
// 3. Setiap kali satu ruang selesai, tampilkan total pengunjung dan rata-rata pengunjung per hari (bertipe double). 
// 4. Setelah semua ruang selesai, tampilkan total pengunjung seluruh ruang, nomor ruang dengan total pengunjung tertinggi (jika ada yang sama, pilih nomor ruang yang lebih
import java.util.Scanner;

public class ForWhileDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah ruang baca : ");
        int jumlahRuang = sc.nextInt();
        System.out.print("Jumlah hari       : ");
        int jumlahHari = sc.nextInt();

        if (jumlahRuang <= 0 || jumlahHari <= 0) {
            System.out.println("Jumlah ruang dan hari harus > 0.");
        } else {
            int totalSemua = 0;
            int totalTertinggi = -1;
            int ruangTerbaik = 0;
            int hariRamai = 0;


            for (int ruang = 1; ruang <= jumlahRuang; ruang++) {
                System.out.println("Ruang " + ruang);
                int totalRuang = 0;

                int hari = 1;

                while (hari <= jumlahHari) {
                    int pengunjung;

                    do {
                        System.out.print(" Pengunjung hari ke-" + hari + " : ");
                        pengunjung = sc.nextInt();
                        if (pengunjung < 0) {
                            System.out.println(" Tidak boleh negatif. Ulangi input!");
                        }
                    } while (pengunjung < 0);

                    totalRuang += pengunjung;

                    if (pengunjung > 50) {
                        hariRamai++;
                    }

                    hari++;
                }

                double rataRata = (double) totalRuang / jumlahHari;
                System.out.println("Ruang " + ruang + " - total: " + totalRuang
                        + ", rata-rata per hari: " + rataRata);

                totalSemua += totalRuang;

                if (totalRuang > totalTertinggi) {
                    totalTertinggi = totalRuang;
                    ruangTerbaik = ruang;
                }
            }

            System.out.println("==============================");
            System.out.println("Total seluruh pengunjung : " + totalSemua);
            System.out.println("Ruang paling ramai       : " + ruangTerbaik);
            System.out.println("Hari ramai (> 50)        : " + hariRamai);
        }

        sc.close();
    }
}