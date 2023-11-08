package ISC100days;

import java.util.Scanner;

public class Day32 {

    public static void main(String[] args) {
        // split strinng ke array
        Scanner sc = new Scanner(System.in);
        String[] inputs = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Input nilai a ke-" + (i + 1) + ": ");
            inputs[i] = sc.nextLine();
        }

        System.out.println("a: " + String.join(", ", inputs));
    }
}
