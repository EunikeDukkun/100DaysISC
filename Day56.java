package ISC100days;

import java.util.ArrayList;
import java.util.Scanner;

public class Day56 {

    public static void main(String[] args) {
        int jumlah = 0;

        //mengimput nilai menggunakan Scanner
        Scanner a = new Scanner(System.in);
        //membuat object b dalam Array List
        ArrayList b = new ArrayList();
        //membuat perulangan while untuk menentukan nilai yang akan di input 
        while (jumlah < 50) {
            //program yan gmeminta inputan nilai
            System.out.println("masukkan nilai: ");
            int input = a.nextInt();
            b.add(input);
            //program yang menjumlahkan nilai pyang sudah di tambahkan sebelumnya dengan nilai yang barudi input
            jumlah += input;
            System.out.println(jumlah);

        }

        System.out.println(a);

    }

}
