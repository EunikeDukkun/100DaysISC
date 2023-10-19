package ISC100days;

import java.util.Scanner;

public class Day11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] menu = {"Gado-gado", "Seblak", "Nasi + Ayam Geprek", "Bakso Urat"};
        int[] harga = {10000, 10000, 12000, 15000};
        int[] jumlah = new int[4];
        int totalHarga = 0;

        System.out.println("Menu Makanan");
        System.out.println("================================");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + "\tRp" + harga[i]);
        }

        System.out.println("Masukkan jumlah pesanan untuk setiap menu:");

        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + ": ");
            jumlah[i] = input.nextInt();
            totalHarga += jumlah[i] * harga[i];
        }

        System.out.println("\n Silahkan Lakukan Pembayaran sebanyak: Rp" + totalHarga);
        
    }
}
