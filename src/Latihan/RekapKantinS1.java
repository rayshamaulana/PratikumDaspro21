package Latihan;
import java.util.Scanner;
public class RekapKantinS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah kantin : ");
        int kantin = sc.nextInt();
        System.out.print("Jumlah hari   : ");
        int hari = sc.nextInt();

        if (kantin <= 0 || hari <= 0) {
            System.out.println("Jumlah kantin dan hari harus > 0.");
        } else {
            int totalSemua = 0;
            int kantinTerbaik = 0;
            int totalTerbaik = -1;   // lebih kecil dari semua total mungkin (min 0)
            int hariSepi = 0;

            int k = 1;
            while (k <= kantin) {
                System.out.println("Kantin " + k);
                int totalKantin = 0;

                for (int h = 1; h <= hari; h++) {
                    int pendapatan;
                    do {
                        System.out.print("  Pendapatan hari ke-" + h + " : ");
                        pendapatan = sc.nextInt();
                        if (pendapatan < 0) {
                            System.out.println("  Tidak boleh negatif. Ulangi input!");
                        }
                    } while (pendapatan < 0);

                    totalKantin += pendapatan;
                    if (pendapatan < 100) hariSepi++;
                }

                double rata = (double) totalKantin / hari;
                System.out.println("Kantin " + k + " - total: " + totalKantin
                        + ", rata-rata per hari: " + rata);

                totalSemua += totalKantin;
                if (totalKantin > totalTerbaik) {   // pakai ">" bukan ">="
                    totalTerbaik = totalKantin;
                    kantinTerbaik = k;
                }

                k++;   // jangan lupa! kalau tidak, infinite loop
            }

            System.out.println("==============================");
            System.out.println("Total seluruh kantin : " + totalSemua);
            System.out.println("Kantin terbaik       : " + kantinTerbaik);
            System.out.println("Hari sepi (< 100)    : " + hariSepi);
            sc.close();
        }
    }
}
