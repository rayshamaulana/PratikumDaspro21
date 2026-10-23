package Pertemuan9;


import java.util.Scanner;
 
public class ParkirKendaraan21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
 
        int jenis, durasi, total = 0;
 
        do {
            System.out.print("Masukkan jenis kendaraan (1 = mobil, 2 = motor, 0 = keluar): ");
            jenis = raysha.nextInt();
 
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = raysha.nextInt();
 
                if (jenis == 1) {
                    total += durasi * 3250;
                } else {
                    total += durasi * 2250;
                }
            }
        } while (jenis != 0);
 
        System.out.println("Total pembayaran parkir: Rp " + total);
 
        raysha.close();
    }
}