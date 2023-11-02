package ISC100days;

import java.util.Scanner;

public class Day25 {

    public static void main(String[] args) {
        // menghitung luas lingkaran
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double jari_jari = input.nextDouble();

        double pi = 3.14;
        double luas = pi * jari_jari * jari_jari;

        System.out.println("Luas lingkaran = " + luas);
    }

}
