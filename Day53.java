package ISC100days;

import java.util.Stack;

public class Day53 {

    public static void main(String[] args) {
        //membuat object bertipe String dengan nama "myStack" dalam Stack
        Stack<String> myStack = new Stack<>();
        //mengisi elemen-elemen ke dalam Stack menggunakan "push"
        myStack.push("Makan");
        myStack.push("Minum");
        myStack.push("Main");
        myStack.push("Mandi");

        //menampilkan elemen-elemen yanag telah kita masukkan pada program di atas ke dalam Stack
        for (String elemen : myStack) {
            System.out.println("elemen-elemen dalam Stack : " + elemen);

        }
        //pop digunaan untuk melihat, mengambil elemen sekaligus menghapusnya dari Stack
        //jadi elemen yang akan terhapus dalam program di bawah adalah elemen Mandi
        String value = myStack.pop();
        System.out.println("POP : " + value);
        System.out.println(myStack);

        //peek digunakan untuk melihat elemen yang berada pada posisi paling atas dalam stack
        //pada program di bawah yang akan di tampilkan adalah elemen "main"
        //karena elemen makan berada pada posisi paling atas dalam Stack
        value = myStack.peek();
        System.out.println("Peek : " + value);
        System.out.println(myStack);

    }

}
