package ISC100days;

public class Day96 {

    public static void main(String[] args) {

        // Mendeklarasikan variabel n untuk menyimpan jumlah angka Fibonacci yang akan dicetak
        int n = 10;

        // Loop untuk mencetak angka Fibonacci dari 0 hingga n-1
        for (int i = 0; i < n; i++) {
            // Mencetak angka Fibonacci ke-i
            System.out.println(fibonacci(i));
        }
    }

    // Fungsi rekursif untuk menghitung angka Fibonacci ke-n
    static int fibonacci(int n) {

        // Kondisi basis untuk menghentikan rekursi:
        // Jika n adalah 0 atau 1, kembalikan n
        if (n == 0 || n == 1) {
            return n;
        } else {
            // Kondisi rekursif:
            // Menghitung angka Fibonacci ke-n dengan memanggil fungsi fibonacci() untuk (n-1) dan (n-2)
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}


