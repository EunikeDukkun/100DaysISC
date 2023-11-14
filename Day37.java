package ISC100days;

import java.util.Scanner;

public class Day37 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai a : ");
        int a = sc.nextInt();
        System.out.println("Masukkan nilai a : ");
        int b = sc.nextInt();

        int p = a + b;

        if (p >= 4) {
            System.out.println(a * b);

        } else {
            System.out.println(a / b);
        }

    }

}
