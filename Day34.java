package ISC100days;

import java.util.Scanner;

public class Day34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan nilai a : ");
        int a = sc.nextInt();
        System.out.println("masukkan nilai b : ");
        int b = sc.nextInt();

        int c = a + b;

        if (c % 2 == 0) {
            System.out.println(c + 1);
        }
        if (c % 2 != 0) {
            System.out.println(c + 2);

        }

    }

}
