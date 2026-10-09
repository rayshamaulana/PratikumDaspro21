package Pertemuan5;

import java.util.Scanner;

public class TugasParkir21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
         System.out.print("Masukkan lama parkir (jam) : ");
        int lamaParkir = raysha.nextInt();

        int biayaParkir;

        if (lamaParkir <= 2) {
            biayaParkir = 2000;
        } else {
            biayaParkir = 2000 + (lamaParkir - 2) * 1000;
        }

        System.out.println("Biaya parkir: Rp." + biayaParkir);

        raysha.close();
    }
}
