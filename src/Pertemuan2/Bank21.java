package Pertemuan2;
import java.util.Scanner;

public class Bank21 {
    public static void main(String[] args) {
        Scanner rasya =new Scanner(System.in);
        int jml_tabungan_awal, lama_menabung;
        double presentase_bunga=0.02, bunga, jml_tabungan_akhir;
        System.out.print("Masukkan jumlah tabungan awal anda : ");
        jml_tabungan_awal = rasya.nextInt();
        System.out.print("Masukkan lama menabung anda : ");
        lama_menabung = rasya.nextInt();
        bunga= lama_menabung*presentase_bunga*jml_tabungan_awal;
        jml_tabungan_akhir=bunga+jml_tabungan_awal;
        System.out.println("Bunga yang dihasilkan : "+bunga);
        System.out.println("Jumlah tabungan akhir anda : "+jml_tabungan_akhir);
        rasya.close();
    }
}