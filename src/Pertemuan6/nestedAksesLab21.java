package Pertemuan6;

import java.util.Scanner;

public class nestedAksesLab21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);

        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;
 
        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = raysha.nextBoolean();
 
        System.out.print("Apakah mahasiswa sedang disanksi? (true/false): ");
        sedangDisanksi = raysha.nextBoolean();
 
        System.out.print("Apakah mahasiswa punya izin dosen? (true/false): ");
        punyaIzinDosen = raysha.nextBoolean();
 
        System.out.print("Apakah mahasiswa asisten lab? (true/false): ");
        asistenLab = raysha.nextBoolean();
 
        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }

        raysha.close();
    }
}

