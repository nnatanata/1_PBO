/*
    Nama File   : BangunDatarGenerik.java
    Deskripsi   : Kelas generik untuk mendukung semua tipe bangun datar.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 6 Mei 2025
*/
public class BangunDatarGenerik<T1234 extends BangunDatar> extends BangunDatar {
    private T1234 bangunDatar; // Atribut untuk menyimpan objek bangun datar

    // Setter untuk objek bangun datar
    public void set(T1234 tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    // Getter untuk objek bangun datar
    public T1234 get() {
        return bangunDatar;
    }

    // Implementasi metode untuk menghitung keliling
    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }

    // Implementasi metode untuk menghitung luas
    public double hitungLuas() {
        return bangunDatar.hitungLuas();
    }
}
