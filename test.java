/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISC100days;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class test {

    public static void main(String[] args) {
        int b;
        int totalpenjumlahan = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("nilai b");
        b = input.nextInt();
        for (int i = 0; i <= b; i++) {
            totalpenjumlahan=totalpenjumlahan+i;
           
        } System.out.println(totalpenjumlahan);
    }

}
