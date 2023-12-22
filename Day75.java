package ISC100days;

import java.util.Scanner;

public class Day75 {

    public static void main(String[] args) {
        //program untuk meminta input tiga angka 
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan angka1 :");
        int angka1 = sc.nextInt();
        System.out.println("masukkan angka2 :");
        int angka2 = sc.nextInt();
        System.out.println("masukkan angka3 :");
        int angka3 = sc.nextInt();
        //Percabangan untuk memeriksa apakah angka1 dibagi angka2 menghasilkan bilangan bulat
        //jika ya maka hasil pembagian di kurang 2
        if (angka1 % angka3 == 0) {
            int hasil1 = angka1 / angka2 - 2;
            System.out.println("Hasil" + hasil1);
        }// Jika pecahan saat dibagi angka ketiga, kurangi 2 dari hasilnya
        if ((double) angka1 / angka3 != angka1 / angka3) {
            int hasil = angka1 / angka3 - 2;

            // Menampilkan hasil
            System.out.println("Hasil: " + hasil);
        }

    }

}
