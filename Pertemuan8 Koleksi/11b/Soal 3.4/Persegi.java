/*
    Nama File   : Persegi.java
    Deskripsi   : Kelas yang merepresentasikan bangun datar persegi.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 6 Mei 2025
*/
public class Persegi extends BangunDatar {
    private double sisi; // Atribut untuk panjang sisi persegi

    // Konstruktor tanpa parameter
    public Persegi() {
        this.sisi = 0;
    }

    // Konstruktor dengan parameter
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    // Getter untuk sisi
    public double getSisi() {
        return sisi;
    }

    // Setter untuk sisi
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Implementasi metode untuk menghitung keliling
    public double hitungKeliling() {
        return 4 * sisi;
    }

    // Implementasi metode untuk menghitung luas
    public double hitungLuas() {
        return sisi * sisi;
    }
}
