
package ISC100days;

public class Day93 {
    
    public static void main(String[] args) {
        // Inisialisasi array
        int[] angka = {5, 2, 8, 1, 7};

        // Tampilkan array sebelum pengurutan
        System.out.print("Array sebelum pengurutan: ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println();

        // Pengurutan array (bubble sort)
        for (int i = 0; i < angka.length - 1; i++) {
            for (int j = 0; j < angka.length - i - 1; j++) {
                if (angka[j] > angka[j + 1]) {
                    // Tukar elemen jika kondisi terpenuhi
                    int temp = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = temp;
                }
            }
        }

        // Tampilkan array setelah pengurutan
        System.out.print("Array setelah pengurutan: ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println();
    }
}


