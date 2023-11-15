package ISC100days;

import java.util.Scanner;

public class Day38 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan nilai s : ");
        int s = sc.nextInt();
        int luas = luasKubus(s);
        System.out.println(luas);

    }

    static int luasPersegi(int sisi) {
        return sisi * sisi;
    }

    static int luasKubus(int sisi) {
        return 6 * luasPersegi(sisi);
    }

}
