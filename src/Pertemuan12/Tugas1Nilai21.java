package Pertemuan12;
import java.util.Scanner;

public class Tugas1Nilai21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);

        int n;
        do {
            System.out.print("Masukkan banyaknya nilai mahasiswa: ");
            n = raysha.nextInt();
        } while (n <= 0);

        int[] nilai = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = raysha.nextInt();
            total += nilai[i];
        }

        double rata2 = (double) total / n;

        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < n; i++) {
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            if (nilai[i] < terendah) terendah = nilai[i];
        }

        System.out.println();
        System.out.println("=== Daftar Nilai Mahasiswa ===");
        for (int i = 0; i < n; i++) {
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }

        System.out.println();
        System.out.println("Rata-rata nilai : " + rata2);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);
        raysha.close();
    }
}