package Pertemuan10;

import java.util.Scanner;

public class Star21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n = ");
        int n = raysha.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();

        raysha.close();
    }
}
