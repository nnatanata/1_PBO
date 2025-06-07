/*
    Nama File   : PersegiPanjang.java
    Deskripsi   : Kelas yang merepresentasikan bangun datar persegi panjang.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 6 Mei 2025
*/
public class PersegiPanjang extends BangunDatar {
    private double panjang, lebar; // Atribut panjang dan lebar persegi panjang

    // Konstruktor tanpa parameter
    public PersegiPanjang() {
        this.panjang = 0;
        this.lebar = 0;
    }

    // Konstruktor dengan parameter
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Getter untuk panjang
    public double getPanjang() {
        return panjang;
    }

    // Setter untuk panjang
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    // Getter untuk lebar
    public double getLebar() {
        return lebar;
    }

    // Setter untuk lebar
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    // Implementasi metode untuk menghitung keliling
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    // Implementasi metode untuk menghitung luas
    public double hitungLuas() {
        return panjang * lebar;
    }
}
