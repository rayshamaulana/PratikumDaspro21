package Pertemuan6;
import java.util.Scanner;

public class tugas2SeleksiAsisten21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);

        int P = 21;

        int minNilaiDasPro = 75 +  (P % 11);
        int minNilaiWawancara = 70 + (P % 11);

        System.out.println("=== PARAMETER UNIK ===");
        System.out.println("P = " + P);
        System.out.println("Minimal nilai Dasar Pemrograman = " + minNilaiDasPro);
        System.out.println("Minimal nilai wawancara         = " + minNilaiWawancara);
        System.out.println();

        System.out.print("Apakah mahasiswa berstatus aktif? (true/false) : ");
        boolean aktif = raysha.nextBoolean();
        System.out.print("Apakah mahasiswa sedang mendapat sanksi akademik? (true/false) : ");
        boolean sedangSanksi = raysha.nextBoolean();

        if (aktif && !sedangSanksi) {
            System.out.println("Tahap 1 lolos: mahasiswa aktif dan tidak sedang disanksi");

            System.out.print("Masukkan nilai Dasar Pemrograman: ");
            int nilaiDasPro = raysha.nextInt();
            System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false) : ");
            boolean punyaSertifikat = raysha.nextBoolean();

            if (nilaiDasPro >= minNilaiDasPro || punyaSertifikat) {
                System.out.println("Tahap 2 lolos: memenuhi syarat nilai atau sertifikat");

                System.out.println("Mahasiswa dipanggil untuk mengikuti wawancara");
                System.out.print("Masukkan nilai wawancara: ");
                int nilaiWawancara = raysha.nextInt();

                if (nilaiWawancara >= minNilaiWawancara) {
                    System.out.println("SELAMAT! Mahasiswa DITERIMA sebagai asisten praktikum");
                } else {
                    System.out.println("Gagal di tahap wawancara: nilai wawancara " + nilaiWawancara
                            + " kurang dari minimal " + minNilaiWawancara);
                }
            } else {
                System.out.println("Gagal di tahap 2: nilai Dasar Pemrograman " + nilaiDasPro
                        + " kurang dari minimal " + minNilaiDasPro
                        + " dan tidak memiliki sertifikat kompetensi pemrograman");
            }
        } else {
            if (!aktif && sedangSanksi) {
                System.out.println("Gagal di tahap 1: mahasiswa tidak aktif dan sedang mendapat sanksi akademik");
            } else if (!aktif) {
                System.out.println("Gagal di tahap 1: mahasiswa tidak berstatus aktif");
            } else {
                System.out.println("Gagal di tahap 1: mahasiswa sedang mendapat sanksi akademik");
            }
        }

        raysha.close();
    }
}