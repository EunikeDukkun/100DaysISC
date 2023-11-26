package ISC100days;

import java.util.HashSet;

public class Day49 {

    public static void main(String[] args) {
        //Struktur data HashSet(Struktur data unik yang dimana elemen di dalamnya tidak bisa sama
        HashSet<String> cars = new HashSet<String>();
        cars.add("Haechan");
        cars.add("Mark Lee");
        cars.add("DoYoung");
        cars.add("Jaehyun");
        cars.add("Jaemin");
        cars.add("Renjun");
        cars.add("Haechan");
        cars.add("Jaehyun");
        System.out.println(cars);

        System.out.println("cars.contains(\"Haechan\":" + cars.contains("Haechan"));

    }

}
