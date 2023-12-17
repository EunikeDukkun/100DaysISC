package ISC100days;

//mengimpor kelas Matcher dari paket java.utul.regex
import java.util.regex.Matcher;
//mengimpor kelas Pattern
import java.util.regex.Pattern;

public class Day70 {

    public static void main(String[] args) {
        //mendefinisikan variabel "text" sebagai String dengan nilai awal kalimat yang ada dalam kutip di bawah
        String text = "Program Studi Teknik Informatika, Fakultas Teknik; Universitas Sulawesi Barat";
        //membuat object pattern dengan pola"."
        Pattern p = Pattern.compile(".");
        Matcher m = p.matcher(text);//Membuat objek Matcher dengan string "text" sebagai argumen.
        String text01 = "";//Mendefinisikan variabel text01 sebagai string kosong
        //Melakukan pencarian pada string text menggunakan objek Matcher m 
        //Jika karakter yang ditemukan adalah huruf “a”, maka karakter “x” akan ditambahkan ke variabel text01. 
        //Jika tidak, karakter yang ditemukan akan ditambahkan ke variabel text01
        while (m.find()) {
            String c = m.group();
            if (c.equalsIgnoreCase("a")) {
                text01 += "x";
            } else {
                text01 += c;
            }
        }
        //Mencetak isi variabel text01
        //jadi yang akan dicetak nantinya ini adalah kalimat sesuai yang d masukkan diatas 
        //tapi huruf "a" akan diganti menjadi huruf "x"s
        System.out.println(text01);
    }

}
