package ISC100days;

import java.util.Scanner;

public class Day40 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int besarGjiBulanan = 5_000_000;
        int pajak;
        int tanpaKeterangan, gajikotor, gajibersih;
        System.out.println("Masukkan jumlah tanpa keterangan : ");
        tanpaKeterangan = sc.nextInt();
        gajikotor = besarGjiBulanan - (25_000 * tanpaKeterangan);
        pajak = besarGjiBulanan * 5 / 100;
        gajibersih = gajikotor - pajak;

        if (tanpaKeterangan > 3) {
            System.out.println("Gaji Kotor : " + gajikotor);
            System.out.println("Gji Bersih : " + gajibersih);
        } else {

            gajibersih = besarGjiBulanan - pajak;
            System.out.println(gajibersih);
        }

    }

}
