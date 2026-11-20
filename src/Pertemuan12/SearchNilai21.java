package Pertemuan12;
import java.util.Scanner;
public class SearchNilai21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen: ");
        int n = raysha.nextInt();
        int[] nilai = new int[n];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = raysha.nextInt();
        }

        System.out.print("Masukkan nilai yang dicari (key): ");
        int key = raysha.nextInt();
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
           System.out.println("Nilai yang dicari tidak ditemukan: " + key 
           + " tidak ada di dalam array yang berisi " + nilai.length + " elemen.");
}
        raysha.close();
    }
}
