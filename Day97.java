
package ISC100days;

import java.util.Scanner;

public class Day97 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan bilangan bulat
        System.out.print("Masukkan sebuah bilangan bulat: ");
        int bilangan = input.nextInt();

        // Memeriksa apakah bilangan tersebut genap atau ganjil
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }
    }
    
}
