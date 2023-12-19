package ISC100days;

import java.util.Scanner;

public class Day72 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Membuat objek Scanner untuk menerima input

        int hargaJualPerMeter = 500_000;  // Menyimpan harga jual per meter tanah

        boolean lanjutkan = true;  // Variabel untuk menentukan apakah ingin melanjutkan atau tidak

        while (lanjutkan) {  // Mulai perulangan while
            System.out.println("Masukkan panjang tanah: ");
            int pTanah = sc.nextInt();  // Input panjang tanah 
            System.out.println("Masukkan lebar tanah: ");
            int lTanah = sc.nextInt();  // Input lebar tanah 
            // variabel yang menampung aritmaatika untuk menghitung harga jual tanah
            int hargajual = pTanah * lTanah * hargaJualPerMeter;

            System.out.println("Harga jual tanah: " + hargajual);  // Menampilkan harga jual tanah

            // Tambahkan logika untuk menentukan apakah ingin melanjutkan atau tidak
            System.out.println("Ingin memasukkan data tanah lagi? (ya/tidak): ");
            sc.nextLine();  // Membersihkan buffer
            String jawaban = sc.nextLine();  // Menerima jawaban dari user

            if (!jawaban.equalsIgnoreCase("ya")) {  // Jika jawaban tidak "ya", maka perulangan akan berkenti begitupun sebaliknya
                lanjutkan = false;
            }
        }
    }
}
