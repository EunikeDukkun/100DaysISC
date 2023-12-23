package ISC100days;

import java.util.Scanner;

public class Day76 {

    public static void main(String[] args) {
        //Scanner untuk menggunakan inputan user
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Nilai : ");
        //membuat variabel nilai bertipe integer yang akan menyimpan nilai yang akan di inputkan oleh user
        int nilai = sc.nextInt();
        //percabangan untuk menentukan nilai sesuai dengan nilai yang di inputkan
        //mengguankan logika and 
        if (nilai >= 90 && nilai <= 100) {
            System.out.println("Grade A");
        } else if (nilai >= 80 && nilai <= 89) {
            System.out.println("Grade B+");
        } else if (nilai >= 70 && nilai <= 79) {
            System.out.println("Grade B");
        } else if (nilai >= 60 && nilai <= 69) {
            System.out.println("Grade C+");
        } else if (nilai >= 50 && nilai <= 59) {
            System.out.println("Grade C");
        } else if (nilai >= 40 && nilai <= 49) {
            System.out.println("Grade D");
        } else {
            System.out.println("E");
        }

    }

}
