package ISC100days;

import java.util.Scanner;

public class Day89 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk mendapatkan input dari pengguna
        Scanner sc = new Scanner(System.in);

        // Mendeklarasikan variabel jumlah dan menginisialisasinya dengan nilai 0
        int jumlah = 0;

        // Memulai loop tak terbatas
        while (true) {
            // Menampilkan pesan untuk meminta pengguna memasukkan angka
            System.out.println("Masukkan angka: ");

            // Membaca angka yang dimasukkan oleh user
            int angka = sc.nextInt();

            // Menampilkan jumlah sejauh ini dan menambahkannya dengan angka yang baru dimasukkan
            System.out.println(jumlah += angka);

            // Memeriksa apakah jumlah telah mencapai atau melebihi 100
            if (jumlah >= 100) {
                // Jika ya, keluar dari loop
                break;
            }
        }
    }
}
