/*
    Nama File   : KoleksiAnabul.java
    Deskripsi   : Koleksi generik yang menyimpan objek turunan dari kelas Anabul.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 6 Mei 2025
*/

import java.util.ArrayList;

public class KoleksiAnabul {
    private ArrayList<Anabul> listAnabul;

    public KoleksiAnabul() {
        listAnabul = new ArrayList<>();
    }

    public void add(Anabul a) {
        listAnabul.add(a);
    }

    public void showAll() {
        for (Anabul a : listAnabul) {
            System.out.println("Nama: " + a.getNama());
            a.bersuara();
            a.gerak();
            System.out.println();
        }
    }
}
