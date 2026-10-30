package Pertemuan10;

import java.util.Scanner;

public class Rectangle21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
        
       System.out.print("Masukkan jumlah baris: ");
        int baris = raysha.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = raysha.nextInt();

        for (int j = 1; j <= kolom; j++) {
            System.out.print("*");
        }
        
        raysha.close();
    }
}
