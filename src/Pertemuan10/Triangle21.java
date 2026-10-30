package Pertemuan10;

import java.util.Scanner;

public class Triangle21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = raysha.nextInt();

        // Segitiga biasa
        int i = 1;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        // Segitiga terbalik
        i = n;
        while (i >= 1) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        raysha.close();
    }
}
