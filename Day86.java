package ISC100days;

import java.util.Scanner;

public class Day86 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Menampilkan pesan tentang piramida bintang
        System.out.println("Piramida Bintang");
        System.out.println("====================================");
        System.out.println();

        // Deklarasi variabel untuk tinggi segitiga dan variabel looping (i, j, k)
        int tinggiSegitiga, i, j, k;

        // Meminta pengguna untuk memasukkan tinggi segitiga
        System.out.print("Input tinggi segitiga: ");
        tinggiSegitiga = input.nextInt();

        System.out.println();

        // Looping untuk menghasilkan pola piramida bintang
        for (i = 1; i <= tinggiSegitiga; i++) {

            // Looping untuk menambahkan spasi pada setiap baris
            for (j = 1; j <= tinggiSegitiga - i; j++) {
                System.out.print(" ");
            }

            // Looping untuk menambahkan bintang pada setiap baris
            for (k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            
            // Pindah ke baris berikutnya setelah satu baris selesai
            System.out.println();
        }
    }
}
