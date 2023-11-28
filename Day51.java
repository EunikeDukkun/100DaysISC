package ISC100days;

import java.util.LinkedList;
import java.util.Queue;

public class Day51 {

    public static void main(String[] args) {

        //Queue adalah Struktur data yang menyimpan data dengan prinsip FIFO
        //FIFO(First In First Out
        Queue<Double> myQueue = new LinkedList<>();

        //yang akan ditampilan pada baris program dibawah adalah Queue yang belum berisi elemen apapun
        System.out.println(myQueue);

        //untuk menambahkan elemen ke dalam Queue kita menggunakan offer
        myQueue.offer(3.14);
        myQueue.offer(3.15);
        myQueue.offer(3.16);
        System.out.println(myQueue);

        //poll digunakan untuk melihat, mengambil elemen dan sekaligus menghapusnya dari dalam Queue
        //elemen yang pertama dihapus adalah elemen yang berada paling depan dalam queue
        //jadi yang akan terhapus dalam program ini adalah elemen 3.14
        double value = myQueue.poll();
        System.out.println("POLL : " + value);
        System.out.println(myQueue);

        //peek digunakan untuk melihat elemen yang berada pada posisi terdepan dalam Queue
        //jadi elemen yang akan ditampilkan di sini adalah 3.15 karena kita telah menghapus elemen 3.14 pada program di bagian atas 
        value = myQueue.peek();
        System.out.println("PEEK : " + value);
        System.out.println(myQueue);

        //offer di sini digunakan untuk menambahkan elemen ke dalam Queue pada bagian akhir atau tail
        myQueue.offer(3.17);

        //jadi yang akan ditampilkan pada program ini adalah elemen 3.15, 3.16, 3.17
        System.out.println(myQueue);
    }

}
