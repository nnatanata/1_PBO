/*
    Nama File   : Lingkaran.java
    Deskripsi   : Implementasi class Lingkaran sebagai subclass BangunDatar
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 11 Maret 2024
*/

public class Lingkaran extends BangunDatar {
    /***********ATRIBUT***************/
    private double jari;

    /***********METHOD***************/
    //Konstruktor tanpa parameter
    public Lingkaran() {
    }

    //Konstruktor dengan parameter
    public Lingkaran(double jari, String warna, String border) {
        super(warna, border, 0);
        this.jari = jari;
    }

    //Getter dan Setter
    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * (jari * jari);
    }

    public double getKeliling() {
        return 2 * (Math.PI * jari);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-Jari: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}