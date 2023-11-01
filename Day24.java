package ISC100days;

public class Day24 {

    public static void main(String[] args) {
        double radius = 5.0; // Ganti nilai radius sesuai kebutuhan
        double luas = hitungluas(radius);
        double keliling = hitungkeliling(radius);

        System.out.println("Luas lingkaran: " + luas);
        System.out.println("Keliling lingkaran: " + keliling);
    }

    //penggunaan method static
    static double luas;
    static double keliling;

    static double hitungluas(double radius) {
        luas = Math.PI * radius * radius;
        return luas;
    }

    static double hitungkeliling(double radius) {
        keliling = 2.0 * Math.PI * radius;
        return keliling;
    }
}
