/*
    Nama File   : Lingkaran.java
    Deskripsi   : Kelas turunan dari BangunDatar yang merepresentasikan lingkaran
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 7 Juni 2025
*/

public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran(double jari) {
        this.jari = jari;
    }

    public double hitungKeliling() {
        return 2 * jari * 3.14;
    }
}
