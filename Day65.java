
package ISC100days;

import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
        //membuat variabel kosong untuk menampung tinggi yang akan di input oleh uses
        int tinggi;
        //Scanner yang di gunakan untuk menginput jumlah baris/tinggi dari user
        Scanner ab = new Scanner (System.in);
        System.out.println("masukkan jumlah baris/tinggi : ");
        tinggi=ab.nextInt();
        //perulangan for untuk mencetak angka 5 yang akan bersusun kebawah
        for (int baris = 1; baris <= tinggi; baris++) {
            for (int spasi = 1; spasi > baris; spasi++) {
                System.out.println(" ");
                
            }
            for (int angka = tinggi; angka >= baris; angka--) {
                System.out.print("5 ");
                
            }
            System.out.println();
        }
    }
    
    
    
}
