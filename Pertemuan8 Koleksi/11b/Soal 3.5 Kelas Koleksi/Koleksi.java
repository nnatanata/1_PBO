/*
    Nama File   : Koleksi.java
    Deskripsi   : Kelas generik Koleksi untuk menyimpan data dinamis dengan berbagai metode.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 6 Mei 2025
*/

import java.util.ArrayList;

public class Koleksi<T> {
    private int nbelm;
    private ArrayList<T> wadah;

    // Konstruktor tanpa parameter
    public Koleksi() {
        this.nbelm = 0;
        this.wadah = new ArrayList<>();
    }

    // Setter
    public void setIsi(int index, T elemen) {
        wadah.set(index, elemen);
    }

    public void setSize(int size) {
        this.nbelm = size;
    }

    // Getter
    public T getIsi(int index) {
        return wadah.get(index);
    }

    public int getSize() {
        return nbelm;
    }

    // Menambahkan elemen ke dalam koleksi dan menambah jumlah elemen
    public void add(T elemen) {
        wadah.add(elemen);
        nbelm++;
    }

    // Menghapus elemen dari koleksi berdasarkan indeks dan mengurangi jumlah elemen
    public void delete(int index) {
        wadah.remove(index);
        nbelm--;
    }

    // Menampilkan semua elemen dalam koleksi
    public void showAll() {
        for (T elemen : wadah) {
            System.out.println(elemen);
        }
    }
}
