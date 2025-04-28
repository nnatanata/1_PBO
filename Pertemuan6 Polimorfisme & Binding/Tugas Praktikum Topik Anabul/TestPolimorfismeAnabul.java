/*
    Nama File   : TestPolimorfismeAnabul.java
    Deskripsi   : Kelas utama untuk mengetes konsep polimorfisme pada Anabul.
                  Membuat objek Kucing, Anjing, dan Burung, lalu memanggil method tampilData().
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 22 April 2025
*/

import java.util.ArrayList;

public class TestPolimorfismeAnabul {
    public static void main(String[] args) {
        Anabul anabul1 = new Kucing("Kucing");
        Anabul anabul2 = new Anjing("Anjing");
        Burung anabul3 = new Burung("Burung");

        ArrayList<Anabul> anabuls = new ArrayList<>();
        anabuls.add(anabul1);
        anabuls.add(anabul2);
        anabuls.add(anabul3);

        for (Anabul anabul : anabuls) {
            anabul.tampilData();
            System.out.println(); 
        }
    }
}
