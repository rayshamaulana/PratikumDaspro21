package Pertemuan7;

import java.util.Scanner;
 
public class StudiKasus221 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
 
        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumen, peringkatJuara, statusPendanaan;
        int kurang;
 
        System.out.print("Nama mahasiswa : ");
        namaMahasiswa = raysha.nextLine();
 
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegiatan = raysha.nextLine();
 
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
            jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
 
            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = raysha.nextInt();
 
            System.out.print("Peringkat juara : ");
            peringkatJuara = raysha.nextInt();
 
            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan.");
                } else {
                    kurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }
 
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
 
            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = raysha.nextInt();
 
            System.out.print("Status pendanaan PKM (1=lolos, 0=tidak lolos) : ");
            statusPendanaan = raysha.nextInt();
 
            if (statusPendanaan == 1) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                } else {
                    kurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
            }
 
        } else {
            System.out.println("Status : Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
        }
        raysha.close();
    }
}