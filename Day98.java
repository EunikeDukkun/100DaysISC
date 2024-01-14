package ISC100days;

public class Day98 {

    public static double keliling(float r) {
        // Hitung keliling lingkaran
        return 2 * Math.PI * r;
    }

    public static void main(String[] args) {
        // Masukan jari-jari lingkaran
        float r = 5;

        // Hitung diameter lingkaran
        float diameter = 2 * r;

        // Hitung keliling lingkaran
        double keliling = keliling(diameter);

        // Tampilkan hasil
        System.out.println("Keliling lingkaran dengan jari-jari " + r + " adalah " + keliling);
    }
}
