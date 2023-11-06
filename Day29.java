package ISC100days;

import java.util.Scanner;

public class Day29 {

    public static void main(String[] args) {
        int angka;
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan angka");
        angka = sc.nextInt();
        System.out.println("========Angka yang habis dibagi 3========");

        for (int i = 1; i <= angka; i++) {
            if (i % 3 == 0) {

                System.out.println(i);
            }

        }

    }

}
