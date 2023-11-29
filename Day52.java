package ISC100days;

import java.util.ArrayList;

public class Day52 {

    public static void main(String[] args) {

        //membuat method namaMahasiswa dalam ArrayList
        ArrayList<String> namaMahasiswa = new ArrayList<>();

        //menambahkan elemen-elemen ke dalam ArrayList
        namaMahasiswa.add("Eunike");
        namaMahasiswa.add("Nurlaelia");
        namaMahasiswa.add("Arfina");
        namaMahasiswa.add("Fitrah");

        //menampilkan nomor untuk setiap elemen namaMahasiswa
        System.out.println("Daftar nama Mahasiswa:");
        for (int i = 0; i < namaMahasiswa.size(); i++) {
            //untuk menampilkan nomor setiap elemen agar dimulai dari nomor satu i harus ditambahkan 1
            //jika tidak di tambah satu maka nomornya akan dimulai dari nol
            //namaMahasiswa.get(i) digunakan untuk mengambil elemen yang ada dalam method namaMahasiswa yang di mulai dari index 0-3
            System.out.println((i + 1) + ". " + namaMahasiswa.get(i));
        }

        //mProgram dibawah akan menghapus elemen "Fitrah" dalam ArrayList
        namaMahasiswa.remove(3);

        //menampilkan ArrayList setelah menghapus idex ke-3(Fitrah)
        System.out.println("Daftar anime setelah menghapus dua indeks:");
        for (int i = 0; i < namaMahasiswa.size(); i++) {
            System.out.println((i + 1) + ". " + namaMahasiswa.get(i));
        }

        //mnambahkan kembali elemen Fitrah ke dalam ArryayList
        namaMahasiswa.add(3, "Fitrah");
        //mengubah elemen Eunike jadi elemen Nike
        namaMahasiswa.set(0, "Nike");
        System.out.println("Daftar Nama Mahasiswa setelah menambah elemen baru dan mengganti elemen lama");
        for (int i = 0; i < namaMahasiswa.size(); i++) {
            System.out.println((i + 1) + ". " + namaMahasiswa.get(i));
        }
    }
}
