/*
    Nama File   : ArrayListTest.java
    Deskripsi   : Program untuk menguji penggunaan ArrayList dengan tipe data String
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 7 Juni 2025
*/

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();

        // menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");

        // menghapus elemen
        strings.remove("praktikum");

        // iterasi pada seluruh ArrayList
        for (String s : strings) {
            System.out.print(s + " ");
        }
    }
}
