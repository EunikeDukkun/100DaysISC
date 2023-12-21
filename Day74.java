package ISC100days;

import java.util.Scanner;


public class Day74 {
 
    public static void main(String[] args) {
        
        // Scanner untuk menginput nilai dari user
        Scanner sc = new Scanner(System.in);
        // Menampilkan pesan untuk meminta pengguna memasukkan batas
        System.out.println("masukkan batas : ");
        // Variabel yang menampung nilai "batas" yang diinputkan oleh user
        int batas = sc.nextInt();
        // Perulangan yang menentukan bahwa nilai yang diinput oleh user adalah batas dari baris
        for (int i = 0; i < batas; i++) {
            //perulangan untuk menentukan banyak kolom
            for (int j = 0; j < batas; j++) {
                // Menampilkan karakter '*' tanpa membuat baris baru
                System.out.print("*");
            }
            // Membuat baris baru setelah setiap baris dari perulangan dalam selesai
            System.out.println("");
            
        }
    }
}
