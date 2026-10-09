package Pertemuan2;
import java.util.Scanner;

public class PakTono21 {
    public static void main(String[] args) {
        Scanner rasya = new Scanner(System.in);

        double lebar;
        double panjang;
        double diameter;
        double sisi;
        double luasTanah;
        double jariJari;
        double luasKolam;
        double luasTaman;
        double luasTidakDigunakan;

        System.out.print("Masukkan lebar tanah : ");
        lebar = rasya.nextDouble();
        System.out.print("Masukkan panjang tanah : ");
        panjang = rasya.nextDouble();
        System.out.print("Masukkan diameter kolam : ");
        diameter = rasya.nextDouble();
        System.out.print("Masukkan sisi taman : ");
        sisi = rasya.nextDouble();
        luasTanah = lebar * panjang;
        jariJari = diameter / 2;
        luasKolam = Math.PI * jariJari * jariJari;
        luasTaman = sisi * sisi;
        luasTidakDigunakan = luasTanah - luasKolam - luasTaman;

        System.out.println("Luas tanah = " + luasTanah + " m2");
        System.out.println("Luas kolam = " + luasKolam + " m2");
        System.out.println("Luas taman = " + luasTaman + " m2");
        System.out.println("Luas tanah yang tidak digunakan = " + luasTidakDigunakan + " m2");
        rasya.close();
    }
}
