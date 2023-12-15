package ISC100days;

//Mengimpor library untuk penggunaan kelas-kelas terkait regex (regular expression)
//program ini menggunakan library Matcher dan Pattern
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day68 {

    public static void main(String[] args) {

        // Membuat objek pattern dengan pola "Informatika", dan mengabaikan perbedaan huruf besar-kecil
        Pattern pattern = Pattern.compile("Informatika", Pattern.CASE_INSENSITIVE);

        // Membuat objek matcher untuk mencocokkan pola dengan teks input
        Matcher matcher = pattern.matcher("Belajar informatika di Program Studi Informatika Unsulbar");

        // Memeriksa apakah ada kecocokan pola dalam teks input
        boolean matchFound = matcher.find();

        // Percabangan untuk menampilkan hasil ke layar berdasarkan keberhasilan pencocokan 
        if (matchFound) {
            System.out.println("match Found"); // Jika ada kecocokan, tampilkan pesan "match Found"
        } else {
            System.out.println("Match not Found"); // Jika tidak ada kecocokan, tampilkan pesan "Match not Found"
        }
    }
}
