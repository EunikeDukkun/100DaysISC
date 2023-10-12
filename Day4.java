package ISC100days;

import java.util.Scanner;

public class Day4 {

    public static void main(String[] args) {
        String nama, kelas;
        int angkatan, usia;

        Scanner a = new Scanner(System.in);

        System.out.println("Nama : ");
        nama = a.nextLine();

        System.out.println("Kelas : ");
        kelas = a.nextLine();

        System.out.println("Angkatan : ");
        angkatan = a.nextInt();

        System.out.println("Usia : ");
        usia = a.nextInt();

    }

}
