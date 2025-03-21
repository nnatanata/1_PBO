/*
    Nama File   : Main.java
    Deskripsi   : Program untuk mengelola class BangunDatar, Persegi, dan Lingkaran
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 18 Maret 2024
*/

public class Main {
    public static void main(String[] args) {
        //Percobaan pembuatan objek
        //BangunDatar B1 = new BangunDatar(); // Error: Tidak bisa instansiasi abstract class
        BangunDatar P1 = new Persegi(10, "Merah", "Hitam");
        Persegi P2 = new Persegi(5, "Biru", "Putih");
        BangunDatar L1 = new Lingkaran(7, "Kuning", "Biru");
        Lingkaran L2 = new Lingkaran(14, "Hijau", "Merah");

        System.out.println("=== Informasi Persegi P1 ===");
        P1.printInfo();
        System.out.println();

        System.out.println("=== Informasi Persegi P2 ===");
        P2.printInfo();
        System.out.println();

        System.out.println("=== Informasi Lingkaran L1 ===");
        L1.printInfo();
        System.out.println();

        System.out.println("=== Informasi Lingkaran L2 ===");
        L2.printInfo();
        System.out.println();

        // Membandingkan Luas
        System.out.println("Apakah P1 memiliki luas yang sama dengan P2? " + P1.isEqualLuas(P2));
        System.out.println("Apakah L1 memiliki luas yang sama dengan L2? " + L1.isEqualLuas(L2));
        System.out.println("Apakah P1 memiliki luas yang sama dengan L1? " + P1.isEqualLuas(L1));
        System.out.println();

        // Membandingkan Keliling
        System.out.println("Apakah P1 memiliki keliling yang sama dengan P2? " + P1.isEqualKeliling(P2));
        System.out.println("Apakah L1 memiliki keliling yang sama dengan L2? " + L1.isEqualKeliling(L2));
        System.out.println("Apakah P1 memiliki keliling yang sama dengan L1? " + P1.isEqualKeliling(L1));
    }
}
