package ISC100days;

import java.util.Scanner;

public class Day79 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta user untuk memasukkan nilai batas atas
        System.out.print("Masukkan nilai batas atas: ");

        // Membaca nilai batas atas yang dimasukkan oleh pengguna
        int batasAtas = input.nextInt();

        // Menampilkan pesan yang memberi tahu bahwa program akan menampilkan angka yang habis dibagi 3 dan 7
        System.out.println("Angka-angka yang habis dibagi 3 dan 7:");

        // Loop for untuk mengiterasi melalui angka mulai dari 1 hingga nilai batas atas
        for (int i = 1; i <= batasAtas; i++) {
            // Mengecek apakah nilai saat ini (i) habis dibagi 3 dan 7
            if (i % 3 == 0 && i % 7 == 0) {
                // Jika habis dibagi 3 dan 7, mencetak nilai tersebut
                System.out.println(i);
            }
        }

        // Menutup objek Scanner untuk menghindari resource leak
        input.close();
    }
}
