
package ISC100days;

import java.util.HashMap;

public class Day50 {
    public static void main(String[] args) {
        //HashMap
        HashMap <String, String> IbuKotaNegara = new HashMap<String, String>();
        //menambahkan key dan value (negara, kota) menggunakan method put(key, value)
        IbuKotaNegara.put ("England", "London");
        IbuKotaNegara.put ("Germany", "Berlin");
        IbuKotaNegara.put ("Australia", "Camberra");
        IbuKotaNegara.put ("France", "Paris");
        IbuKotaNegara.put ("Dutch", "Amsterdam");
        IbuKotaNegara.put ("USA", "Washington, D.C.");    
        System.out.println(IbuKotaNegara);
        //untuk mengakses value dalam hashmap kita perlu memanggil key-nya
        System.out.println(IbuKotaNegara.get("Dutch"));
        

        
    }
    
}
