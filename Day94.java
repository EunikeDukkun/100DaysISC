package ISC100days;

import java.util.Scanner;

public class Day94 {

    public static void main(String[] args) {
        // Deklarasi variabel untuk menyimpan nilai ujian (integer)
        int nilaiUjian;

        // Deklarasi variabel untuk menyimpan nama siswa (String)
        String nama;

        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner scan = new Scanner(System.in);

        // Meminta input nama siswa dan menyimpannya ke variabel nama
        System.out.print("Masukkan nama: ");
        nama = scan.nextLine();

        // Meminta input nilai ujian dan menyimpannya ke variabel nilaiUjian
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = scan.nextInt();

        // Menggunakan percabangan if untuk menentukan kelulusan berdasarkan nilai ujian
        if (nilaiUjian >= 70) {
            // Jika nilai ujian >= 70, cetak pesan kelulusan dengan nama siswa
            System.out.println("Selamat, " + nama + " telah lulus ujian!");
        } else {
            // Jika nilai ujian < 70, cetak pesan belum lulus dengan nama siswa
            System.out.println("Maaf, " + nama + " belum lulus ujian.");
        }

        // Perulangan for untuk mencetak bilangan genap dari 1 hingga 10
        System.out.println("Bilangan genap dari 1 hingga 10:");
        for (int i = 2; i <= 10; i += 2) {
            // Cetak setiap bilangan genap dalam perulangan
            System.out.println(i);
        }
    }
}
