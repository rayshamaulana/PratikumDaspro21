package Latihan;
// Sebuah kampus memiliki beberapa laboratorium. Jumlah alat yang dipinjam di setiap laboratorium dicatat selama beberapa hari.dengan ketentuan berikut.
// Program meminta jumlah laboratorium dan jumlah hari. Jika salah satunya kurang dari atau sama dengan 0, 
// tampilkan pesan Jumlah laboratorium dan hari harus > 0. lalu program selesai tanpa memproses data (gunakan IF-ELSE).
// Proses data menggunakan tiga tingkat perulangan: FOR (luar) untuk laboratorium, DO-WHILE (tengah) untuk hari, 
// dan DO-WHILE (dalam) untuk memvalidasi jumlah peminjaman. Jumlah peminjaman tidak boleh negatif; jika negatif, tampilkan pesan dan minta input ulang untuk hari yang sama.
// Setiap kali satu laboratorium selesai, tampilkan total peminjaman dan rata-rata peminjaman per hari (bertipe double).
// Setelah semua laboratorium selesai, tampilkan total peminjaman seluruh laboratorium, nomor laboratorium dengan total peminjaman terendah 
// (jika ada yang sama, pilih nomor laboratorium yang lebih kecil), dan banyaknya hari kosong dari seluruh laboratorium. Hari kosong adalah hari dengan peminjaman tepat 0.
import java.util.Scanner;

public class IfElseForDoWhile {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);

        System.out.print("Jumlah laboratorium : ");
        int jumlahLab = raysha.nextInt();
        System.out.print("Jumlah hari         : ");
        int jumlahHari = raysha.nextInt();

        if (jumlahLab <= 0 || jumlahHari <= 0) {
            System.out.println("Jumlah laboratorium dan hari harus > 0.");
        } else {
            int totalSemua = 0;
            int totalTerendah = 0;
            int labTerendah = 0;
            int hariKosong = 0;

            for (int lab = 1; lab <= jumlahLab; lab++) {
                System.out.println("Lab " + lab);
                int totalLab = 0;

                int hari = 1;

                do {
                    int peminjaman;

                    do {
                        System.out.print(" Peminjaman hari ke-" + hari + " : ");
                        peminjaman = raysha.nextInt();
                        if (peminjaman < 0) {
                            System.out.println(" Tidak boleh negatif. Ulangi input!");
                        }
                    } while (peminjaman < 0);

                    totalLab += peminjaman;

                    if (peminjaman == 0) {
                        hariKosong++;
                    }

                    hari++;
                } while (hari <= jumlahHari);

                double rataRata = (double) totalLab / jumlahHari;
                System.out.println("Lab " + lab + " - total: " + totalLab
                        + ", rata-rata per hari: " + rataRata);

                totalSemua += totalLab;

                if (lab == 1 || totalLab < totalTerendah) {
                    totalTerendah = totalLab;
                    labTerendah = lab;
                }
            }
            System.out.println("======================");
            System.out.println("Total seluruh lab    : " + totalSemua);
            System.out.println("Lab paling sepi      : " + labTerendah);
            System.out.println("Hari kosong (=0)     : " + hariKosong);
        }
        raysha.close();
    }
}