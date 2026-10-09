package Kegabutan;
import java.util.Scanner;

public class percobaanpersegipanjang {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
        double panjang;
        double lebar;
        double luas;
        double keliling;

        System.out.print("Masukkan Panjang persegi panjangnya : ");
        panjang = raysha.nextDouble();

        System.out.print("Masukkan lebar perseginya : ");
        lebar = raysha.nextDouble();
        luas = panjang*lebar;
        keliling = 2 * (panjang+lebar);

        System.out.println("Hasil luasnya : " + luas);
        System.out.println("Hasil kelilingnya : " + keliling);
        raysha.close();
    }
}
