package ISC100days;

import java.util.Scanner;

public class Day7 {

    public static void main(String[] args) {
        //PERCABANGAN

        //Percabangan IF
        //membuat variabel belanja dan scanner
        int belanja = 0;
        Scanner a = new Scanner(System.in);

        //mengambil input
        System.out.println("Total Belanja: Rp ");
        belanja = a.nextInt();

        //cek apakah dian belanja di atas 10000
        if (belanja > 10000) {
            System.out.println("Selamat anda mendapatkan hadiah!");
        }

        System.out.println("Terima Kasih...");

        //Percabangan IF/ELSE
        //membuat variabel Scanner
        int nilai;
        String nama;
        Scanner ab = new Scanner(System.in);

        //Mengambil Input
        System.out.println("Nama : ");
        nama = ab.nextLine();
        System.out.println("Nilai: ");
        nilai = ab.nextInt();

        //cek nilai 
        if (nilai >= 70) {
            System.out.println("Baik");
        } else {
            System.out.println("Nilai Anda Tidak Mencukupi");
        }

        //Percabangan IF/ELSE/IF atau SWITCH/CASE
        if (nilai > 85) {
            System.out.println("A");
        } else if (nilai > 75) {
            System.out.println("B");
        } else if (nilai >= 55) {
            System.out.println("C");
        } else {
            System.out.println("E");
        }
    }

}
