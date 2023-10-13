package ISC100days;

import java.util.Scanner;

public class Day5 {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        //Operator Aritmatika
        int d, e;
        int a = 10;
        int b = 5;

        //Operator Penjumlahan
        System.out.println(a + b);

        //Operator Pengurangan
        System.out.println(a - b);

        //meminta inputan user untuk memasukkan nilai d dan e
        System.out.println("masukkan nilai d :");
        d = c.nextInt();
        System.out.println("masukkan nilai e :");
        e = c.nextInt();

        //Operator pembagian
        System.out.println(d / e);

        //operator perkalian
        System.out.println(d * e);

        //operator sisa bagi
        System.out.println(a % b);

        //operator++ (menambah nilai sejumlah 1)
        a++;
        System.out.println(a);
        
        a++;
        System.out.println(a);
        
        b++;
        System.out.println(b);

        //operator --(mengurangi nilai sejumlah 1)
        a--;
        System.out.println(a);
        
         a--;
        System.out.println(a);
        
        b--;
        System.out.println(b);

    }

}
