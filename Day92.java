package ISC100days; 

import java.util.ArrayList; 
import java.util.Scanner; 

public class Day92 {

    public static void main(String[] args) {
        // Membuat objek ArrayList bernama 'nilai' yang akan menyimpan nilai integer
        ArrayList<Integer> nilai = new ArrayList();

        // Membuat variabel 'jumlah' untuk menyimpan total nilai yang dimasukkan
        int jumlah = 0;

        // Melakukan iterasi sebanyak 10 kali untuk meminta pengguna memasukkan angka
        for (int i = 0; i < 10; i++) {
            // Membuat objek Scanner untuk membaca input dari pengguna
            Scanner sc = new Scanner(System.in);

            // Menampilkan pesan untuk meminta pengguna memasukkan angka
            System.out.println("masukkan angka : ");

            // Membaca angka yang dimasukkan pengguna dan menyimpannya dalam variabel 'angka'
            int angka = sc.nextInt();

            // Menambahkan angka ke dalam ArrayList 'nilai'
            nilai.add(angka);

            // Menambahkan angka ke dalam variabel 'jumlah' untuk menghitung total nilai
            jumlah += angka;
        }
    }
}
