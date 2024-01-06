package ISC100days;

import java.util.Scanner;

public class Day90 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan penghasilan : ");
        int penghasilan = sc.nextInt();
        System.out.println("masukkan jenis pekerjaan : ");
        int jenispekerjaan = sc.nextInt();
        int gajibersih, pajak;
        int penghasilanminimal1 = 3_000_000;
        int penghasilanminimal2 = 5_000_000;
        if (penghasilan <= penghasilanminimal1) {
            pajak = penghasilan * 5 / 100;
        } else if (penghasilan <= penghasilanminimal2) {
            pajak = penghasilan * 10 / 100;

       
        }
    }
}
