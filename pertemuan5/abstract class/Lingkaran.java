/*
    Nama File   : Lingkaran.java
    Deskripsi   : Implementasi class Lingkaran sebagai subclass BangunDatar
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 18 Maret 2024
*/

public class Lingkaran extends BangunDatar {
    /***********ATRIBUT***************/
    private double jari;

    /***********METHOD***************/
    //Konstruktor
    public Lingkaran(double jari, String warna, String border) {
        super(warna, border);
        this.jari = jari;
    }

    //Getter dan Setter
    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    //Implementasi Abstract Method
    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    //Method untuk mencetak informasi
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}
