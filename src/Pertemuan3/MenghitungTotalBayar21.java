package Pertemuan3;
import java.util.Scanner;
public class MenghitungTotalBayar21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
        double harga;
        double potongan;
        double jml_bayar;
        double diskon=0.15;

        System.out.print("Harga : ");
        harga=raysha.nextInt();

        potongan=diskon*harga;
        System.out.println("Potongan : " + potongan);
        jml_bayar=harga-potongan;
        System.out.println("Jumlah yang harus anda bayar adalah Rp. " + jml_bayar);
        
        
        raysha.close();
    }
}
  