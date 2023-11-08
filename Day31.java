package ISC100days;

import java.util.Scanner;

public class Day31 {

    public static void main(String[] args) {

        // Deret Aritmatika
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            sum += i;

            if (i < n) {
                System.out.print(" + ");
            }
        }

        System.out.println(" = " + sum);
    }
}
