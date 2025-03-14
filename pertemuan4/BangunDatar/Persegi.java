/*
    Nama File   : Persegi.java
    Deskripsi   : Implementasi class Persegi sebagai subclass BangunDatar
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 11 Maret 2024
*/

public class Persegi extends BangunDatar {
    /***********ATRIBUT***************/
    private double sisi;

    /***********METHOD***************/
    //Konstruktor tanpa parameter
    public Persegi() {
        this.sisi = 0;
        setJmlSisi(4); 
    }

    //Konstruktor dengan parameter
    public Persegi(double sisi, String warna, String border) {
        super(warna, border, 4);
        this.sisi = sisi;
    }

    //Getter dan Setter
    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Diagonal: " + getDiagonal());
    }
}
