package ISC100days;

import java.util.Scanner;

public class Day87 {

    public static void main(String args[]) {

        // Membuat objek Scanner dengan nama input untuk membaca input dari pengguna melalui keyboard.
        Scanner input = new Scanner(System.in);

        // Mencetak string "Membuat Deret Angka" di konsol, memberikan judul atau informasi awal kepada pengguna.
        System.out.println("Membuat Deret Angka");

        // Mencetak garis pemisah atau pemformatan untuk memberikan tampilan yang lebih rapi pada output.
        System.out.println("========================================");

        // Mencetak baris kosong untuk memberikan spasi pada tampilan output.
        System.out.println();

        // Mendeklarasikan dua variabel bertipe integer, 
        // jumlah_deret untuk menyimpan jumlah deret yang diinginkan 
        // dan i sebagai variabel iterator dalam loop.
        int jumlah_deret, i;

        // Mencetak prompt untuk meminta pengguna memasukkan jumlah deret yang diinginkan.
        System.out.print("Jumlah deret yang diinginkan: ");

        // Membaca input dari pengguna dan menyimpannya dalam variabel jumlah_deret.
        jumlah_deret = input.nextInt();

        // Mencetak baris kosong untuk memberikan spasi pada tampilan output.
        System.out.println();

        // Memulai struktur loop for yang akan mencetak deret angka dari 1 hingga jumlah deret yang diinginkan.
        for (i = 1; i <= jumlah_deret; i++) {
            // Mencetak nilai iterator i diikuti oleh spasi, membentuk deret angka secara horizontal.
            System.out.print(i + " ");
        }

        // Mencetak baris kosong setelah loop untuk membentuk deret angka dalam bentuk vertikal.
        System.out.println();
    }
}
