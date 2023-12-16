import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    
        String nama;
        int usia, jumlah;
        Scanner scanner = new Scanner(System.in);

        //HashMap
        HashMap<String, Integer> mahasiswa = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan Nama: ");
            nama = scanner.nextLine();
            System.out.print("Masukkan Usia: ");
            usia = scanner.nextInt();
            mahasiswa.put(nama, usia);
            scanner.nextLine();
        }

        //HashSet
        HashSet<String> namaSet = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Nama: ");
            nama = scanner.nextLine();
            namaSet.add(nama);
        }

        System.out.println("HashMap :");
        for (String namaMhs : mahasiswa.keySet()) {
            System.out.println(namaMhs + " : " + mahasiswa.get(namaMhs));
        }

        System.out.println("HashSet :");
        for (String namaMhs : namaSet) {
            System.out.println(namaMhs);
        }
    }
}