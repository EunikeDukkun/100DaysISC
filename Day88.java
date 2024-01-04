
import java.util.Scanner;

public class Day88 {

    public static void main(String[] args) {

        // Membuat objek Scanner untuk membaca input dari pengguna.
        Scanner sc = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nilai awal.
        System.out.println("Masukkan nilai awal: ");
        
        // Menggunakan nama variabel yang lebih deskriptif.
        int nilaiAwal = sc.nextInt();

        // Meminta pengguna untuk memasukkan nilai akhir.
        System.out.println("Masukkan nilai akhir: ");
        
        // Menggunakan nama variabel yang lebih deskriptif.
        int nilaiAkhir = sc.nextInt();

        // Melakukan iterasi dari nilai awal hingga nilai akhir.
        for (int i = nilaiAwal; i <= nilaiAkhir; i++) {
            // Memeriksa apakah angka habis dibagi 3 atau 7.
            if (i % 3 == 0 || i % 7 == 0) {
                // Menampilkan angka yang memenuhi kondisi.
                System.out.println(i);
            }
        }
    }
}
