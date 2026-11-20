package Latihan;
import java.util.Scanner;

public class RekalpNilaiKuis {
    public static void main(String[] args) {
        Scanner Hafizh = new Scanner(System.in);

        double ratarataNilai=0;
        int nilaiTertinggi=0, nilaiTerendah=0, jumlahMahsiswalulus=0, jumlahMahsiswatdklulus=0, totalNilai=0;

        System.out.print("Jumlah mahasiswa: ");
        int jumlahMahsiswa = Hafizh.nextInt();

        for (int i = 1; i <= jumlahMahsiswa; i++){
            System.out.print("Nilai Mahasiswa ke- " +i +": ");
            int nilaiMahasiswa = Hafizh.nextInt();
                do {
                     if (nilaiMahasiswa > 100 || nilaiMahasiswa < 0) {
                        System.out.println("Nilai harus 0-100. Ulangi input");
                        System.out.print("Nilai Mahasiswa ke- " +i +": ");
                        nilaiMahasiswa = Hafizh.nextInt();
                     }
                } while (nilaiMahasiswa > 100);
        
            totalNilai+=nilaiMahasiswa;
            ratarataNilai=(double)totalNilai/jumlahMahsiswa;

            if (nilaiMahasiswa >= 60) {
                jumlahMahsiswalulus++;
            } else {
                jumlahMahsiswatdklulus++;
            }
            if (nilaiTertinggi < nilaiMahasiswa) {
                nilaiTertinggi=nilaiMahasiswa;
            } else {
                nilaiTerendah=nilaiMahasiswa;
            }
        }
        System.out.println("Rata-rata: " +ratarataNilai);
        System.out.println("Nilai Tertinggi: " +nilaiTertinggi);
        System.out.println("Nilai Terendah: " +nilaiTerendah);
        System.out.println("Lulus (>=60): " +jumlahMahsiswalulus);
        System.out.println("Tidak Lulus: " +jumlahMahsiswatdklulus);
        Hafizh.close();
    }
}
