package ISC100days;

import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {
        //Scanner untuk menggunakapan inputan
        Scanner sc = new Scanner (System.in);
        System.out.println("Masukkan Batas : ");
        //membuat variabel batas bertipe integerr
        int batas = sc.nextInt();
        //perulangan untuk menampilkan nilai sesuai bata 
        // i +=2 menamdakan bawha hanya yg akan di tampilan ini adalah bilangan ganjil dari batas yang sudah ditentukan
        for (int i = 1; i < batas; i += 2) {
            System.out.println(i +" ");
        }
    }
    
    
}
