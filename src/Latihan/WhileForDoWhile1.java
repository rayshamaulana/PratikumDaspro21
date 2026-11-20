package Latihan;
// Sebuah kampus memiliki beberapa kantin. Pendapatan harian setiap kantin (dalam ribu rupiah) dicatat selama beberapa hari. Buat program dengan ketentuan berikut. 
// 1. Program meminta jumlah kantin dan jumlah hari. Jika salah satunya kurang dari atau sama dengan 0, 
// tampilkan pesan Jumlah kantin dan hari harus > 0. lalu program selesai tanpa memproses data (gunakan IF-ELSE). 
// 2. Proses data menggunakan tiga tingkat perulangan: WHILE (luar) untuk kantin, FOR (tengah) untuk hari, dan DO-WHILE (dalam) untuk memvalidasi pendapatan. 
// Pendapatan tidak boleh negatif; jika negatif, tampilkan pesan dan minta input ulang untuk hari yang sama. 
// 3. Setiap kali satu kantin selesai, tampilkan total pendapatan dan rata-rata pendapatan per hari (bertipe double). 
// 4. Setelah semua kantin selesai, tampilkan total pendapatan seluruh kantin, nomor kantin dengan total pendapatan tertinggi 
// (jika ada yang sama, pilih nomor kantin yang lebih kecil), dan banyaknya hari sepi dari seluruh kantin. Hari sepi adalah hari dengan pendapatan kurang dari 100. 
import java.util.Scanner;

public class WhileForDoWhile1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah kantin : ");
        int jumlahKantin = sc.nextInt();
        System.out.print("Jumlah hari   : ");
        int jumlahHari = sc.nextInt();

        if (jumlahKantin <= 0 || jumlahHari <= 0) {
            System.out.println("Jumlah kantin dan hari harus > 0.");
        } else {
            int totalSemua = 0;
            int totalTertinggi = -1;
            int kantinTerbaik = 0;
            int hariSepi = 0;

            int kantin = 1;

            while (kantin <= jumlahKantin) {
                System.out.println("Kantin " + kantin);
                int totalKantin = 0;

                for (int hari = 1; hari <= jumlahHari; hari++) {
                    int pendapatan;

                    do {
                        System.out.print(" Pendapatan hari ke-" + hari + " : ");
                        pendapatan = sc.nextInt();
                        if (pendapatan < 0) {
                            System.out.println(" Tidak boleh negatif. Ulangi input!");
                        }
                    } while (pendapatan < 0);

                    totalKantin += pendapatan;

                    if (pendapatan < 100) {
                        hariSepi++;
                    }
                }

                double rataRata = (double) totalKantin / jumlahHari;
                System.out.println("Kantin " + kantin + " - total: " + totalKantin
                        + ", rata-rata per hari: " + rataRata);

                totalSemua += totalKantin;

                if (totalKantin > totalTertinggi) {
                    totalTertinggi = totalKantin;
                    kantinTerbaik = kantin;
                }

                kantin++;
            }

            System.out.println("==============================");
            System.out.println("Total seluruh kantin : " + totalSemua);
            System.out.println("Kantin terbaik       : " + kantinTerbaik);
            System.out.println("Hari sepi (< 100)    : " + hariSepi);
        }

        sc.close();
    }
}