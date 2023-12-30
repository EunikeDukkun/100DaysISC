package ISC100days;

import java.util.Scanner;

public class Day83 {

    public static void main(String[] args) {
        //scanner untuk menggunakan inputan
        Scanner sc = new Scanner(System.in);
        //program untuk menampilkan pesan yang meminta memasukkan nilai awal 
        System.out.println("masukkan nilai awal: ");
        //membuat variabel bertipe integer yang akan menyimpan nilai awal yg d masukkan user
        int nilaiAwal = sc.nextInt();
        System.out.println("masukkan nilai akhir : ");
        int nilaiAkhir = sc.nextInt();

        //membuat  variabel bertipe integer untuk menampung nilai yang sesua kondisi
        int bilangangenap = 0, bilanganganjil = 0;

        //perulangan untuk bilangan genap dan ganjil
        for (int i = nilaiAwal; i <= nilaiAkhir; i++) {
            if (i % 2 == 0) {
                bilangangenap += i;
            } else {
                bilanganganjil += i;
            }
        }
        //menampilkan jumlah bilangan genap setelah di jumlahkan
        System.out.println(bilangangenap);
        //menampilkan bilangan ganjil setelah di jumlahkan
        System.out.println(bilanganganjil);

    }

}
