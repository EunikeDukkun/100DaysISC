package ISC100days;

import java.util.HashSet;

public class Day54 {

    public static void main(String[] args) {
        //membuat object bernama buah bertipe string dalam HashSet
        HashSet<String> buah = new HashSet<>();

        //ntuk menambahkan elemen-elemen ke dalam hashSet kita menggunakan "add"
        buah.add("Jeruk");
        buah.add("Mangga");
        buah.add("Apel");
        buah.add("Kurma");
        buah.add("Nangka");
        System.out.println(buah);

        //untuk menghapus/membersihan semua elemen dari HashSet kita dapat menggunakan "clear"
        buah.clear();
        System.out.println(buah);

    }

}
