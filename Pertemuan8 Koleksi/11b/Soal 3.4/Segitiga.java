/*
    Nama File   : Segitiga.java
    Deskripsi   : Kelas yang merepresentasikan bangun datar segitiga.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 6 Mei 2025
*/
public class Segitiga extends BangunDatar {
    private double alas, tinggi, sisiA, sisiB, sisiC; // Atribut segitiga: alas, tinggi, dan sisi

    // Konstruktor tanpa parameter
    public Segitiga() {
        this.alas = 0;
        this.tinggi = 0;
    }

    // Konstruktor dengan parameter
    public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    // Implementasi metode untuk menghitung keliling
    public double hitungKeliling() {
        return sisiA + sisiB + sisiC;
    }

    // Implementasi metode untuk menghitung luas
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}
