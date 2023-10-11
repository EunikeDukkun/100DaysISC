package ISC100days;

public class Day3 {

    public static void main(String[] args) {

        //primitif ke string
        int number = 10;
        String str = String.valueOf(number);
        System.out.println(str);

        int umur = 20;
        String b = String.valueOf(umur);
        System.out.println(b);

        double gaji = 50000.50;
        String c = String.valueOf(gaji);
        System.out.println(c);

        char jenisKelamin = 'P';
        String d = String.valueOf(jenisKelamin);
        System.out.println(d);

        boolean sudahMenikah = false;
        String e = String.valueOf(sudahMenikah);
        System.out.println(e);

        long pendapatanTahunan = 1000000L;
        String f = String.valueOf(pendapatanTahunan);
        System.out.println(f);
        System.out.println("====================================================");

        //konversi string ke primitif
        String string = "10";
        int g = Integer.parseInt(string);
        System.out.println(g);

    }

}
