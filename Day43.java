package ISC100days;

public class Day43 {

    public static void main(String[] args) {
        int[] arrayGenap = new int[10];

        for (int i = 0, value = 2; i < 10; value += 2, i++) {
            arrayGenap[i] = value;

        }
        System.out.println("Array Genap : ");
        for (int num : arrayGenap) {
            System.out.println(num + " ");

        }

        int hasilPenjumlahan = 0;
        for (int num : arrayGenap) {
            hasilPenjumlahan += num;
        }
        System.out.println("\nHasil Penjumlahan array : " + hasilPenjumlahan);

    }

}
