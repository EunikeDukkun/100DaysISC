package ISC100days;

public class Day95 {

    public static void main(String[] args) {
        // Fungsi tanpa parameter dan tanpa nilai balik
        fungsiTanpaParameter();

        // Fungsi dengan parameter dan tanpa nilai balik
        fungsiDenganParameter(10, 20);

        // Fungsi tanpa parameter dan dengan nilai balik
        int hasil = fungsiDenganNilaiBalik();
        System.out.println("Hasil: " + hasil);
    }

    public static void fungsiTanpaParameter() {
        // Kode fungsi tanpa parameter dan tanpa nilai balik
        System.out.println("Ini adalah fungsi tanpa parameter dan tanpa nilai balik.");
    }

    public static void fungsiDenganParameter(int a, int b) {
        // Kode fungsi dengan parameter dan tanpa nilai balik
        System.out.println("Ini adalah fungsi dengan parameter dan tanpa nilai balik.");
        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);
    }

    public static int fungsiDenganNilaiBalik() {
        // Kode fungsi tanpa parameter dan dengan nilai balik
        int hasil = 10 + 20;
        return hasil;
    }
}
