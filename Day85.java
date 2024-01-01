package ISC100days;

import java.util.Scanner;

public class Day85 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan angka :");
        //membuat variabel angka beripe inegrer
        int angka = sc.nextInt();
        //percabangan yang meneukan nilai anga habis dibagi 4 dan 5
        if (angka % 3 == 0 && angka % 5 == 0) {
            System.out.println("Master Class");
        } else if (angka % 5 == 0) {//jika angka ang dimasukkan habis di bagi 3 5
            System.out.println("pride of 5");//maka akan menampilkan pesan yang ada dalam string

        } else if (angka % 3 == 0) {//jika angka ang dimasukkan habis di bagi 3 
            System.out.println("pride of 3");//maka akan menampilkan pesan yang ada dalam string

        }
    }

}
