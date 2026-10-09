package Pertemuan3;
import java.util.Scanner;
public class GajiKaryawan21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
        int gajiPokok;
        double bonus, totGaji;
        double tunjTransp=600000;
        double tunjMkn=400000;

        gajiPokok=raysha.nextInt();
        bonus= 0.05*gajiPokok;
        totGaji=gajiPokok+tunjTransp+tunjMkn+bonus-(0.1*gajiPokok);

        System.out.println("Bonus Bulanan anda adalah Rp. "+bonus);
        System.out.println("Gaji yang diterima adalah Rp. "+(int)totGaji);

        raysha.close(); 
    }
}
