package ISC100days;

import java.util.Scanner;

public class Day35 {

    public static void main(String[] args) {

        String nama = "nikee", sandi = "1234";

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Username : ");
        String username = sc.nextLine();
        System.out.println("masukkan password : ");
        String password = sc.nextLine();

        if (nama.equals(username) && sandi.equals(password)) {
            System.out.println("Login Sukses");
        } else {
            System.out.println("Password atau Username yang anda masukkan Kurang Tepat");
        }
    }
}
