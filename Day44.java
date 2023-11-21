package ISC100days;

import java.util.Scanner;

public class Day44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan nilai awal : ");
        int awal = sc.nextInt();
        System.out.println("masukkan nilai akhir : ");
        int akhir = sc.nextInt();
        for (int i = awal; i < akhir; i++) {
            if (i % 3 == 0) {
                System.out.println(i);

            }
        }

    }

}
