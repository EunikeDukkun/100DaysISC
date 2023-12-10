package ISC100days;

import java.util.ArrayList;
import java.util.Scanner;

public class Day63 {

    public static void main(String[] args) {
        //membuat variabel jumlah yang menampung nilai 0
        int jumlah = 0;

        //menngunakan Scanner untuk menginput angka yang akan di masukkan
        Scanner sc = new Scanner(System.in);
        //menbuat object bernama "angka" dalam ArrayList
        ArrayList angka = new ArrayList();
        //menggunakan while untuk syarat dari output
        //dimana jika "jumlah" kurang dari 50 maka akan terus berulang untuk meminta inputan angka kemudian
        //menjumlahkannya dengan nilai yang ada sebelumnya
        //jika jumlah angka yang di tambahkan 50 ke atas maka program akan berkenti kemudian menampilkan semua angka  yang telah dimasukkan
        while (jumlah < 50) {
            System.out.println("masukkan nilai: ");
            int input = sc.nextInt();
            angka.add(input);
            jumlah += input;
            System.out.println(jumlah);

        }

        System.out.println(angka);

    }

}
