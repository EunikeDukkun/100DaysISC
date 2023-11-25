package ISC100days;

import java.util.Stack;

public class Day48 {

    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack<>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(6);
        myStack.push(8);
        myStack.push(9);

        System.out.println("Isi : ");
        for (int i = 0; i < myStack.size(); i++) {
            System.out.println(myStack.get(i));

        }
        myStack.pop();

        // Menampilkan isi stack
        System.out.println("Isi stack setelah menghapus 1 elemen:");
        for (int i = 0; i < myStack.size(); i++) {
            System.out.println(myStack.get(i));
        }
    }
}
