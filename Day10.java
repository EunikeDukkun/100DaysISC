package ISC100days;

import java.util.Scanner;

public class Day10 {

    public static void main(String[] args) {

        // Deklarasi variabel
        int golongan;
        int lamaKerja;
        int gajiPokok;
        int bonus;
        int totalGaji;

        // Input data
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan golongan karyawan: ");
        golongan = input.nextInt();
        System.out.println("Masukkan lama kerja karyawan (tahun): ");
        lamaKerja = input.nextInt();

        // Hitung gaji pokok
        switch (golongan) {
            case 1:
                gajiPokok = 4000000;
                break;
            case 2:
                gajiPokok = 7000000;
                break;
            case 3:
                gajiPokok = 10000000;
                break;
            default:
                System.out.println("Golongan yang dimasukkan tidak valid!");
                return;
        }

        // Hitung bonus
        if (lamaKerja > 5) {
            bonus = 100000 * lamaKerja;
        } else {
            bonus = 0;
        }

        // Hitung total gaji
        totalGaji = gajiPokok + bonus;

        // Output hasil
        System.out.println("Gaji pokok karyawan: Rp" + gajiPokok);
        System.out.println("Bonus karyawan: Rp" + bonus);
        System.out.println("Total gaji karyawan: Rp" + totalGaji);
    }
}


