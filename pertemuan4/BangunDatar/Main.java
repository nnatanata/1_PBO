/*
    Nama File   : Main.java
    Deskripsi   : Program untuk mengelola class BangunDatar
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 11 Maret 2024
*/

public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(7.0, "Kuning", "Biru");
        Persegi persegi = new Persegi(5.0, "Merah", "Hitam");

        System.out.println("=== Informasi Lingkaran ===");
        lingkaran.printInfo();
        System.out.println();

        System.out.println("=== Informasi Persegi ===");
        persegi.printInfo();
    }
}
