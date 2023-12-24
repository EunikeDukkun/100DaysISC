
package ISC100days;

import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {
        //Scanner membuat inputan
        Scanner sc = new Scanner (System.in);
        //program yang menapilkan kaliat unutk meminta inputan user
        System.out.println("Masukkan panjang tanah : ");
        //membuat variable panjang tanah bertipe integer yang akan menyimpan nilai yang di input user
        int panjangTanah = sc.nextInt();
        System.out.println("Masukkan lebar tanah : ");
        int lebarTanah = sc.nextInt();
        // Memanggil mathode 'hargaTanah' dengan panjang dan lebar sebagai argumen dan mencetak hasilnya
        System.out.println(hargaTanah(panjangTanah, lebarTanah));
        
    }
    // methode 'hargaTanah' menghitung harga tanah berdasarkan dimensinya
    // methode ini mengambil dua parameter (panjang dan lebar) dan mengembalikan harga yang dihitung sebagai bilangan bulat
    public static int hargaTanah(double panjang, double lebar){
        double Hargapermeter = 5_000_000 ;
        //program untuk menghitung harga tanah (aritmatika)
        double hargaTanah =panjang * lebar * Hargapermeter ;
        //mengonversi hasil ke integer sebelum di return/dikembalikan
        return (int) hargaTanah;
    }
    
    
}
