package Pertemuan2;
import java.util.Scanner;

public class PakDanur21 {
    public static void main(String[] args) {
        Scanner rasya= new Scanner(System.in);

        double gajiPokok;
        double tunjanganAnak;
        int jumlahAnak;
        double tunjanganTotal;
        double potonganPensiun;
        double gajiBersih;

        System.out.print("Masukkan gaji pokok : ");
        gajiPokok = rasya.nextDouble();
        System.out.print("Masukkan tunjangan anak per bulan : ");
        tunjanganAnak = rasya.nextDouble();
        System.out.print("Masukkan jumlah anak : ");
        jumlahAnak = rasya.nextInt();

        tunjanganTotal = tunjanganAnak * jumlahAnak;
        potonganPensiun = gajiPokok * 10/100;
        gajiBersih = gajiPokok + tunjanganTotal - potonganPensiun;

        System.out.println("Gaji pokok = Rp"+ gajiPokok);
        System.out.println("Tunjangan anak = Rp"+ tunjanganTotal);
        System.out.println("Potongan dana pensiun = Rp"+ potonganPensiun);
        System.out.println("Gaji bersih = "+ gajiBersih);
       rasya.close();
    }
}
