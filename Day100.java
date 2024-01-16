package ISC100days;

// Mengimpor kelas Random untuk menghasilkan angka acak
import java.util.Random;

public class Day100 {

    public static void main(String[] args) {
        // Membuat objek Random untuk menghasilkan angka acak
        Random random = new Random();
        //Array yang berisi kalimat random an akan di tampilkan
        String[] quotes = {
            "This is day 100 of 100 Days coding ISC",
            "The only way to do great work is to love what you do.",
            "If you can dream it, you can do it.",
            "The only person you are destined to become is the person you decide to be.",
            "The only way to fail is to give up.",
            "The best way to predict the future is to create it."
        };
        // Menghasilkan angka acak untuk memilih indeks kalimat di atas
        int randomIndex = random.nextInt(quotes.length);
        
        // Mencetak kalimat yang dipilih ke layar
        System.out.println(quotes[randomIndex]);
    }
}
