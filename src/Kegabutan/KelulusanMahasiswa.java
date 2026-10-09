package Kegabutan;
import java.util.Scanner;

public class KelulusanMahasiswa {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);

        System.out.print("Masukkan nilai mahasiswa: ");
        int nilai = raysha.nextInt();

        System.out.print("Masukkan persentase kehadiran: ");
        int kehadiran = raysha.nextInt();

        boolean p = nilai >= 60;
        boolean q = kehadiran >= 80;
        boolean lulus = p && q;
        boolean tidakLulus = !p || !q;

        System.out.println("\n===== HASIL KELULUSAN =====");
        System.out.println("p = " + p);
        System.out.println("q = " + q);

        System.out.println("!(p && q) = " + lulus);
        System.out.println("!p || !q   = " + tidakLulus);

        if (tidakLulus) {
            System.out.println("Status: TIDAK LULUS");
        } else {
            System.out.println("Status: LULUS");
        }
        raysha.close();
    }
}