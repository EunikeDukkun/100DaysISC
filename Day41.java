package ISC100days;

import java.util.Scanner;

public class Day41 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai awal: ");
        int nilaiAwal = sc.nextInt();
        System.out.print("masukkan nilai akhir : ");
        int bilangangenap = 0, bilanganganjil = 0;
        int nilaiAkhir = sc.nextInt();
        for (int i = nilaiAwal; i <= nilaiAkhir; i++) {
            if (i % 2 == 0) {
                bilangangenap += i;
            } else {
                bilanganganjil += i;
            }
        }
        System.out.println(bilangangenap);
        System.out.println(bilanganganjil);

    }
}
