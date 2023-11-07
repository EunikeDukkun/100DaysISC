package ISC100days;

public class Day30 {

    public static void main(String[] args) {
        int tinggi = 5; 

        for (int baris = 1; baris <= tinggi; baris++) {

            for (int spasi = 1; spasi < baris; spasi++) {
                System.out.print(" ");
            }
            for (int bintang = tinggi; bintang >= baris; bintang--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
