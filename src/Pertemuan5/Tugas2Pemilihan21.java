package Pertemuan5;

import java.util.Scanner;

public class Tugas2Pemilihan21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
        System.out.print("Masukkan jumlah SKS : ");
        int jumlahSks = raysha.nextInt();

        if (jumlahSks > 24) {
            System.out.println("Melebihi batas.");
        } else {
            System.out.println("KRS valid.");
        }

        raysha.close();
    }
}
