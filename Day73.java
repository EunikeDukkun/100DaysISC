package ISC100days;

import java.util.Scanner;

public class Day73 {

    public static void main(String[] args) {
        //Scanner digunakan untuk menginput
        Scanner sc = new Scanner(System.in);
        //menampilkan perintah yang meminta user untuk memasukkan nilai batas awal
        System.out.println("masukkan nilai awal : ");
        //membuat variabel awal bertipe integer yang akan menampung nilai yang di input user
        int awal = sc.nextInt();
        //menampilkan perintah yang meminta user untuk memasukkan nilai batas ahir
        System.out.println("nilai akhir : ");
        //membuat variabel awal bertipe integer yang akan menampung nilai yang di input user
        int ahir = sc.nextInt();
        //program untuk memasukkan variabel awal dan ahir ke dalam perulangan
        for (int i = awal; i <= ahir; i++) {
            //jika i habis di bagi 2 == 0 maka yang akan ditampilkan itu bilangan genap 
            if (i % 2 == 0) {
                System.out.println(i + "Bilangan Genap");
                //jika 2 =!= 0 maka yang akan ditampilkan itu bilangan genap 
            } else {
                System.out.println(i + "Bilangan Ganjil");
            }
            //menampilkan hasil
            System.out.println(i);

        }
    }

}
