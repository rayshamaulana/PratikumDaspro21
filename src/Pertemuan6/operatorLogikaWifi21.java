package Pertemuan6;

import java.util.Scanner;

public class operatorLogikaWifi21 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);

        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;
 
        System.out.print("Apakah pengguna mahasiswa? (true/false) : ");
        mahasiswa = raysha.nextBoolean();
 
        System.out.print("Apakah pengguna dosen? (true/false): ");
        dosen = raysha.nextBoolean();
 
        System.out.print("Apakah akun sedang diblokir? (true/false) : ");
        akunDiblokir = raysha.nextBoolean();
 
        if ((mahasiswa && dosen) && !akunDiblokir) {
            System.out.println("Akses WiFi diberikan");
        } else {
            System.out.println("Akses WiFi ditolak");
        }

        raysha.close();
    }
}
