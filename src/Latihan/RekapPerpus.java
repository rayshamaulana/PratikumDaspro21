package Latihan;
import java.util.Scanner;
public class RekapPerpus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah ruang baca : ");
        int ruang = sc.nextInt();
        System.out.print("Jumlah hari       : ");
        int hari = sc.nextInt();

        if (ruang <= 0 || hari <= 0) {
            System.out.println("Jumlah ruang dan hari harus > 0.");
        } else {
            int totalSemua = 0;
            int ruangTerbaik = 0;
            int totalTerbaik = -1;
            int hariRamai = 0;

            for (int r = 1; r <= ruang; r++) {
                System.out.println("Ruang " + r);
                int totalRuang = 0;

                int h = 1;
                while (h <= hari) {
                    int pengunjung;
                    do {
                        System.out.print("  Pengunjung hari ke-" + h + " : ");
                        pengunjung = sc.nextInt();
                        if (pengunjung < 0) {
                            System.out.println("  Tidak boleh negatif. Ulangi input!");
                        }
                    } while (pengunjung < 0);

                    totalRuang += pengunjung;
                    if (pengunjung > 50) hariRamai++;

                    h++;   // counter hari manual, ditaruh SETELAH do-while
                }

                double rata = (double) totalRuang / hari;
                System.out.println("Ruang " + r + " - total: " + totalRuang
                        + ", rata-rata per hari: " + rata);

                totalSemua += totalRuang;
                if (totalRuang > totalTerbaik) {
                    totalTerbaik = totalRuang;
                    ruangTerbaik = r;
                }
            }

            System.out.println("==============================");
            System.out.println("Total seluruh pengunjung : " + totalSemua);
            System.out.println("Ruang paling ramai       : " + ruangTerbaik);
            System.out.println("Hari ramai (> 50)        : " + hariRamai);
            sc.close();
        }
    }
}
