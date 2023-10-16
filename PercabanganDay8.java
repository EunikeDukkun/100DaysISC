package ISC100days;

import java.util.Scanner;

public class PercabanganDay8 {

    public static void main(String[] args) {
        //PERCABANGAN (PERBAIKAN)

        //Percabangan IF
        // Membuat variabel belanja dan scanner
        int belanja = 0;
        Scanner a = new Scanner(System.in);

        // Mengambil input
        System.out.print("Total Belanja: Rp "); // Ubah println menjadi print
        belanja = a.nextInt();

        // Cek apakah total belanja di atas 10000
        if (belanja > 10000) {
            System.out.println("Selamat anda mendapatkan hadiah!");
        } // Tambahkan else jika belanja <= 10000
        else {
            System.out.println("Terima Kasih...");
        }

        // Percabangan IF/ELSE
        // Membuat variabel Scanner
        int nilai;
        String nama;
        Scanner ab = new Scanner(System.in);

        // Mengambil input
        System.out.print("Nama : "); // Ubah println menjadi print
        nama = ab.nextLine();
        System.out.print("Nilai: "); // Ubah println menjadi print
        nilai = ab.nextInt();

        // Cek nilai
        if (nilai >= 70) {
            System.out.println("Baik");
        } else {
            System.out.println("Nilai Anda Tidak Mencukupi");
        }

        // Percabangan IF/ELSE IF atau SWITCH/CASE
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
