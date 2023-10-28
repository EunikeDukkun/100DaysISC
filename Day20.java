
package ISC100days;

import java.util.Scanner;

public class Day20 {
    public static void main(String[] args) {
        String lampu;
        Scanner input = new Scanner(System.in);
        
        System.out.println("input nama warna: ");
        lampu = input.nextLine();
        
        switch(lampu){
            case"merah":
                System.out.println("Lmapu Merah.Berhenti");
                break;
                
            case"kuning":
                System.out.println("Lmapu Kuning. Harap Hati-Hati");
                break;
            case"hijau":
                System.out.println("Lampu Hijau. Silahkan jalan");
                break;
            default:
                System.out.println("Lampu Salah");
        }
    }
}
