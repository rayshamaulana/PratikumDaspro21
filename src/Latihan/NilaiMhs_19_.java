package Latihan;
import java.util.Scanner;
public class NilaiMhs_19_ {
    public static void main(String[] args) {
        Scanner ariqINT = new Scanner (System.in);
        Scanner ariqSTRING = new Scanner (System.in);

        String namaMHS,isi;
        int jumlahLulus=0,jumlahTdkLulus=0,jumlahMHS=0;

        do {
            System.out.print("Ingin mengisi nilai mahasiswa (y/t)");

            isi=ariqSTRING.nextLine();
            if (isi.equalsIgnoreCase("t")) {
                break;
            }
            jumlahMHS++;
            System.out.print("Masukkan nama : ");
            namaMHS=ariqSTRING.nextLine();

            double rataTugas=0,NAflat=0;
            

            while (true) {
                int kumpulTugas=0;
                int kuis=0,uts=0,uas=0,tugas1=0,tugas2=0;
                System.out.println("Masukkan nilai kuis ");
                kuis=ariqINT.nextInt();
                NAflat+=kuis*0.35;
                System.out.println("Masukkan nilai uts ");
                uts=ariqINT.nextInt();
                NAflat+=uts*0.15;
                System.out.println("Masukkan nilai uas ");
                uas=ariqINT.nextInt();
                NAflat+=uas*0.3;
                do {
                    System.out.println("Masukkan nilai tugas 1 ");
                    tugas1=ariqINT.nextInt();
                    if (tugas1<0||tugas1>100) {
                        System.out.println("ulangi input");
                    }
                    kumpulTugas+=tugas1;
                } while (tugas1<0||tugas1>100);
                do {
                    
                    System.out.println("Masukkan nilai tugas 2 ");
                    tugas2=ariqINT.nextInt();
                    if (tugas2<0||tugas2>100) {
                        System.out.println("ulangi input");
                    }
                    kumpulTugas+=tugas2;
                } while (tugas2<0||tugas2>100);
                rataTugas=kumpulTugas/2;
                NAflat+=rataTugas*0.2;
                    if (NAflat>50) {
                        System.out.println("Lulus");
                        jumlahLulus++;
                    }else{
                        System.out.println("Tidak lulus");
                        jumlahTdkLulus++;
                    }
                    
                    System.out.println("Rata rata tugas "+namaMHS+rataTugas);
                    System.out.println("Rata semua nilai : "+NAflat);
                    break;
            }

        } while (isi.equalsIgnoreCase("y"));
        System.out.println("Jumlah mahasiswa : "+jumlahMHS);
        System.out.println("Jumlah lulus :"+jumlahLulus);
        System.out.println("Jumlah tidak lulus : "+jumlahTdkLulus);
        ariqINT.close();
        ariqSTRING.close();
    }
}