package ISC100days;

import java.util.LinkedList;

public class Day46 {

    public static void main(String[] args) {
        LinkedList<String> Listkata = new LinkedList<String>();

        Listkata.add("Kotak");
        Listkata.add("Meja");
        Listkata.addLast("Buku");
        Listkata.addFirst("Jalan");
        Listkata.add(2, "Informatika");
        Listkata.add(2, "Unsulbar");

        System.out.println(Listkata);

        Listkata.remove("Kotak");
        System.out.println(Listkata);

        Listkata.remove(3);
        System.out.println(Listkata);

        Listkata.removeFirst();
        System.out.println(Listkata);

        Listkata.removeLast();
        System.out.println(Listkata);

    }

}
