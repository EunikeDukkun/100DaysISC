package ISC100days;

import java.util.LinkedList;
import java.util.Queue;

public class Day59 {

    public static void main(String[] args) {

        //membuat object bertipe String bernama queue yang di implementasikan di class LinkedList
        Queue<String> queue = new LinkedList<>();
        //program untuk menambahkan elemen2 ke dalam LinkedList
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");

        //Program untuk menampilkan elemen-elemen yang telah di tambahkan ke dalam likedList
        System.out.println("Data dalam antrian: " + queue);

        // program untuk melihat apakah elemen ada dalam antrian atau tidak
        if (queue.contains("C")) {
            System.out.println("Data C ditemukan dalam antrian.");
        } else {
            System.out.println("Data C tidak ditemukan dalam antrian.");
        }

        //untuk melihat elemen yang berada pada posisi paling depan kita menggunakan "peek"
        String head = queue.peek();
        System.out.println("Elemen terdepan dalam antrian: " + head);

        //menghapus elemen terdepan
        String removedHead = queue.remove();
        System.out.println("elemen yang akan dihapus: " + removedHead);

        System.out.println("Data dalam antrian setelah menghapus satu elemen: " + queue);
    }
}
