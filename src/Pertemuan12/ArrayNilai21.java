package Pertemuan12;
import java.util.Scanner;
public class ArrayNilai21 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner raysha = new Scanner(System.in);

        int no = 1;
        for (int n : nilaiAkhir) {
            String status = (n > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + no + ": " + n + " (" + status + ")");
            no++;
        }
        raysha.close();
    }
}