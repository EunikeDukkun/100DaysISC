package ISC100days;

import java.util.Scanner;

public class Day64 {

    public static void main(String[] args) {
        //Scanner untuk menginput jumlah baris/tinggi yang di inginkan untuk segitiga
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan tinggi : ");
        //variabel tinggi yang menyimpan nilai tinggi dari yang di input user
        int tinggi = sc.nextInt();
        //mengatur jumlah baris menggunakan looping for
        for (int baris = 1; baris <= tinggi; baris++) {
            //digunakan untuk mencetak bintang di setiap barisnya
            for (int spasi = 1; spasi > baris; spasi++) {
                System.out.print(" ");
            }
            for (int bintang = tinggi; bintang >= baris; bintang--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
