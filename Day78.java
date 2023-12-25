package ISC100days;

import java.util.ArrayList;
import java.util.Scanner;

public class Day78 {

    public static void main(String[] args) {
        //membuat variable yang di inisialisasi dengan nilai nol untuk menyimpan 
        //hasil penjumlahan dari setiap nilai yang di input
        int jumlah = 0;
        //Program untuk menggunakan inputan user
        Scanner sc = new Scanner(System.in);
        //membuat objek a arrayList
        ArrayList a = new ArrayList();
        //perulangan untuk menentukan batas dari hasil penjulahan
        //jadi selama kondisi belum terpenuhi maka program akan terus meminta inputan user
        while (jumlah < 100) {
            System.out.println("masukkan nilai: ");
            int input = sc.nextInt();
            a.add(input + " + ");
            //program untuk mengembalikan nilai yang di input kemudian d tambahkan degnan nilai yang
            //sudah ada sebelumnya
            jumlah += input;
            System.out.println(jumlah);
            System.out.println(a);
        }

    }

}
