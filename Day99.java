package ISC100days;

import java.util.Vector;

public class Day99 {

    public static void main(String[] args) {
        // Membuat objek Vector
        Vector<String> vector = new Vector<>();

        // Menambahkan elemen ke dalam Vector
        vector.add("Elemen 1");
        vector.add("Elemen 2");
        vector.add("Elemen 3");

        // Mengakses elemen berdasarkan indeks
        String elementAtIndex1 = vector.get(1);
        System.out.println("Elemen pada indeks 1: " + elementAtIndex1);

        // Menghapus elemen dari Vector
        vector.remove("Elemen 2");
        System.out.println("Vector setelah menghapus Elemen 2: " + vector);

        // Menampilkan seluruh elemen dalam Vector
        System.out.println("Isi Vector: " + vector);
    }
}
