package ISC100days;

import java.util.ArrayList;
import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        int jumlah = 0;

        Scanner sc = new Scanner(System.in);
        ArrayList a = new ArrayList();
        while (jumlah < 100) {
            System.out.println("masukkan nilai: ");
            int input = sc.nextInt();
            a.add(input);
            jumlah += input;
            System.out.println(jumlah);

        }

        System.out.println(a);

    }

}
