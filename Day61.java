package ISC100days;

import java.util.Scanner;

public class Day61 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari user
        Scanner scanner = new Scanner(System.in);

        // Meminta user untuk memasukkan jumlah elemen array
        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();

        // Membuat array dengan ukuran sesuai input user
        int[] numbers = new int[n];

        // Meminta user untuk memasukkan nilai untuk setiap elemen array
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai untuk elemen ke-" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Menampilkan isi array menggunakan perulangan
        System.out.println("Isi array:");
        for (int i = 0; i < n; i++) {
            System.out.println("Elemen ke-" + (i + 1) + ": " + numbers[i]);
        }

        // Menghitung jumlah elemen array
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }

        // Menampilkan hasil jumlah elemen array
        System.out.println("Jumlah elemen array: " + sum);

        // Menutup objek Scanner
        scanner.close();
    }
}
