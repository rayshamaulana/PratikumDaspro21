package Latihan;
// Sebuah kafe memiliki beberapa gerai. Jumlah cup kopi yang terjual di setiap gerai dicatat selama beberapa hari.dengan ketentuan berikut.
// Program meminta jumlah gerai dan jumlah hari. Jika salah satunya kurang dari atau sama dengan 0, 
// tampilkan pesan Jumlah gerai dan hari harus > 0. lalu program selesai tanpa memproses data (gunakan IF-ELSE).
// Proses data menggunakan tiga tingkat perulangan: DO-WHILE (luar) untuk gerai, FOR (tengah) untuk hari, 
// dan DO-WHILE (dalam) untuk memvalidasi penjualan. Penjualan tidak boleh negatif; jika negatif, tampilkan pesan dan minta input ulang untuk hari yang sama.
// Setiap kali satu gerai selesai, tampilkan total penjualan dan rata-rata penjualan per hari (bertipe double).
// Setelah semua gerai selesai, tampilkan total penjualan seluruh gerai, nomor gerai dengan total penjualan tertinggi 
// (jika ada yang sama, pilih nomor gerai yang lebih besar), dan banyaknya hari laris dari seluruh gerai. Hari laris adalah hari dengan penjualan minimal 80 cup.
import java.util.Scanner;

public class IfElseDoWhile {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);

        System.out.print("Jumlah gerai : ");
        int jumlahGerai = raysha.nextInt();
        System.out.print("Jumlah hari  : ");
        int jumlahHari = raysha.nextInt();

        if (jumlahGerai <= 0 || jumlahHari <= 0) {
            System.out.println("Jumlah gerai dan hari harus > 0.");
        } else {
            int totalSemua = 0;
            int totalTertinggi = -1;
            int geraiTerbaik = 0;
            int hariLaris = 0;

            int gerai = 1;

            do {
                System.out.println("Gerai " + gerai);
                int totalGerai = 0;

                for (int hari = 1; hari <= jumlahHari; hari++) {
                    int penjualan;

                    do {
                        System.out.print("Penjualan hari ke-" + hari + " : ");
                        penjualan = raysha.nextInt();
                        if (penjualan < 0) {
                            System.out.println("Tidak boleh negatif. Ulangi input!");
                        }
                    } while (penjualan < 0);
                    totalGerai += penjualan;

                    if (penjualan >= 80) {
                        hariLaris++;
                    }
                }
                double rataRata = (double) totalGerai / jumlahHari;
                System.out.println("Gerai " + gerai + " -total : " + totalGerai + ", rata-rata per hari : " + rataRata);

                totalSemua += totalGerai;

                if (totalGerai >= totalTertinggi) {
                    totalTertinggi = totalGerai;
                    geraiTerbaik = gerai;
                }
                gerai++;
            } while (gerai <= jumlahGerai);

            System.out.println("=========================");
            System.out.println("Total seluruh gerai :" + totalSemua);
            System.out.println("Gerai terbaik       :" + geraiTerbaik);
            System.out.println("Hari laris (>=80)   :" + hariLaris);
        }
        raysha.close();
    }
}