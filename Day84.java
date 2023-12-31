package ISC100days;

import java.util.ArrayList;
import java.util.Scanner;

public class Day84 {

    public static void main(String[] args) {

        // Inisialisasi ArrayList untuk menyimpan nilai angka
        ArrayList<Integer> nilai = new ArrayList<>();
        
        // Variabel untuk menyimpan jumlah total yang bertipe integer
        int jumlah = 0;

        // Membuat objek Scanner untuk inputan
        Scanner sc = new Scanner(System.in);

        // Loop untuk meminta input angka sebanyak 10 kali
        for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan angka : ");
            
            // Mengambil input dari user
            int angka = sc.nextInt();
            
            // Menambahkan angka ke dalam ArrayList
            nilai.add(angka);
            
            // Menambahkan angka ke dalam jumlah total
            jumlah += angka;
        }

        // Menampilkan nilai yang dimasukkan dan jumlah total
        System.out.println("Nilai: " + nilai);
        System.out.println("Jumlah: " + jumlah);

        // Menambahkan angka 1 ke dalam ArrayList setelah perulangan selesai
        nilai.add(1);
        System.out.println("Nilai setelah menambahkan 1: " + nilai);

        // Menutup Scanner 
        sc.close();
    }
}
