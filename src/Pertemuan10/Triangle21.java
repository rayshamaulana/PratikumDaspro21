package Pertemuan10;

import java.util.Scanner;

public class Triangle21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
         System.out.print("Masukkan nilai n = ");
        int n = raysha.nextInt();

        int i = 0;
        while (i <= n) {
           System.out.print("[i=" + i + "] ");   // debug sementara
           int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
        }
        raysha.close();
    }
}
