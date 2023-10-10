package ISC100days;

public class Day2 {

    public static void main(String[] args) {
        //perbedaan primitif dan non-primitif

        //Primitif
        //menyimpan nilai yang sebenarnya. Ini berarti bahwa variabel tipe data primitif menyimpan langsung angka, karakter, atau nilai boolean.
        //memerlukan sedikit ruang memori karena hanya menyimpan nilai mentah.
        //dapat melakukan operasi matematika langsung pada tipe data primitif tanpa perlu memanggil metode.
        //memiliki nilai default jika tidak diinisialisasi secara eksplisit. Misalnya, int akan memiliki nilai 0, dan boolean akan memiliki nilai false.
        //non-primitif
        //menyimpan referensi ke objek di dalam memori. Ini berarti bahwa variabel tipe data non-primitif tidak menyimpan nilai secara langsung, tetapi menyimpan alamat memori objek.
        //memerlukan lebih banyak ruang memori karena menyimpan objek dan metadata tambahan.
        //Untuk melakukan operasi pada tipe data non-primitif, perlu menggunakan metode yang disediakan oleh kelas objek tersebut. Misalnya, untuk menggabungkan dua String, perlu menggunakan metode concat() atau operator +.
        //memiliki nilai default null jika tidak diinisialisasi secara eksplisit.
        // Deklarasi variabel tipe data primitif
        int umur = 20; // Mendeklarasikan variabel 'umur' dengan tipe data primitif int dan memberikan nilai awal 25.
        double gaji = 50000.50; // Mendeklarasikan variabel 'gaji' dengan tipe data primitif double dan memberikan nilai awal 50000.50.
        char jenisKelamin = 'P'; // Mendeklarasikan variabel 'jenisKelamin' dengan tipe data primitif char dan memberikan nilai awal 'L'.
        boolean sudahMenikah = false; // Mendeklarasikan variabel 'sudahMenikah' dengan tipe data primitif boolean dan memberikan nilai awal false.
        long pendapatanTahunan = 1000000L; // Mendeklarasikan variabel 'pendapatanTahunan' dengan tipe data primitif long dan memberikan nilai awal 1000000L.

        // Deklarasi variabel tipe data non-primitif (String)
        String nama = "Eunike Dukkun"; // Mendeklarasikan variabel 'nama' dengan tipe data non-primitif (String) dan memberikan nilai awal "John Doe".

        // Deklarasi variabel tipe data non-primitif (Integer, Double, dan Boolean)
        Integer nilaiUjian = new Integer(95); // Mendeklarasikan variabel 'nilaiUjian' dengan tipe data non-primitif (Integer) dan memberikan nilai awal 90.
        Double tinggiBadan = new Double(151.5); // Mendeklarasikan variabel 'tinggiBadan' dengan tipe data non-primitif (Double) dan memberikan nilai awal 175.5.
        Boolean mahasiswa = new Boolean(true); // Mendeklarasikan variabel 'bekerja' dengan tipe data non-primitif (Boolean) dan memberikan nilai awal true.

        // Menampilkan variabel tipe data primitif 
        System.out.println("Umur: " + umur); // Menampilkan nilai variabel 'umur' ke layar dengan pesan "Umur: ".
        System.out.println("Gaji: " + gaji); // Menampilkan nilai variabel 'gaji' ke layar dengan pesan "Gaji: ".
        System.out.println("Jenis Kelamin: " + jenisKelamin); // Menampilkan nilai variabel 'jenisKelamin' ke layar dengan pesan "Jenis Kelamin: ".
        System.out.println("Sudah Menikah: " + sudahMenikah); // Menampilkan nilai variabel 'sudahMenikah' ke layar dengan pesan "Sudah Menikah: ".
        System.out.println("Pendapatan Tahunan: " + pendapatanTahunan); // Menampilkan nilai variabel 'pendapatanTahunan' ke layar dengan pesan "Pendapatan Tahunan: ".

        // Menampilkan variabel tipe data non-primitif 
        System.out.println("Nama: " + nama); // Menampilkan nilai variabel 'nama' (tipe data non-primitif) ke layar dengan pesan "Nama: ".
        System.out.println("Nilai Ujian: " + nilaiUjian); // Menampilkan nilai variabel 'nilaiUjian' (tipe data non-primitif) ke layar dengan pesan "Nilai Ujian: ".
        System.out.println("Tinggi Badan: " + tinggiBadan); // Menampilkan nilai variabel 'tinggiBadan' (tipe data non-primitif) ke layar dengan pesan "Tinggi Badan: ".
        System.out.println("Mahasiswa: " + mahasiswa); // Menampilkan nilai variabel 'bekerja' (tipe data non-primitif) ke layar dengan pesan "Bekerja: ".
    }
}
