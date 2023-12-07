package ISC100days;

// Import kelas Scanner
import java.util.Scanner;

// Deklarasi kelas utama
public class Day60 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari user
        Scanner sc = new Scanner(System.in);

        // Inisialisasi variabel "nilai" dengan nilai awal 0
        int nilai = 0;

        //menampilkan perintah yang meminta pengguna memasukkan nilai
        System.out.println("Masukkan nilai : ");

        // Menggunakan Scanner untuk membaca nilai yang dimasukkan oleh pengguna dan menyimpannya dalam variabel nilai
        nilai = sc.nextInt();

        // Membuat array integer dengan panjang 10
        int[] arr = new int[10];

        // Menggunakan perulangan for untuk mengisi setiap elemen array dengan nilai yang dihasilkan dari penjumlahan indeks dan nilai yang dimasukkan pengguna
        for (int i = 0; i < 10; i++) {
            arr[i] = i + nilai;
        }

        System.out.println("Hasil : ");

        // Menggunakan perulangan for untuk mencetak setiap elemen array ke layar
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
