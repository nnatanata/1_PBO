/*
    Nama File   : Main.java
    Deskripsi   : Program untuk mengelola class BangunDatar dan menguji IResize
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 18 Maret 2024
*/

public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(7.0, "Kuning", "Biru");
        Persegi persegi = new Persegi(5.0, "Merah", "Hitam");

        System.out.println("=== Informasi Lingkaran Sebelum Resize ===");
        lingkaran.printInfo();
        System.out.println();

        System.out.println("=== Informasi Persegi Sebelum Resize ===");
        persegi.printInfo();
        System.out.println();

        lingkaran.zoomIn();
        persegi.zoomOut();

        System.out.println("=== Informasi Lingkaran Setelah zoomIn() ===");
        lingkaran.printInfo();
        System.out.println();

        System.out.println("=== Informasi Persegi Setelah zoomOut() ===");
        persegi.printInfo();
        System.out.println();

        lingkaran.zoom(150); 
        persegi.zoom(75);    

        System.out.println("=== Informasi Lingkaran Setelah zoom(150) ===");
        lingkaran.printInfo();
        System.out.println();

        System.out.println("=== Informasi Persegi Setelah zoom(75) ===");
        persegi.printInfo();
    }
}
