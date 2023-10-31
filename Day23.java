package ISC100days;

import java.util.Scanner;

public class Day23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        int bilangan = input.nextInt();
        int faktorial = 1;
        for (int i = 1; i <= bilangan; i++) {
            faktorial = faktorial * i;
        }
        System.out.println("Faktorial dari " + bilangan + " adalah " + faktorial);
    }
}
