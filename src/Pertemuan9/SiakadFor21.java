package Pertemuan9;


import java.util.Scanner;

public class SiakadFor21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
         double nilai, tertinggi = 0, terendah = 100;
         int lulus = 0, tidakLulus = 0;
 
         for (int i = 1; i <= 9; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = raysha.nextDouble();
 
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            
            if (nilai >= 65) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
 
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);

        raysha.close();
    }
}