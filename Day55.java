package ISC100days;

import java.util.HashMap;

public class Day55 {

    public static void main(String[] args) {
        //membuat object bernama dataMahasiswa dalam HashMap dan mendefinisikan
        //key bertipe String dan value bertipe Integer 
        HashMap<String, Integer> dataMahasiswa = new HashMap();
        //untuk menambahkan key dan values (nama, angkatan) ke dalam HashMap
        //kita menggunakan put
        dataMahasiswa.put("nike", 21);
        dataMahasiswa.put("eu", 22);
        dataMahasiswa.put("eunike", 21);
        dataMahasiswa.put("ike", 19);
        dataMahasiswa.put("nick", 21);

        //program di bawah untuk mengakses dan menampilkan nilai berdasarkan key
        System.out.println("nick angkatan : " + dataMahasiswa.get("nick"));

        //Iterasi untuk menampilkan semua data di dalam HashMap
        System.out.println("Data Mahasiswa : ");
        for (String nama : dataMahasiswa.keySet()) {
            int angkatan = dataMahasiswa.get(nama);
            System.out.println(nama + ": angkatan " + angkatan);
        }

    }

}
