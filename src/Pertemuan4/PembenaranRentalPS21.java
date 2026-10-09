package Pertemuan4;

import java.util.Scanner;

public class PembenaranRentalPS21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);

        System.out.print("Masukkan berapa lama main (menit) : ");
        int totalMenit = raysha.nextInt();

        // Tarif
        int tarifJam = 7000;
        int tarifMenit = 150;

        // Menghitung jam penuh dan sisa menit
        int jamPenuh = totalMenit / 60;
        int sisaMenit = totalMenit % 60;

        // Menghitung total biaya sebelum diskon
        int totalBiaya = (jamPenuh * tarifJam) + (sisaMenit * tarifMenit);

        // Diskon member 12,5%
        double diskon = totalBiaya * 0.125;
        double biayaMember = totalBiaya - diskon;

        System.out.println("\n=== RENTAL PLAYSTATION ===");
        System.out.println("Jam penuh    : " + jamPenuh);
        System.out.println("Sisa menit   : " + sisaMenit);
        System.out.println("Total biaya  : Rp" + totalBiaya);
        System.out.println("Biaya member : Rp" + biayaMember);
        raysha.close();
    }
}
