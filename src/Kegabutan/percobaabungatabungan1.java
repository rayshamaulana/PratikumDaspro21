package Kegabutan;
import java.util.Scanner;

public class percobaabungatabungan1 {
    public static void main (String[] args) {
        Scanner raysha = new Scanner(System.in);
        double jumlahtabunganAwal;
        int lamaMenabung;
        double presentaseBunga = 0.03;
        double bunga;
        double jumlahtabunganAkhir;

        System.out.print("Masukkan Tabungan Awal : ");
        jumlahtabunganAwal = raysha.nextDouble();
        System.out.print("Masukkan lama menabung : ");
        lamaMenabung = raysha.nextInt();

        bunga = jumlahtabunganAwal * lamaMenabung * presentaseBunga;
        jumlahtabunganAkhir = jumlahtabunganAwal + bunga;
        System.out.println("Jumlah tabungan akhirnya adalah : " + jumlahtabunganAkhir);
        raysha.close();
    }
}
