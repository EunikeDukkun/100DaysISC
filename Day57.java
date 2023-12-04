package ISC100days;

public class Day57 {

    public static void main(String[] args) {

        //membuat array satu dimensi bertipe intejer
        int[] data = {10, 20, 30, 40, 50};

        // program berikut untuk mencetak data array menggunakan perulangan biasa
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        // Mencari data tertentu di array menggunakan percabangan dan perulangan
        int dataTercari = 30;
        boolean ditemukan = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == dataTercari) {
                ditemukan = true;
                break;
            }
        }

        //percabangan untuk menampilkan output dari percabangan di atas
        if (ditemukan) {
            System.out.println("Data " + dataTercari + " ditemukan.");
        } else {
            System.out.println("Data " + dataTercari + " tidak ditemukan.");
        }

        // program berikut untuk mengubah data di array
        data[0] = 100;

        // Mencetak data array yang telah diubah dengan penggunakan perulangan
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
