package ISC100days;

import java.util.Scanner;

public class Day6 {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        //JENIS-JENIS OPERATOR PADA JAVA

        //===Operator Aritmatika===
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
        //operator --(mengurangi nilai sejumlah 1)
        a--;
        System.out.println(a);

        //===Operator Penugasan===
        // Pengisian nilai
        a = 5;
        b = 10;

        //Penjumlahan(+=)
        b += a;
        // sekarang b = 15
        System.out.println("Penjumlahan : " + b);

        //Pengurangan(-=)
        b -= a;
        // sekarang b = 10 (karena 15-5)
        System.out.println("Pengurangan : " + b);

        //Perkalian(*=)
        b *= a;
        // sekarang b = 50 (karena 10*5)
        System.out.println("Perkalian : " + b);

        //Pembagian(/=)
        b /= a;
        // sekarang b=10
        System.out.println("Pembagian : " + b);

        //Sisa Bagi(%=)
        b %= a;
        // sekarang b=0
        System.out.println("Sisa Bagi: " + b);

        //Sama Dengan(=)
        //And(&=)
        //OR(|=)
        //XOR(^=)
        //right shift(>>=)
        //Left shift(<<=)
        //===Operator Pembanding===
        boolean hasil;

        //Sama dengan(==)
        hasil = a == b;
        System.out.println(hasil);
        //Lebih Besar(>)
        hasil = a > b;
        System.out.println(hasil);
        //Lebih Kecil(<)
        hasil = a < b;
        System.out.println(hasil);
        //Tidak Sama Dengan(!=)
        hasil = a != b;
        System.out.println(hasil);
        //Lebih Besar Sama Dengan(>=)
        hasil = a >= b;
        System.out.println(hasil);
        //Lebih Kecil Sama Dengan(<=)
        hasil = a <= b;
        System.out.println(hasil);

        //===Operator Logika===
        boolean ab = true;
        boolean ba = false;
        boolean cc;

        //konjungsi(dan)
        cc = ab && ba;
        System.out.println("True and False = " + cc);
        //disjungsi(or)
        cc = ab || ba;
        System.out.println("true || false : " + cc);
        // negasi(not)
        System.out.println("Negasi, !true = " + !ab);

        //===Operator Bitwise===
        int ddd = 0;

        //Negasi/Not(~)
        ddd = ~a;
        System.out.println("~a = " + ddd);
        //operasi bit XOR (^)
        ddd = a ^ b;
        System.out.println("a ^ b = " + ddd);
        //operasi bit And (&)
        ddd = a & b;
        System.out.println("a & b = " + ddd);
        //Right shift (>>)
        ddd = a >> b;
        System.out.println("a >> b = " + ddd);
        //Left Shift(<<)
        ddd = a << b;
        System.out.println("a << b = " + ddd);
        //or(|)
        ddd = a | b;
        System.out.println("a | b = " + ddd);

        //===Operator Ternary===
        boolean Informatika = true;
        String Jawaban;

        Jawaban = Informatika ? "iya" : "tidak";
        System.out.println(Jawaban);

    }

}
