/*
    Nama File   : Datum.java
    Deskripsi   : Kelas generik yang menyimpan data dengan tipe bebas.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 29 April 2025
*/

public class Datum<T> {
    private T isi;

    // Konstruktor tanpa parameter
    public Datum() {
        this.isi = null;
    }

    // Konstruktor dengan parameter
    public Datum(T isi) {
        this.isi = isi;
    }

    // Getter
    public T getIsi() {
        return isi;
    }

    // Setter
    public void setIsi(T isi) {
        this.isi = isi;
    }
}
