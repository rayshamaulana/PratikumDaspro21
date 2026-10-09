package Pertemuan3;
import java.util.Scanner;
public class RinaLaptop21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);

        int hargaLaptop;
        int uangMuka;
        int cicilBulan;
        int sisaCicil;
        double bunga = 0.02;
        double jmlBayar;

        System.out.print("Harga laptop : ");
        hargaLaptop = raysha.nextInt();
        System.out.print("Uang muka : ");
        uangMuka = raysha.nextInt();
        System.out.print("Laptop dicicil berapa bulan : ");
        cicilBulan = raysha.nextInt();

        sisaCicil = hargaLaptop - uangMuka;
        System.out.println("Sisa cicilan : " + sisaCicil);
        bunga *= sisaCicil;
        System.out.println("Bunga setiap bulan : " + bunga);
        jmlBayar = (sisaCicil / cicilBulan) + bunga;
        System.out.println("Jumlah cicilan yang harus dibayar Rina : " + jmlBayar);

        raysha.close();     
    }
}
