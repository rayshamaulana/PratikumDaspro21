package Pertemuan2;
import java.util.Scanner;

public class Segitiga21 {
    public static void main(String[] args) {
        Scanner rasya =new Scanner(System.in);
        int alas, tinggi;
        float luas;

        System.out.print("Masukkan alas : ");
        alas = rasya.nextInt();
        System.out.print("Masukkan Tinggi : ");
        tinggi = rasya.nextInt();
        luas = alas * tinggi / 2;
        System.out.print("Luas segitiga : "+ luas);
        rasya.close();
    }
}
