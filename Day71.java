package ISC100days;

import java.util.Scanner;

public class Day71 {

    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);

        // Meminta input dari user
        System.out.print("Masukkan angka: ");
        int number = isc.nextInt();

        // Melakukan perulangan untuk mengecek apakah angka tersebut genap atau ganjil
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap");
            } else {
                System.out.println(i + " adalah bilangan ganjil");
            }
        }

        // Menutup objek Scanner
        isc.close();
    }
}
