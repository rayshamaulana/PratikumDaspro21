package Pertemuan3;
import java.util.Scanner;

public class MenghitungLuasPersegiPanjang21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
        int panjang;
        int lebar;
        int luas;

        panjang=raysha.nextInt(); 
        lebar=raysha.nextInt();
        luas=panjang*lebar;
        System.out.println("Luas persegi panjang adalah " + luas);

        raysha.close();
    }
}
  