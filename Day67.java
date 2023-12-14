package ISC100days;

import java.util.Scanner;

public class Day67 {

    public static void main(String[] args) {

        //Sccanner digunakan untuk menginpu angka atau bilangan yang akan di cari faktorialnya
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        //fariabel angka untuk menampung angka yang di input oleh user
        int angka = input.nextInt();
        //membuat variabel faktorial yang bernilaii 1
        int faktorial = 1;
        //perulangan for untuk menghitung nilai faktorial
        for (int i = 1; i <= angka; i++) {
            faktorial = faktorial * i;
        }
        //menampilkan hasil dari faktorial bilangan yan gdi input
        System.out.println("Faktorial dari " + angka + " adalah " + faktorial);
    }
}
