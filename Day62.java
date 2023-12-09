package ISC100days;

import java.util.HashMap;

public class Day62 {

    public static void main(String[] args) {
        //membuat object HashMap bernama people 
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        //menambahkan key dan values (nama, umur) dimana nama bertipe String sedangkan umur bertipe Integer
        people.put("Nike ", 20);
        people.put("laelia", 19);
        people.put("pinaa", 20);
        people.put("pitta", 20);

        //menampilkan isi dari HashMap
        for (String i : people.keySet()) {
            System.out.println("Key: " + i + " value: " + people.get(i));
        }
    }

}
