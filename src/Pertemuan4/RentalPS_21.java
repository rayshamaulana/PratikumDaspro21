package Pertemuan4;
import java.util.Scanner;

public class RentalPS_21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
        double menit;
        double lamaMenyewa;
        double potonganAnggota = 0.125;
        double totalBiaya;
        double jamPenuh;
        double sisaMenit;
        double biayaMember;
         System.out.print("Masukkan berapa lama menyewa PS (Jam) : ");
         lamaMenyewa = raysha.nextDouble();

         System.out.print("Masukkan berapa lama menyewa (menit) : ");
         menit = raysha.nextDouble();

         jamPenuh = lamaMenyewa * 7000;
         System.out.println("Jam penuh : " + jamPenuh);

         sisaMenit = menit * 150;
         System.out.println("Sisa menit : "+ sisaMenit);

         totalBiaya = jamPenuh + sisaMenit;
         System.out.println("Total biaya : "+ totalBiaya);

         biayaMember = totalBiaya - (totalBiaya * potonganAnggota);
         System.out.println("Biaya Member : " + biayaMember);

        raysha.close();
    }
}
// Hasil Output
// Masukkan berapa lama menyewa PS (Jam) : 2
//Masukkan berapa lama menyewa (menit) : 20
//Jam penuh : 14000.0
//Sisa menit : 3000.0
//Total biaya : 17000.0
//Biaya Member : 14875.0