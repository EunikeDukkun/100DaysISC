package ISC100days;

import java.util.Scanner;

public class Day36 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long harga_tanah = 300_000; // harga tanah permeter
        System.out.print("Masukan panjang tanah : ");
        int panjang = sc.nextInt();
        System.out.print("Masukan Lebar tanah : ");
        int lebar = sc.nextInt();

        long total = panjang * lebar * harga_tanah;
        System.out.println("otal haarga tanah " + total);

    }
}
