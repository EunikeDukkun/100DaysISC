package ISC100days;

import java.util.HashMap;
import java.util.Map;

public class Day91 {

    public static void main(String[] args) {
        // Membuat objek HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Menambahkan elemen ke HashMap
        hashMap.put("Kucing", 4);
        hashMap.put("Anjing", 4);
        hashMap.put("Burung", 2);
        hashMap.put("Ikan", 0);

        // Menampilkan isi HashMap
        System.out.println("Isi HashMap: " + hashMap);

        // Mengakses nilai dengan kunci tertentu
        String kunci = "Kucing";
        int nilai = hashMap.get(kunci);
        System.out.println(kunci + " memiliki " + nilai + " kaki.");

        // Menghapus elemen dari HashMap
        hashMap.remove("Burung");

        // Menampilkan isi HashMap setelah penghapusan
        System.out.println("Isi HashMap setelah penghapusan: " + hashMap);
    }
}
