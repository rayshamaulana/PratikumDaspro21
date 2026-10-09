package Pertemuan3;
import java.util.Scanner;

public class MahasiswaCetakDokumen21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);

        int lembarDokumen;
        int biayaCetak;
        int biayaJilid=5000;
        int totalBiaya;

        System.out.print("Jumlah lembar dokumen : ");
        lembarDokumen = raysha.nextInt();

        biayaCetak = lembarDokumen * 500;
        totalBiaya = biayaCetak + biayaJilid;
        System.out.println("Biaya cetak : Rp. " + biayaCetak);
        System.out.println("Biaya penjilidan : Rp. " + biayaJilid);
        System.out.println("Total biaya yang harus dibayar adalah Rp. " + totalBiaya);

        raysha.close();
    }
}
