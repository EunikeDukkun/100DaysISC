package ISC100days;

import java.util.ArrayList;
import java.util.Scanner;

public class Day58 {

    public static void main(String[] args) {

        //membuat prosram Scanner untuk menginput elemen-elemen ke dalam ArrayList
        Scanner input = new Scanner(System.in);
        //membuat object numbers bertipe Integer dalam ArrayList
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //membuat 3 variabel kosong(n, i, x) bertipe integer
        int n, i, x;
        //meminta inputan user untuk memasukkan berapa jumlah elemen yang akan ditambahkan kedalam variable n
        System.out.print("Masukkan jumlah elemen: ");
        n = input.nextInt();
        //perulangan yang menambahkan elemen sesuai dengan banyak jumlah elemen yang dapat di tampung arraylist 
        //sesuai dengan jumlah yang telah di input di atas
        for (i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            x = input.nextInt();
            //menambahkan elemen dalam variabel x ke dalam numbers
            numbers.add(x);
        }
        //menampilkan semua elemen yang telah dimasukkan kedalam numbers
        System.out.println("\nElemen-elemen yang dimasukkan: " + numbers);
        //program yang menampilkan elemen yang di input yang habis dibagi 2 menggunakan percabangan dan perulangan
        System.out.println("Elemen-elemen yang habis dibagi 2: ");
        for (i = 0; i < n; i++) {
            if (numbers.get(i) % 2 == 0) {
                System.out.println(numbers.get(i));
            }
        }
    }
}
