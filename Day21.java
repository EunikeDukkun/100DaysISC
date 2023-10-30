<<<<<<< HEAD
package ISC100days;

import java.util.Scanner;

public class Day21 {

    public static void main(String[] args) {

        // membuat variabel dan scanner
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Inputkan nilai: ");
        nilai = scan.nextInt();

        // higung gradenya
        if (nilai >= 90 && nilai <= 100) {
            grade = "A";
        } else if (nilai >= 80 && nilai < 90) {
            grade = "B+";
        } else if (nilai >= 70 && nilai < 80) {
            grade = "B";
        } else if (nilai >= 60 && nilai < 70) {
            grade = "C+";
        } else if (nilai >= 50 && nilai < 60) {
            grade = "C";
        } else if (nilai >= 40 && nilai < 50) {
            grade = "D";
        } 
        else if (nilai > 100 ) {
            grade = "tidak ada nilai " + nilai;
        } else {
            grade = "E";
        }

        // cetak hasilnya
        System.out.println("Grade: " + grade);
    }
}


=======
package ISC100days;

import java.util.Scanner;

public class Day21 {

    public static void main(String[] args) {

        // membuat variabel dan scanner
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Inputkan nilai: ");
        nilai = scan.nextInt();

        // higung gradenya
        if (nilai >= 90) {
            grade = "A";
        } else if (nilai >= 80) {
            grade = "B+";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 60) {
            grade = "C+";
        } else if (nilai >= 50) {
            grade = "C";
        } else if (nilai >= 40) {
            grade = "D";
        } else {
            grade = "E";
        }

        // cetak hasilnya
        System.out.println("Grade: " + grade);
    }
}


>>>>>>> 39245ca653f72c71c50075e3d1abb7f2df586c39
