/*
    Nama File   : MapTest.java
    Deskripsi   : Program untuk menguji penggunaan struktur data Map di Java
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 7 Juni 2025
*/

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        // menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");

        // mengambil elemen pertama
        System.out.println(map.get(1));

        // mengambil seluruh kunci
        Set<Integer> key = map.keySet();

        // iterasi seluruh isi map
        for (Integer k : key) {
            System.out.println("Kunci: " + k + ", Nilai: " + map.get(k));
        }
    }
}
